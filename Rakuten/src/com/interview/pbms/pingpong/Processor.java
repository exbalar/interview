package com.interview.pbms.pingpong;

import java.util.HashMap;
import java.util.Map;

/**
 * @author subramanian.ramar
 *
 */
public class Processor {
	
	public static String calculate(int numberofPeople, int [][] timerange) {
		Map<String,Integer> output = new HashMap<>();
			for (int i = 0 ; i < numberofPeople ; i++) {
				Integer startTime = timerange[i][0];
				Integer endTime = timerange[i][1];
				for (int item = startTime; item < endTime ; item ++) {
					if (!(item < 9) && !(item > 18)) {
						String key = item + "";
						if (output.containsKey(key)) {
							Integer currentCount = output.get(key);
							Integer sum = currentCount.intValue() + 1;
							output.put(key,sum);
						}else {
							output.put(key, new Integer("1"));
						}
					}
				}
				
			}
			int singlesCount =0; 
			int doublesCount =0; 
			for (Integer res : output.values()) {
				if (res.intValue() >= 4) {
					doublesCount ++;
				}else if(res.intValue() >= 2){
					singlesCount ++;
				}
			}
			return singlesCount +" "+ doublesCount;
		
	}

}

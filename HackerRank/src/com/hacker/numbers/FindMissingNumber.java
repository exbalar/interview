package com.hacker.numbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class FindMissingNumber {
	static int[] missingNumbers(int[] arr, int[] brr) {
        // Complete this function
		int max = (arr.length > brr.length) ? arr.length : brr.length;
		Arrays.sort(arr);
		Arrays.sort(brr);
		HashSet<String> output = new HashSet<>();
		int[] out = null;
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		for (int i =0; i < max-1; i++) {
			if (i < arr.length-1 && arr[i] == arr[i+1]) {
				if (map1.containsKey(""+arr[i])) {
					map1.put(""+arr[i],map1.get(""+arr[i]).intValue()+1);
				}else {
					map1.put(""+arr[i],1);
				}
			}
			if (i < brr.length-1 && brr[i] == brr[i+1]) {
				if (map2.containsKey(""+brr[i])) {
					map2.put(""+brr[i],map2.get(""+brr[i]).intValue()+1);
				}else {
					map2.put(""+brr[i],1);
				}
			}
		}
		System.out.println(map1 + "next"+ map2);
		Iterator i1 = map1.entrySet().iterator();
		int index = 0;
		while(i1.hasNext()) {
			Entry<String, Integer> entry = (Entry<String, Integer>)i1.next();
			if (map2.containsKey(entry.getKey()) && (entry.getValue().intValue() != map2.get(entry.getKey()).intValue())) {
				if (out == null) {
					out = new int[1];
					out[0] = Integer.valueOf(entry.getKey()).intValue();
				} else  {
					//int tmp[] = out;
					//out = new int[out.length+1];
					out = Arrays.copyOf(out, out.length+1);
					out[out.length-1] = Integer.valueOf(entry.getKey()).intValue();
				}
			}
		}
		/*for (int i =0; i < arr.length; i++) {
			for(int j=0; j< brr.length; j++) {
				if(arr[i] == brr[j]) {
				
					if (out == null) {
						out = new int[1];
						out[0] = arr[i];
					} else if (!output.contains(""+arr[i])) {
						//int tmp[] = out;
						//out = new int[out.length+1];
						out = Arrays.copyOf(out, out.length+1);
						out[out.length-1] = arr[i];
					}
					output.add(""+arr[i]);
					
				}
			}
		}*/
		Arrays.sort(out);
		return out;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] brr = new int[m];
        for(int brr_i = 0; brr_i < m; brr_i++){
            brr[brr_i] = in.nextInt();
        }
        int[] result = missingNumbers(arr, brr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}

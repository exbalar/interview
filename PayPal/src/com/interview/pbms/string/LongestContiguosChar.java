package com.interview.pbms.string;

import org.omg.CORBA.CurrentOperations;

public class LongestContiguosChar {

	
	public static void main(String[] args) {
		int [] charArray = new int [256];
		String input = "abcadefaazyxwvuqaaaamnopghijk";
		for (int i=0;i < charArray.length ; i++ ) {
			charArray[i] = -1;
		}
		int prev_index;
		int current_length =1;
		int max_length =1;
		charArray[input.charAt(0)] = 0;
		int startIndex = 0;
		int endIndex = -1;
		for (int i=1;i < input.length() ; i++ ) {
			prev_index = charArray[input.charAt(i)];
			System.out.println();
			System.out.println("prev_index:"+ charArray[input.charAt(i)]);
			System.out.println("i-current_length:"+ (i-current_length)+ " i:" + i);
			System.out.println("char:"+(input.charAt(i)));
			if (prev_index == -1 /*|| i-current_length > prev_index*/) {
				endIndex = i;
				current_length++;
				System.out.println("IF");
			}else {
				System.out.println("ELSE");
				if (current_length > max_length) {
					max_length = current_length;
				}
				current_length = i - prev_index;
				startIndex = (i - current_length ) + 1;
				endIndex = i;
			}
			charArray[input.charAt(i)] = i;
		}
		if (current_length > max_length) {
			max_length = current_length;
		}
		System.out.println("max length:"+ max_length);
		System.out.println("length:"+ startIndex + ":" + endIndex);
		System.out.println("substing:" + input.substring(startIndex,endIndex+1));
	}

}

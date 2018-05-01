package com.interview.pbms.string;

public class ReverseAString {

	public static void main(String[] args) {

		String input = "abcdef";
		char[] charArray = input.toCharArray();
		int right = charArray.length-1;
		for(int i=0; i< right; i++) {
			char leftcha = charArray[i];
			char rightcha = charArray[right];
			charArray[i] = rightcha;
			charArray[right] = leftcha;
			right--;
		}
		System.out.println(new String(charArray));
		System.out.println(charArray.toString().substring(1,charArray.toString().length()-1).replace(", ", ""));
	}

}

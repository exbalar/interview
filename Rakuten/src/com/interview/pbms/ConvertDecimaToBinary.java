package com.interview.pbms;

public class ConvertDecimaToBinary {

	public static void main(String[] args) {

		String output = "";
		int input= 19;
		while (input > 0) {
			int a = input % 2;
			output = a + output;
			input = input /2;
		}
		System.out.println(output);
	}

}

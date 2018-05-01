package com.hcl.interviews;

import java.util.ArrayList;
import java.util.List;
/* This class is used for expressing a positive integer as a sum of its decimal components */
public class DecimalDigitImpl implements DecimalDigit{
		/* This method is used for calculating the each decimal point and produces the output */
	@Override
	public int[] getDecimalDigit(int inp) {


		//Convert the int as String to process easier
		String inputAsString = new Integer(inp).toString();
		//Convert the String to char array to iterate each char and apply the logic
		char [] inputAschar = inputAsString.toCharArray();
		// extract the number of zero present in the string
		long count = inputAsString.chars().filter(character -> character == '0').count();
		//initialise the output array using the expected size
		int [] output = new int[inputAschar.length-(int)count];
		//initialise the outputLength and exponent value
		int outputLength =inputAschar.length-(int)count-1;
		int power = 0;
		for(int i =inputAschar.length-1; i>=0;i--) {
			// Checks if the char is non -zero, then consider it for output
			if(inputAschar[i] !='0') {
				// calculates the value of the position and puts into output array
				output[outputLength--] = Character.getNumericValue(inputAschar[i]) * (int) Math.pow(10, power);
			}
			//increments the power value as the position changes
			power = power + 1;
			
		}
		return output;
	}
}

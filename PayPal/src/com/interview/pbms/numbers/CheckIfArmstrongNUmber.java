package com.interview.pbms.numbers;

public class CheckIfArmstrongNUmber {

	static int order(int input) {
		int n =0;
		while(input != 0) {
			n++;
			input = input/10;
		}
		return n;
	}
	
	static boolean isArmstrong(int input) {
		int n = order(input);
		int sum =0;
		int temp = input;
		while(temp != 0) {
	         int r = temp%10;
	         sum = (int) (sum + Math.pow(r,n));
	         temp = temp/10;
	         System.out.println("R:"+ r + "sum: "+ sum + "temp: "+ temp);
		}
		 return (sum == input);
	}
	public static void main(String[] args) {

		int input = 153;
		System.out.println(isArmstrong(input));
		
	}

}

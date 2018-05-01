package com.hacker.string;

public class PasswordCheck {
	static int minimumNumber(int n,String s) {
		int out =0;
		if (!s.matches("(.*)[a-z](.*)")) {
			out++;
		}
		if (!s.matches("(.*)[A-Z](.*)")) {
			out++;
		}
		 if (!s.matches("(.*)(\\d)(.*)")) {
			 out++; 
		 }
		 if (!s.matches("(.*)(\\W)(.*)")) {
			 out++; 
		}
		if(n+out < 6 ) {
			out=out+(6 - (out+n));
		}

		return out;
	}

	public static void main(String[] args) {
		System.out.println(minimumNumber(10,"%Bbala12"));
	}

}

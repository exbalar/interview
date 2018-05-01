package com.interview.pgms;

public class Palindrome {

	static boolean isPalindrome(String s) {
		  int n = s.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (s.charAt(i) != s.charAt(n - i - 1)) {
		         return false;
		     }
		  }

		  return true;
		}
	static boolean isAlmostPalindrome(String s) {
		  int n = s.length();
		  int allowOnce = 0;
		  for (int i = 0; i < (n/2); ++i) {
		     if (s.charAt(i) != s.charAt(n - i - 1) ) {
		    	 allowOnce ++;
		     }
		     if (s.charAt(i) != s.charAt(n - i - 1) && allowOnce > 1) {
		         return false;
		     }
		  }

		  return true;
		}
	public static void main(String[] args) {
		System.out.println(isAlmostPalindrome("aaramarbb"));
	}

}

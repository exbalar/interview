package com.interview.pbms;

public class FindConnectedFriednds {
	
	static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	static int find(int n) {
		int groupCount =1;
		for (int i=3; i <= n; i++) {
			if (isPrime(i)) {
				//System.out.println(i);
			}
			if (isPrime(i) && n/i < 2) {
				groupCount ++;
			}
		}
		return groupCount;
	}
	public static void main(String[] args) {
		System.out.println(find(10));
	}

}

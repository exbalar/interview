package com.java.common.pgming.challenge;

public class FindSumofOddFactors {

	 static int sumofoddFactors(int n)
	    {
	        // Traversing through 
	        // all prime factors.
	        int res = 1;
	     
	        // ignore even factors by
	        // removing all powers
	        // of 2
	        while (n % 2 == 0)
	            n = n / 2;
	     
	        for (int i = 3; i <= Math.sqrt(n); i++)
	        {
	     
	            // While i divides n, print i 
	            // and divide n
	            int count = 0, curr_sum = 1;
	            int curr_term = 1;
	            while (n % i == 0)
	            {
	                count++;
	     
	                n = n / i;
	     
	                curr_term *= i;
	                curr_sum += curr_term;
	            }
	     
	            res *= curr_sum;
	             
	        }
	     
	        // This condition is to handle
	        // the case when n is a 
	        // prime number.
	        if (n >= 2)
	            res *= (1 + n);
	     
	        return res;
	    }
	static int sumOfOddFactors(int number) {
	
		int sum =0;
		for (int i=1; i <=number ; i++) {
			if(number%i==0 && i%2 !=0) {
				sum = sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		System.out.println(sumOfOddFactors(19));
		System.out.println(System.currentTimeMillis());
		System.out.println(sumofoddFactors(19));
		System.out.println(System.currentTimeMillis());
	}

}

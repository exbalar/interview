package com.interview.pbms;

public class ConnectedGroup {
	
	
	 static boolean isPrime(int n)
	    {
	        // Corner cases
	        if (n <= 1) return false;
	        if (n <= 3) return true;
	     
	        // This is checked so that we can skip 
	        // middle five numbers in below loop
	        if (n % 2 == 0 || n % 3 == 0) {
	        	return false;
	        }
	     
	        for (int i = 5; i * i <= n; i = i + 6) {
	            if (n % i == 0 || n % (i + 2) == 0) {
	            	return false;
	            }
	        } 
	     
	        return true;
	    }
    static int countPrime(int n)
    {
    	int count = 0;
        // Corner cases
        //if (n <= 1) return false;
        if (n <= 3) {
        	count = 2;
        }
     
        // This is checked so that we can skip 
        // middle five numbers in below loop
	        if (n % 2 == 0 || n % 3 == 0)
	        	{
	        	//count = count+2;
	        	}
     
	        for (int i = 5; i * i <= n; i = i + 6) {
	            if (n % i == 0 || n % (i + 2) == 0)
	            {
	            	
	            } else {
	            	count++;
	            }
	        }
     
        return count;
    }
    
    public static int isPrimeCount(int number){
    	int count =0;
        for(int i=2; i<number; i++){
           if(number%i == 0){
               //return 0; //number is divisible so its not prime
           }
        }
        return 0; //number is prime now
    }

	public static void main(String[] args) {
		System.out.println(countPrime(10));

	}

}

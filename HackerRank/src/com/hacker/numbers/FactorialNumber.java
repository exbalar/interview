package com.hacker.numbers;

public class FactorialNumber {
    static int factorial(int n){
    	System.out.println("Enters");
          if (n == 1) { 
        	  System.out.println("Ends here");
            return 1; 
          }
          else {  
        	  System.out.println("Ends ");
            return(n * factorial(n-1));  
          }
    }	  
	public static void main(String[] args) {  
	System.out.println("Factorial of 5 is: "+factorial(5));  
	}  
}

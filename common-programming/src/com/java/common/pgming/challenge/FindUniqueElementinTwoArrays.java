package com.java.common.pgming.challenge;

public class FindUniqueElementinTwoArrays {

	static int getUnique(int a[], int b[]) {
		int ret =0;
		int i;
		for(i=0; i< a.length;i++) {
			ret = ret ^ a[i] ^ b[i];
		}
		
		return ret ^ b[i];
	}
	
	public static int getUniqueElement(int[] a, int[] b) {
	    int ret = 0;
	    for (int i = 0; i < a.length; i++) {
	        ret += a[i];
	    }
	    for (int i = 0; i < b.length; i++) {
	        ret -= b[i];
	    }
	    return Math.abs(ret);
	}
	public static void main(String[] args) {
		int []a = {1,2,3,5,7,8,6,4};
		int []b = {1,2,3,5,7,8,6,4,9};
		//System.out.println(getUnique(a,b));
		System.out.println(getUniqueElement(a,b));
		
	}

}

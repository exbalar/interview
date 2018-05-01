package com.java.common.pgming.challenge;

public class FindMaxProductsofTwoElements {

	static int findMaxProduct (int arr[]) {
		int highestA = Integer.MIN_VALUE,highestB=Integer.MIN_VALUE;
		for (int i=0; i < arr.length ; i++) {
			if (arr[i] > highestA) {
				highestB=highestA;
				highestA=arr[i];
			}else if (arr[i] > highestB) {
				highestB = arr[i];
			}
		}
		
		return highestA*highestB;
	}
	public static void main(String[] args) {
		int []b = {1,2,3,5,7,8,6,4,9};
		System.out.println(findMaxProduct(b));
	}

}

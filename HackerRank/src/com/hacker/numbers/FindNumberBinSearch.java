package com.hacker.numbers;

public class FindNumberBinSearch {

	static int binarySearch(int arr[], int low, int high, int numberToFind) {
		
		if (high > low) {
			int mid = (high+low)/2;
			if (arr[mid] == numberToFind) {
				return arr[mid];
			}
			if (numberToFind > arr[mid] ) {
				return binarySearch(arr, mid+1, high, numberToFind);
			}
			if (numberToFind < arr[mid] ) {
				return binarySearch(arr, low, mid-1, numberToFind);
			}
		}
		return -1;		
	}
	public static void main(String[] args) {
		int array[] = {2,1,5,7,8,9};
		System.out.println(binarySearch(array,0,array.length-1,12));
	}

}

package com.hacker.numbers;

import java.util.Arrays;
import java.util.Scanner;

public class FindPairs {
	
	static int binarySearch(int arr[], int low, int high, int diffNumber) {
		if (high>low) {
			int mid = (low+high)/2;
			if (diffNumber == arr[mid] ) {
				return arr[mid];
			}
			if (diffNumber > arr[mid] ) {
				return binarySearch(arr, mid+1, high, diffNumber);
			}else {
				return binarySearch(arr, low, mid-1, diffNumber);
			}
		}
		return -1;
	}
    static int pairs(int k, int[] arr) {
        // Complete this function
    	Arrays.sort(arr);
		int count=0;
    	for (int i=0; i < arr.length ;i++) {
    		if(binarySearch(arr, i, arr.length, arr[i]+k) != -1) {
				count++;
    		}
    	}
    	return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = pairs(k, arr);
        System.out.println(result);
        in.close();
    }
}

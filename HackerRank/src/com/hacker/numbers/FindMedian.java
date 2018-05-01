package com.hacker.numbers;

import java.util.Arrays;
import java.util.Scanner;

public class FindMedian {

    static int findMedian(int[] arr) {
        // Complete this function
        Arrays.sort(arr);
        int mid = arr.length/2;
        int rem = arr.length%2;
        if (rem != 0) {
        	//mid = mid +1;
        	//System.out.println("here");
        	return arr[mid];
        } else {
        	return (arr[mid] + arr[mid-1])/2;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = findMedian(arr);
        System.out.println(result);
        in.close();
    }

}

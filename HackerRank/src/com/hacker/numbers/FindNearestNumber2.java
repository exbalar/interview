package com.hacker.numbers;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindNearestNumber2 {

	static int[] closestNumbers(int[] arr) {
		Arrays.sort(arr);
		// Complete this function
        int out [] = null;
        int min = 0;
        //int isFirstflag = 0;
      //  for (int i =0 ; i < arr.length; i++){
            for(int j =0; j < arr.length-1 ; j++){
                //if (i != j){
                    int diff = (arr[j]) - (arr[j+1]);
                    if(diff < 0) {
                    	diff = (-diff);
                    }
                    System.out.println("Print::"+diff+"min:"+min);
                    boolean isFirstflag = false;
                    if (out == null)
                    {
                       out = new int[2];
                       //if(arr[j] > arr[j+1]) {
                    	   out [0] = arr[j]; 
                    	   out [1] = arr[j+1]; 
                      // } else {
                    	  // out [0] = arr[j]; 
                    	   //out [1] = arr[i]; 
                      // }
                       min = diff;
                       isFirstflag = true;
                    }
                    if (!isFirstflag && diff == min){
                    	int temp [] = out;
                    	int tempCount = out.length;
                    	System.out.println("length::"+tempCount);
                        out = new int[out.length+2]; 
                        //if(arr[j] > arr[i]) {
	                 	   out [0] = arr[j]; 
	                 	   out [1] = arr[j+1]; 
                        //} else {
                     	   //out [0] = arr[j]; 
                     	   //out [1] = arr[i]; 
                        //}
                        for (int k = 0 ; k < temp.length; k++) {
                        	out[k+2] = temp[k];
                        }
                        min = diff;
                    }else if (diff < min){
                        out = new int[2];
	                 	out [0] = arr[j]; 
	                 	out [1] = arr[j+1]; 
                        min = diff;
                    }

                //}
            }
       // }
        Arrays.sort(out);
        return out;
    }
	   // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = closestNumbers(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}

package com.hacker.numbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class IceCreamParlor {
	
	
	static Set<Integer> numSearch(int []arr,int arrLength,int n) {
		HashSet<Integer> set = new HashSet<>();
		for (int i=0; i< arrLength;i++) {
			if (arr[i] == n) {
				set.add(i);
			}
		}
		return set;
	}

    static int binSearch(int arr[], int startIndex,int endIndex, int num){
        if (endIndex > startIndex) {
	    	int midIndex = (startIndex+endIndex)/2;
	        int mid = arr[midIndex];
	        
	        if (mid == num){
	        	//System.out.println("Mid value::"+mid);
	            return midIndex;
	        }
	        
	        if (num > mid){
	            return binSearch(arr,midIndex+1,endIndex,num);
	        }
	        
	        if (num < mid){
	            return binSearch(arr,startIndex,midIndex-1,num);
	        }
        }
        return -1;
    }

    static int[] icecreamParlor(int m, int[] arr) {
        // Complete this function
        int [] output = null;
        //int count =0;
        int tempArr[] = new int[arr.length]; 
        tempArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        /*System.out.println(arr.toString());
        for (int i: arr) {
        	System.out.println(i);
        }
        for (int i: tempArr) {
        	System.out.println("temp:"+i);
        }*/
        String flavorIds = null;
        for (int i=0; i< arr.length; i++){
            int iValue = arr[i] - m;
           // System.out.println("iValue:"+iValue);
            if (iValue < 0){
                iValue = - (iValue);
            }else {
            	continue;
            }
            //System.out.println("Index::above"+i);
            int res = binSearch(arr,0,arr.length,iValue) ;
            if (res != -1 /*&& res != i*/){
            	//System.out.println("Index::"+i+"res::"+res);
            	//if (output.length-1 == count) {
            		//output = Arrays.copyOf(output, count+1);
            	//}
                //output[count]= res;
                //count++;
            	if (flavorIds != null) {
            		flavorIds=flavorIds+" "+arr[res];
            	}else {
            		flavorIds=""+arr[res];
            	}
            			
            }
        }
        output = new int[flavorIds.split(" ").length];
        String[] tokens = flavorIds.split(" ");
        Set<Integer> set= new TreeSet<>();
        for (int i=0;i < tokens.length ; i++) {
        	set.addAll(numSearch(tempArr, tempArr.length, Integer.valueOf(tokens[i]).intValue()));
        }
        int counter=0;
        for (Integer i : set) {
        	//output[counter++]=i.intValue()+1;
            System.out.print((i+1) + (counter != set.size()-1 ? " " : ""));
            counter++;
        }
        System.out.println("");
        //Arrays.sort(output);
        return output;
    }

    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int[] result = icecreamParlor(m, arr);
           /* for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");*/


        }
        in.close();
    }
}

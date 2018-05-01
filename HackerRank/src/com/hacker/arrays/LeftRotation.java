package com.hacker.arrays;

import java.util.Arrays;

public class LeftRotation {
	public static void rotate(int []a, int numberOfRotate) {
		int [] b = Arrays.copyOfRange(a, 0, numberOfRotate-1);
		int [] c = Arrays.copyOfRange(a, numberOfRotate-1, a.length);
		for (int i : b) {
			System.out.print(i+" ");
		}
		for (int i : c) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		
	}

}

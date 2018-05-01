package com.interview.pbms.pingpong;

import java.util.Scanner;

/**
 * @author subramanian.ramar
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numberOfPeople = 0;
		int input [][] = null;
		
		try {
			numberOfPeople = Integer.valueOf(sc.nextLine());
			input = new int [numberOfPeople][2];
			for (int i = 0; i < numberOfPeople ; i++ ) {
				String[] range = sc.nextLine().split(" ");
				input[i][0] = Integer.valueOf(range[0]);
				input[i][1] = Integer.valueOf(range[1]);
			}
		} catch(Exception e) {
			System.out.println("Input is not valid!");
			System.exit(0);
		}
		System.out.println(Processor.calculate(numberOfPeople, input));
	}

}

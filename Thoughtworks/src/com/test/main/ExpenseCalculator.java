package com.test.main;

import com.test.processor.InputProcessor;

/**
 * @author subramanian.ramar
 * 
 * Starting of the application 
 *
 */
public class ExpenseCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("#### Expense calculator #### \n\n");
		
		InputProcessor.formGroup();
		InputProcessor.receiveExpenseDetails();
		
	}

}

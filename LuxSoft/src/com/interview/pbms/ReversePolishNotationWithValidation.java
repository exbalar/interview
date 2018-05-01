package com.interview.pbms;

import java.util.Stack;

/**
 * @author Balasubramanian Ramar
 * 
 * This class calculates the input based on Reverse Polish Notations and gives the result
 *
 */
public class ReversePolishNotationWithValidation {
	
	/**
	 * @param input
	 * Used for validation
	 * @return
	 */
	private static boolean validate(String input) {
		
		if(input == null 
				|| input.isEmpty()
				|| input.matches("(.*)[$&,:;=?@#|'<>.^()%!](.*)") 
				|| !input.matches("(.*)[+-/*](.*)") 
				|| !input.matches("(.*)[0-9](.*)") 
				|| !input.matches("^\\d+(.*)")
				|| input.matches("(.*)[a-zA-Z](.*)")) {
			return false;
		}
		return true;
	}
	/**
	 * @param input
	 * Used for calculating the result based on reverse polish notation
	 * @return
	 */
	public static long convertReversePolishNotation(String input) {
		
		// checks if null or empty or no operators
		if(!validate(input)){
			return -1;
		}
		int result = -1;
		String numberandoperator[] = input.split(" ");
		// Stack is used for storing the operands 
		Stack<Integer> numbersStack = new Stack<>();
		String operators = "+-/*";
		for(String thisChar : numberandoperator) {
			if(operators.contains(thisChar)) {
				int firstOperand = Integer.valueOf(numbersStack.pop());
				int secondOperand = Integer.valueOf(numbersStack.pop());
				switch(thisChar) {
					case "+" :
						result = firstOperand + secondOperand;
						break;
					case "-" :
						result = secondOperand - firstOperand;
						break;
					case "/" :
						// to avoid arithmetic exception, made it zero
						if(firstOperand != 0) {
							result = secondOperand / firstOperand;
						}else {
							result = 0;
						}
						break;
					case "*" :
						result = firstOperand * secondOperand;
						break;
				}
				numbersStack.push(result);
			}else {
				numbersStack.push(Integer.valueOf(thisChar));
			}
		}
		return result;
	}
}


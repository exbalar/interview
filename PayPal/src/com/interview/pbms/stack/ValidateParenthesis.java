package com.interview.pbms.stack;

import java.util.Stack;

public class ValidateParenthesis {

	public static void main(String[] args) {

		String input = "((asabs)(sdsd(sdsdm)ada)(a()))";
		
		Stack<Character> stack = new Stack<>();
		boolean validated = false;
		for (int i=0; i < input.length() ; i++) {
			if(input.charAt(i) == '(') {
				stack.push(input.charAt(i));
			}else if (input.charAt(i) == ')') {
				if (!stack.isEmpty()) {
					validated = true;
					break;
				}
			}
		}
		System.out.println((validated && stack.isEmpty()));
	}

}

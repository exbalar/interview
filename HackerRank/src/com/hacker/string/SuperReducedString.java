package com.hacker.string;

import java.util.Stack;

public class SuperReducedString {

		static String super_reduced_string(String s){
	Stack<String> input = new Stack<>();
	for(int i=0; i < s.length() ; i++) {
		if(i==0) {
			input.push(s.charAt(i)+"");
		}else {
			if(!input.isEmpty()) {
				String poped = input.pop();
				if(!poped.equals(s.charAt(i)+"")) {
					input.push(poped);
					input.push(s.charAt(i)+"");
				}
			}else {
				input.push(s.charAt(i)+"");
			}
		}
	}
	String output = input.toString().replaceAll(", ", "");
	if(input.isEmpty()) {
		output = "Empty String";
	}else{
        output=output.substring(1, output.length()-1);
    }
	return output;
}
	public static void main(String[] args) {
		System.out.println(super_reduced_string("aaabccddd"));
	}

}

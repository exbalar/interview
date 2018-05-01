package com.interview.pbms.string;

import java.util.HashSet;
import java.util.LinkedHashSet;

import javax.print.attribute.HashAttributeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String input = "abcdabxy";
		LinkedHashSet<Character> hashSet = new LinkedHashSet<>();
		for (int i=0; i < input.length(); i++) {
			hashSet.add(input.charAt(i));
		}
		System.out.println(hashSet.toString().substring(1, hashSet.toString().length()-1).replaceAll(", ", ""));
	}

}

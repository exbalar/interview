package com.hacker.string;

public class CamelCase {
	
	static long camelcase(String s) {
		long output=0;
		
		output=s.chars().filter(ch -> Character.isUpperCase((char)ch)).count()+1;
/*		int prevIndex=0;
		for(int i=0;i<s.length();i++) {
			if(i==0) {
				if(Character.isUpperCase(s.charAt(i))) {
					//break;
				}
			}else {
				if(prevIndex != i-1 && Character.isUpperCase(s.charAt(i))) {
					output++;
					prevIndex = i;
				}
			}
		}
		return output == 0 ? 0 : output+1;*/
		return output;
	}
	public static void main(String[] args) {
		System.out.println(camelcase("SsaveChangeInfOct"));
	}

}

package com.test.processor;

import java.util.Map;

import com.test.pojo.Person;

/**
 * @author subramanian.ramar
 *
 * This class is used for showing the output
 */
public class OutputProcessor {

	public static void showExpenses(Map<String,Person> group){
		
		for(Person p : group.values()){
			if(p.getAmount() < 0){
				System.out.println(p.getName() + " gets " + Math.abs(p.getAmount()));
			}else{
				System.out.println(p.getName() + " has to give " + p.getAmount());
			}
		}
	}
}

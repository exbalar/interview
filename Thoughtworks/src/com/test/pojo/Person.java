package com.test.pojo;

/**
 * @author subramanian.ramar
 * 
 * POJO that represents each person with their own details 
 */
public class Person {
	
	
	private String name;

	private int amount= 0;
	

	public int getAmount() {
		return amount;
	}

	public Person(String name){
		this.name =name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void spend(int amountSpent){
		this.amount = this.amount - amountSpent;
	}
	
	public void receive(int amountReceived){
		this.amount = this.amount + amountReceived;
	}

}

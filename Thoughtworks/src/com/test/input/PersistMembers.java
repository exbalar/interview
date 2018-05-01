package com.test.input;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.test.pojo.Person;

/**
 * @author subramanian.ramar
 *
 *This class is to hold the members of a group and to perform 
 *the operation on the person objects based on the input
 */
public class PersistMembers {
	
	private Map<String,Person> group = new HashMap<String,Person>();

	public Map<String, Person> getGroup() {
		return group;
	}

	public void setGroup(Map<String, Person> group) {
		this.group = group;
	}

	public void createMemberandStore(String name){
		Person person = new Person(name);
		group.put(name, person);
	}
	
	public void performTransaction(List<String> names, int amount, String transactionType){
		for(String name : names){
			Person person = group.get(name);
			if(person != null){
				if(transactionType.equals("SPEND")){
					person.spend(amount);
				}else{
					person.receive(amount);
				}
			}
		}
	}


}

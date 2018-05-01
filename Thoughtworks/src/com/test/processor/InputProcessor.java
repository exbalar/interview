package com.test.processor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import com.test.input.PersistMembers;

/**
 * @author subramanian.ramar
 *
 *This class takes the input from user and forms the Person objects using PersistMembers class.
 */
public class InputProcessor {
	
	public static PersistMembers persitMembers = new PersistMembers();
	
	public static void formGroup(){
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String stopFlag = "Y";
		while(stopFlag.equals("Y")){
			
			System.out.println("Please enter the person name: ");
			try {
				String memberName = br.readLine();
				if(memberName != null && !memberName.isEmpty()){
					persitMembers.createMemberandStore(memberName);
				}
				System.out.println("Anymore member? Y/N ");
				stopFlag = br.readLine();
				//int i = Integer.parseInt(br.readLine());
			} catch (Exception e) {
				System.exit(0);
			}
			
			
		}
	}
	
	public static void receiveExpenseDetails(){
		
		System.out.println("####Transaction begins####");
		String stopFlag = "Y";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> members = new ArrayList<>();
		while(stopFlag.equals("Y")){
			members = new ArrayList<>();
			System.out.println("Please enter the person name who spends: ");
			try {
				String memberName = br.readLine();
				System.out.println("Please enter the amount he/she spends: ");
				int amount = Integer.parseInt(br.readLine());
				members.add(memberName);
				persitMembers.performTransaction(members, amount,"SPEND");
				members = new ArrayList<>();
				System.out.println("Please enter the person names who receive (comma separated): ");
				String memberNames =  br.readLine();
				String memberArray[] = memberNames.split(",");
				members.addAll(Arrays.asList(memberArray));
				int dividedAmount = amount/memberArray.length;
				persitMembers.performTransaction(members, dividedAmount,"RECEIVE");
				System.out.println("Anymore transaction? Y/N ");
				stopFlag = br.readLine();
				//int i = Integer.parseInt(br.readLine());
			} catch (Exception e) {
				System.exit(0);
			}
			
			
		}
		System.out.println("The calculated output deatails are :::::");
		OutputProcessor.showExpenses(persitMembers.getGroup());
	}
}

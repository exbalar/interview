package com.hacker.linkedlist;

class Node {
    int data;
    Node next;
 }
public class ReverseLinkedList {

	public static void main(String[] args) {
		
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		
		n1.data = 1;
		n1.next = n2;

		n2.data = 2;
		n2.next = n3;
		
		n3.data = 3;
		n3.next = n4;
		
		n4.data = 4;
		n4.next = null;
		
		Node current = n1;
		Node next = null;
		Node prev = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		//n1 = prev;
		Node f = n3;
		while(n1!= null) {
			System.out.println(n1.data);
			n1= n1.next;
		}

	}

}

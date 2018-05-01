package com.interview.pbms.linkedlist;

public class RemoveNodeinLinkedList {

	public static void main(String[] args) {
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		Node n5 = new Node(6);
		Node n6 = new Node(7);
		Node n7 = new Node(8);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		
		Node toRemove = n4;
		Node current = n1;
		Node prev = null;
		while(current.next != null) {
			if (current == toRemove) {
				prev.next = current.next;
				break;
			}
			prev = current;
			current = current.next;
		}
		
		Node i = n1;
		while(i.next != null) {
			System.out.println(i.value);
			i = i.next;
		}
		
	}

}

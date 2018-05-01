package com.java.common.pgming.challenge.linkedlist;

public class ReverseLinkedList {
	
	public static void main(String ars[]) {
		
		LinkedList list = new LinkedList();
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		Node n5 = new Node(6);
		
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(n5);
		
		
		Node current =n1;
		Node next = null;
		Node prev =null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			//increment
			current =next;
		}
		//System.out.println(prev.value+""+n1.value);
		n1 = prev;
		Node node = n1;
		while(node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}

}

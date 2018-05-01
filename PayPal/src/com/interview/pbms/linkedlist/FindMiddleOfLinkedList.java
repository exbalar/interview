package com.interview.pbms.linkedlist;

class Node{
	
	public int value;
	Node next;
	Node prev;
	public Node(int val) {
		value = val;
	}
}
public class FindMiddleOfLinkedList {

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
		
		Node slow_ptr = n1;
	    Node fast_ptr = n1;
		while(fast_ptr != null && fast_ptr.next != null) {
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
		}
		System.out.println(slow_ptr.value);
	}

}

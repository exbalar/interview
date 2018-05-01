package com.java.common.pgming.challenge.linkedlist;

public class FindCycleinLinkedList {

	public static void main(String[] args) {
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
		n5.next = n3;
		
		Node slow_p = list.head;
		Node fast_p = list.head;
		while (slow_p != null && fast_p != null && fast_p.next != null) {
			fast_p = fast_p.next.next;
			slow_p = slow_p.next;
			if (slow_p == fast_p) {
				System.out.println(slow_p.value+""+fast_p.value);
				System.out.println("Found");
				break;
			}
		}
		slow_p = list.head;
		while (slow_p != fast_p) {
			slow_p = slow_p.next;
			fast_p = fast_p.next;
		}
		fast_p.next = null;
		Node node = list.head;
		while(node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}

}

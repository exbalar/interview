package com.java.common.pgming.challenge.linkedlist;

public class FindElementinLinkedList {

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
		Node node = list.head;
		while(node != null) {
			if (2 == node.value) {
				System.out.println("Found!");
				break;
			}
			node = node.next;
		}
	}

}

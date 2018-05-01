package com.java.common.pgming.challenge.linkedlist;

class Node{
	
	public int value;
	Node next;
	Node prev;
	public Node(int val) {
		value = val;
	}
}
class LinkedList{
	Node head = null;
	Node tail = null;
	int size =0;
	public void add (Node node) {
		if (head == null) {
			head = node;
			tail = node;
		}else {
			tail.next = node;
			tail = node;
		}
	}
}
public class BuildLinkedList {

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
			System.out.println(node.value);
			node = node.next;
		}
	}

}


package com.interview.pbms.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int value;
	Node left;
	Node right;
	public Node(int v) {
		value= v;
	}
}

class Tree {
	
	Node root = null;
	
	private Node addNode(Node node,int n) {
		if (node == null) {
			return new Node(n);		
		}
		if (node.left == null) {
			node.left = addNode(node.left, n);
		}else {
			node.right = addNode(node.right, n);
		}
		return node;
	}
	public void add (int in) {
		root = addNode(root,in);
	}
	
	public void remove (Node n) {
		
	}
	
	public Node find (int n) {
		return findNode(root,n);
	}
	
	private Node findNode(Node node, int n) {
		if (node.value == n) {
			return node;
		}
		if (node.right != null) {
			return findNode(node.right,n);
		}
		if (node.left != null) {
			return findNode(node.left,n);
		}
		return null;
	}
	
	public void preorder() {
		preorder(root);
	}
	private void preorder(Node node) {
		if (node != null) {
			System.out.println(node.value);
			preorder(node.left);
			preorder(node.right);
		}
	}
	public void postorder() {
		postorder(root);
	}
	private void postorder(Node node) {
		if (node != null) {
			preorder(node.left);
			preorder(node.right);
			System.out.println(node.value);
		}
	}
	public void inorder() {
		inorder(root);
	}
	private void inorder(Node node) {
		if (node != null) {
			inorder(node.left);
			System.out.println(node.value);
			inorder(node.right);
		}
	}
	public void levelorder() {
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.poll();
			System.out.println(temp.value);
			if (temp.left != null) {
				System.out.println("temp.value:"+temp.value+"left:"+ temp.left.value);
				q.add(temp.left);
			}
			if (temp.right != null) {
				System.out.println("right:"+ temp.right.value);
				q.add(temp.right);
			}
		}
		
	}
	
}

public class VerifyIfBinaryTreeIsBalanced {

	public static void main(String[] args) {
		/* root   2 
		 *      |   |
		 *      1   3
		 *        |   |
		 *        4   5
		 *                */ 
		
		/*Node n5 = new Node(5);
		Node n4 = new Node(3);
		Node n3 = new Node(1);
		Node n2 = new Node(3);
		Node n1 = new Node(2);*/
		
		Tree t = new Tree();
		t.add(2);
		t.add(4);
		t.add(5);
		t.add(3);
		t.add(1);
		//t.preorder();
		//t.postorder();
		//t.inorder();
		//t.levelorder();
		System.out.println(t.find(6));
		
	}

}

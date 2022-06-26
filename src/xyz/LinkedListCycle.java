package xyz;

import java.util.LinkedList;

public class LinkedListCycle {
	
	Node head;
	static class Node {
		int data;
		Node next;
	}
	
	public static boolean hasCycle(Node head) {
		
		boolean flag = false;
		if(head == null) 
			return flag;
		
		Node slow = head;
		Node fast = head.next;
		while(slow!=fast) {
			if(fast==null || fast.next==null) {
				flag = false;
			}
				
				slow=slow.next;
				fast=fast.next.next;
		}
		flag = true;
		System.out.println(flag);
		return flag;
		
	}
	
	static Node newNode(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		return temp;
	}

	public static void main(String[] args) {
		
		Node head = newNode(3);
		head.next = newNode(2);
		head.next.next = newNode(0);
		head.next.next.next = newNode(-4);
		head.next.next.next.next = head;
		hasCycle(head);
	}

}

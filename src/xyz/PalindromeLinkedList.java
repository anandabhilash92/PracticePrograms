package xyz;

import java.util.Stack;

import xyz.LinkedListCycle.Node;

public class PalindromeLinkedList {
	
	Node head;
	static class Node {
		int data;
		Node next;
	}
	
	public static boolean isPalindrome(Node head) {
		boolean flag = true;
		Stack<Integer> s1 = new Stack<Integer>();
		Node temp = head;
		while(temp!=null) {
			s1.push(temp.data);
			temp=temp.next;
		}
		while(!s1.isEmpty()) {
			if(s1.pop()!=head.data) {
				flag = false;
				break;
			} else {
				head = head.next;
			}
		}
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
		
		Node head = newNode(1);
		head.next = newNode(2);
		head.next.next = newNode(1);
		head.next.next.next = newNode(2);
		isPalindrome(head);
	}

}

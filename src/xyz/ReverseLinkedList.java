package xyz;

import java.util.LinkedList;

import xyz.RemoveLinkedListElements.Node;

public class ReverseLinkedList {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public static Node reverseList(Node head) {
		
		Node prev = null;
		while(head!=null) {
			Node next_node = head.next;
			head.next = prev;
			prev = head;
			head = next_node;
		}
		return prev;
	}
	
	static void printList(Node head) {
		Node tnode = head;
		while(tnode!=null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}
	
	public static void main(String[] args) {
		
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		printList(list.head);
		Node rev = reverseList(list.head);
		System.out.println();
		printList(rev);
	}

}

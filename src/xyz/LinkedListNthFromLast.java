package xyz;

import xyz.RemoveLinkedListElements.Node;

public class LinkedListNthFromLast {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		
	}
	
	void printNthFromLast(Node head, int n) {
		Node main_ptr = head;
		Node ref_ptr = head;
		
		int count = 0;
		if(head!=null) {
			while(count<n) {
				ref_ptr = ref_ptr.next;
				count++;
			}
			if(ref_ptr==null) {
				System.out.println(head.data);
			} else {
				while(ref_ptr!=null) {
					main_ptr = main_ptr.next;
					ref_ptr = ref_ptr.next;
				}
				System.out.println(main_ptr.data);
			}
		}
	}
	
	
	static Node newNode(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		return temp;
	}

	public static void main(String[] args) {

		LinkedListNthFromLast llist = new LinkedListNthFromLast();
		Node head = newNode(20);
		head.next = newNode(4);
		head.next.next = newNode(15);
		head.next.next.next = newNode(35);
		llist.printNthFromLast(head, 3);
	}

}

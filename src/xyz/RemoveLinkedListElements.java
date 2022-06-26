package xyz;

public class RemoveLinkedListElements {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
	}
	
	public static Node removeElements(Node head, int data) {
		
		while(head!=null && head.data == data) {
			head = head.next;
		}
		
		Node temp = head;
		while(temp!=null && temp.next!= null) {
			if(temp.next.data == data) {
				temp.next = temp.next.next;
			} else {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		System.out.println(temp.data);
		return head;
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
		head.next.next = newNode(6);
		head.next.next.next = newNode(3);
		head.next.next.next.next = newNode(4);
		head.next.next.next.next.next = newNode(5);
		head.next.next.next.next.next.next = newNode(6);
		int data = 6;
		removeElements(head, data);
	}

}

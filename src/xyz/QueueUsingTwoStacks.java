package xyz;

import java.util.Stack;

public class QueueUsingTwoStacks {
	
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	void enQueue(int e) {
		s1.push(e);
	}
	
	int deQueue() {
		if(s2.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingTwoStacks q = new QueueUsingTwoStacks();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());

	}

}

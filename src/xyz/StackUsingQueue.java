package xyz;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	
	Queue<Integer> q = new LinkedList<>();
	
	public void push(int x) {
		q.add(x);
		int k=q.size();
		for(int i=0;i<k-1;i++) {
			Integer first = q.remove();
			q.add(first);
		}
	}
	
	public int pop() {
		return q.remove();
	}
	
	public int top() {
		return q.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingQueue s = new StackUsingQueue();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.top());
	    s.pop();
	    System.out.println(s.top());
	    s.pop();
	    System.out.println(s.top());

	}

}

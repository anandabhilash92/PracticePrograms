package xyz;

import java.util.Stack;

public class ReverseStringUsingStack {
	
	public static void reverse(String s) {
		
		Stack<String> s1 = new Stack<String>();
		int n=s.length();
		for(int i=0;i<n;i++) {
			s1.push(s.substring(i, i+1));
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(s1.pop() + "");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("abhilash");
		reverse(s);

	}

}

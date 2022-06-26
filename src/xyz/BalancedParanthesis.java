package xyz;
import java.util.*;

public class BalancedParanthesis {
	
	static boolean balancedParanthesis(String s) {
		 if(s.length()%2!=0) {
	            return false;
	        }
	        
	        Stack<Character> stack = new Stack();
	        for(char c : s.toCharArray()) {
	            if(c=='(' || c=='{' || c=='[') {
	                stack.push(c);
	            }
	            else if(c=='}' && !stack.isEmpty() && stack.peek()=='{') {
	                stack.pop();
	            }
	            else if(c==')' && !stack.isEmpty() && stack.peek()=='(') {
	                stack.pop();
	            }
	            else if(c==']' && !stack.isEmpty() && stack.peek()=='[') {
	                stack.pop();
	            }
	            else return false;
	            
	            
	        }
	        return stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expr="([}}])";
		balancedParanthesis(expr);
		if(balancedParanthesis(expr)) {
			System.out.println("balanced");
		} else {
			System.out.println("not balanced");
		}

	}

}

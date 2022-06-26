package xyz;

import java.util.Arrays;

public class AssignCookies {
	
	public static int findContentChildren(int []g, int []s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int a_pointer = 0;
		int b_pointer = 0;
		while(a_pointer<g.length && b_pointer<s.length) {
        if(g[a_pointer]<=s[b_pointer]) {
        	a_pointer++;
        	b_pointer++;
        } else {
        	b_pointer++;
        }
	}
		System.out.println(a_pointer);
		return a_pointer;
	}

	public static void main(String[] args) {

		int []g = new int[] {10,9,8,7,10,9,8,7};
		int []s = new int[] {10,9,8,7};
		findContentChildren(g, s);
	}

}

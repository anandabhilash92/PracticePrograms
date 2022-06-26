package xyz;

import java.util.LinkedHashMap;

public class LongestSubstringWithputRepeatingCharacters {
	
	public static int lengthOfLongestSubstring(String s) {
		
		int i=0;
		int j=1;
		String st = "";
		String longestSubstring = "";
		String []str = s.split("");
		while(i<s.length()) {
			if(!st.contains(str[i])) {
				st = st + str[i];
			i++;
			if(st.length()>longestSubstring.length()) {
				longestSubstring = st;
			}
			} else {
				
				i=j;
				j++;
				st="";
			}
		}
		System.out.println(longestSubstring.length());
		return longestSubstring.length();
	}

	public static void main(String[] args) {

		String s = "dvdf";
		lengthOfLongestSubstring(s);
	}

}

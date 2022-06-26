package xyz;

import java.util.Arrays;

public class Anagram1 {
	
	public static boolean isAnagram(String s, String t) {
		
		boolean flag = false;
        s=s.toLowerCase();
        t=t.toLowerCase();
        char []ch1 = s.toCharArray();
        char []ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2)) {
            flag = true;
        }
        return flag;
	}

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		isAnagram(s, t);
	}

}

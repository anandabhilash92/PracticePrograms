package xyz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveAnagrams {
	
	public static List<String> removeAnagrams(String []words) {
	
		List<String> ans = new ArrayList<>();
		int start=0;
		ans.add(words[start]);
		if(words.length>1) {
			for(int i=1;i<words.length;i++) {
				if((freq(words[start])).equals(freq(words[i]))) {
					continue;
				} else {
					ans.add(words[i]);
					start=i;
				}
			}
		}
		System.out.println(ans);
		return ans;
	}

	private static String freq(String word) {
		
		int []freq=new int[26];
		for(char c:word.toCharArray()) {
			freq[c-'a']++;
		}
		
		String ans="";
		for(int el:freq) {
			ans=ans+el;
		}
		return ans;
	}

	public static void main(String[] args) {
		
		String []words = new String[] {"a","b","c","d","e"};
		removeAnagrams(words);
	}

}

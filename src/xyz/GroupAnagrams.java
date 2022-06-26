package xyz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	
	public static List<List<String>> groupAnagrams(String []strs) {
		
		List<List<String>> groupedAnagrams = new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();
		for(String current:strs) {
			char []characters=current.toCharArray();
			Arrays.sort(characters);
			String sorted = new String(characters);
			if(!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<String>());
			}
			
			map.get(sorted).add(current);
		}
		
		groupedAnagrams.addAll(map.values());
		System.out.println(groupedAnagrams);
		return groupedAnagrams;
	}

	public static void main(String[] args) {
		
		String []strs = new String[] {"eat","tea","tan","ate","nat","bat"};
		groupAnagrams(strs);
	}

}

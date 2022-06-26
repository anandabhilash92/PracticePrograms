package xyz;

import java.util.HashMap;
import java.util.Map;

public class LargestWordCount {
	
	public static String largestWordCount(String []messages, String[] senders) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
        int max_count = 0;
        String max_sender = "";
        
        for (int i=0; i<messages.length; i++) {
            String sender = senders[i];
            int count = (messages[i].split(" ")).length + map.getOrDefault(sender, 0);
            map.put(sender, count);
            if (count > max_count || (count == max_count && sender.compareTo(max_sender) > 0)) {
                max_count = count;
                max_sender = sender;
            }
        }
        
        System.out.println(max_sender);
        return max_sender;
	}

	public static void main(String[] args) {
		
		String []messages = new String[] {"Hello userTwooo","Hi userThree","Wonderful day Alice","Nice day userThree"};
		String []senders = new String[] {"Alice","userTwo","userThree","Alice"};
		largestWordCount(messages, senders);
	}

}

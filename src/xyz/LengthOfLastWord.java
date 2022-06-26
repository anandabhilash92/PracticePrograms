package xyz;

public class LengthOfLastWord {
	
	public static int lengthOfLastWord(String s) {
		String []str = s.split(" ");
        int l = str.length-1;
        String st = str[l];
        int len = st.length();
        System.out.println(len);
        return len;
	}

	public static void main(String[] args) {
		
		String s = "Hello World";
		lengthOfLastWord(s);
	}

}

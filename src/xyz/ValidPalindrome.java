package xyz;

public class ValidPalindrome {
	
	public static boolean isPalindrome(String s) {
		boolean flag = false;
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        String st="";
        for(int i=s.length()-1;i>=0;i--) {
            st = st + s.charAt(i);
        }
        if(s.equals(st)) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
	}

	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";
		isPalindrome(s);
	}

}

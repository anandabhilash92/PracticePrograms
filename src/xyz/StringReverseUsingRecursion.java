package xyz;

public class StringReverseUsingRecursion {
	
	static String recursiveMethod(String str) {
		if((null==str) || (str.length()<=1)) {
			return str;
		}
		return recursiveMethod(str.substring(1))+ str.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("abhilash");
		System.out.println(recursiveMethod(s));
	}

}

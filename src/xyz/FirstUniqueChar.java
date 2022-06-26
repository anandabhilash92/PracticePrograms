package xyz;

public class FirstUniqueChar {
	
	public static int firstUniqChar(String s) {
		int r=0;
        int c=0;
        char []ch = s.toCharArray();
        for(int i=0;i<ch.length;i++) {
            if(s.indexOf(s.charAt(c))==s.lastIndexOf(s.charAt(c))) {
                r=c;
                break;
            } else {
                r=-1;
                c++;
            }
        }
        System.out.println(r);
        return r;
    
	}

	public static void main(String[] args) {

		String s = "aabb";
		firstUniqChar(s);
	}

}

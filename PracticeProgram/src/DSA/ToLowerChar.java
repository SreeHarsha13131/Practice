package DSA;

public class ToLowerChar {
	public static void main(String[] args) {
		String s = "oInDia";
		String s1 = " "; 
//		String str = s.toLowerCase();
//		System.out.println(str);
	    for(int i=0;i<s.length();i++) {
//	    	System.out.print(str);
	    	if(s.charAt(i)>=65 && s.charAt(i)<=90) {
	    		s1= s1+ ((char)(s.charAt(i)+32));
	    	}else {
	    		s1=s1+s.charAt(i);
	    	}    	
	    }
	    System.out.println(s1);
	}

}

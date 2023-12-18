package JavaConcepts;

public class ConvertToLower {
	public static void main(String[] args) {
		String s1 = "CollegeKeClass";
		String s = " ";		
		for(int i=0 ; i<s1.length() ; i++) {
			if(s1.charAt(i)>=65 && s1.charAt(i)<=90) {
				s = s+((char)(s1.charAt(i)+32));
			}else {
				s=s+s1.charAt(i);
			}
		}
		System.out.println(s);
	}
}

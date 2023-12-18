package DSA;

public class A2bec4Print {
	public static void main(String[] args) {
		String s =  "s3r3e6s3e6";
		String s1 = " ";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int no = s.charAt(i) - 48;
				for(int j=0;j<no;j++) {
					s1 = s1 + s.charAt(i-1);
//					System.out.println(s1);
				}
			}			
		}
		System.out.println(s1);
	}
}

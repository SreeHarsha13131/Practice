package DSA;

public class SwapfirstandLastString {
	public static void main(String[] args) {
		String[] s = {"Super", "And", "Man"};
		String temp = s[s.length-1];
		s[s.length-1]=s[0];
		s[0] = temp;
		for(int  i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
	}
}

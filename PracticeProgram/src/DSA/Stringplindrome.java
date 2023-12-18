package DSA;

public class Stringplindrome {
	public static void main(String[] args) {
		String s = "abcd";;
		String copy = s;
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
			rev = rev+s.charAt(i);
		}
		if(copy.equals(rev)) {
			System.out.print("is palindrom");
		}else {
			System.out.print("not");
		}
	}
}

package DSA;

public class SringrevwithoutLegthfun {
	public static void main(String[] args) {
		String s = "loopl";
		String str = "";
		String rev = "";
		int length = s.compareTo(str);
		for(int i = length-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}

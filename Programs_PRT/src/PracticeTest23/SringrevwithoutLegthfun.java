package PracticeTest23;

public class SringrevwithoutLegthfun {
	public static void main(String[] args) {
		String s= "mo43m";
		String copy = s;
		String s1 = "";
		String rev = "";
		int lenght = s.compareTo(s1);
		for(int i=lenght -1;i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev==copy) {
			System.out.println(rev + ": Is palindrom");
		}else {
			System.out.println(rev + ": Is not palindrom");
		}

	}
}

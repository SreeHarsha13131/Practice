package DSA;

public class AdditionofGropuedNumb {
	public static void main(String[] args) {
		String  s = "s39r4e5e63+3";
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				int no = s.charAt(i) - 48;
				sum = sum +  no;
			}
		}
		System.out.println(sum);
	}
}

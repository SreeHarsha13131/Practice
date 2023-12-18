package PracticeTest23;

public class VowelsByConveLowercase {
	public static void main(String[] args) {
		String s="SreeHarshaiou";
		String s1 = s.toLowerCase();
		String str = " ";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' ||s1.charAt(i)=='u') {
				str = str+s1.charAt(i);
			}
		}
			System.out.print(str);
		
	}
}

package DSA;

public class SeparatealphaDigitChar {
	public static void main(String[] args) {
		String s = "AB@#12cd";
		String alpha = " ";
		String num = " ";
		String Special = " ";
		for(int i = 0 ; i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z') {
				alpha = alpha+s.charAt(i);
			}else if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				num = num+s.charAt(i);
			}else {
				Special=Special+s.charAt(i);
			}
		
		}
		System.out.println(alpha+ " ,"+num+" ,"+Special);

	}
}

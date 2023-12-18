package PracticeTest23;

public class A2B3C3DE2 {
	public static void main(String[] args) {
		String s1 = "A2B3C3DE2";
		String s2 = " ";
		for(int i = 0;i<s1.length(); i++) {
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9' ) {
				int n = s1.charAt(i) - 48;
				for(int j = 0; j<n ; j++) {
					s2=s2+s1.charAt(i-1);
				}
				
			}

		}
		System.out.println(s2);


	}
}

package PracticeTest23;

public class MaximumLengthString {

	public static void main(String[] args) {
		String[] s = {"sree","ghjk","harsha"};
		int maxLenght = 0;
		for(int i=0;i<s.length;i++) {
			int actLength = s[i].length();
			if(maxLenght<actLength) {
				maxLenght = actLength;
			}
		}
		for(int i=0;i<s.length;i++) {
			if(maxLenght==s[i].length()) {
				System.out.println(s[i]);
			}
		}

	}

}

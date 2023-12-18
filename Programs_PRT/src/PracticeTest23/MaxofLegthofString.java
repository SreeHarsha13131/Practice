package PracticeTest23;

public class MaxofLegthofString {

	public static void main(String[] args) {
		String[] s= {"hello","windows123","Testyanedtra","ma4ngo"};
		String maxLength = s[0];
		for(int i=0;i<s.length;i++) {
			if(s[i].length()<maxLength.length()) { //if(s[i].length()>maxLength.length()) {
				maxLength=s[i];
			}
		}
		for(int i=0;i<s.length;i++) {
			if(maxLength.length()==s[i].length()) {
				System.out.println(s[i]);
			}
		}
	}
}

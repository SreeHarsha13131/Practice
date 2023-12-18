package DSA;

public class SumofEachNumberinString {
	public static void main(String[] args) {
		String s = "a12e4gu23s5e4";
		int sum = 0;
		for(int i=0; i <s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int num = s.charAt(i) - 48;
				sum = sum+num;
			}
		}
		System.out.println(sum);

	}
}

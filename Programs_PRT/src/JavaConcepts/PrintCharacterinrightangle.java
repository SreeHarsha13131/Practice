package JavaConcepts;

public class PrintCharacterinrightangle {

	public static void main(String[] args) {
		String s = "Harsha";
		String str = "";
		for(int i = 0 ; i<s.length() ; i++) {
			str = str + s.charAt(i);
			System.out.println(str);
		}

	}

}

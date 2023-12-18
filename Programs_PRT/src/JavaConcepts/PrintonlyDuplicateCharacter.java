package JavaConcepts;

import java.util.HashSet;

public class PrintonlyDuplicateCharacter {
	public static void main(String[] args) {
		String s = "Sree Harsha";
		String s1 = s.toLowerCase();
		HashSet<Character> set = new HashSet<>();
		for(int i=0 ; i < s1.length() ; i++) {
			set.add(s1.charAt(i));
		}
		for(Character x:set) {
			int count = 0;
			for(int i=0 ; i < s1.length() ; i++) {
				if(x.equals(s1.charAt(i))) {
					count++;
				}
			}
			if(count > 1) {
				System.out.println(x+ " : "+ count);
			}
		}
	}
}

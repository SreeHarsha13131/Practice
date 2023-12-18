package JavaConcepts;

import java.util.HashSet;

public class GettheCountsofCharInString {
	public static void main(String[] args) {
		String s="DevBhoome";
		HashSet<Character> set = new HashSet<>();
		for(char x:s.toCharArray()) {
			set.add(x);
		}
		for(Character ch:set) {
			int count = 0;
			for(int i=0;i<s.length();i++) {
				if(ch.equals(s.charAt(i))) {
					count++;
				}
			}	
			System.out.println(ch+"   "+count);
		}
		

	}
}

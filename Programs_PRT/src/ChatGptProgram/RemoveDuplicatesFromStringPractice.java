package ChatGptProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromStringPractice {
	public static void main(String[] args) {
		String s = "HarshaSreea";
		System.out.println(removeDuplicatesFromStringPractice(s));
	}
	public static String removeDuplicatesFromStringPractice(String s) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(char c:s.toCharArray()) {
			set.add(c);			
		}
		StringBuilder result = new StringBuilder();
		for(Character str:set)
		{
			result.append(str);
		}
		return result.toString();
	}
}


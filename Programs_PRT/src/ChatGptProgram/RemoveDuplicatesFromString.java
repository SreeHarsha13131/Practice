package ChatGptProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
		String input = "abaceeedb";
		System.out.println(removeDuplicatesUsingSet(input));
		
	}

	public static String removeDuplicatesUsingSet(String input) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (char c : input.toCharArray()) {
			set.add(c);
		}

		StringBuilder str = new StringBuilder();
		for (Character c : set) {
			str.append(c);
		}

		return str.toString();
	}
}

package JavaConcepts;

import java.util.HashSet;
import java.util.LinkedList;

public class GettheCountorsfeachWordsinString {
	public static void main(String[] args) {
//		String arr = "Welcome to america and welcome to India";
//		String[] str = arr.split(" ");
		String[] str = {"Welcome", "to","america", "and", "Welcome", "to", "India"};
//		System.out.println(str);
//		LinkedList<String> set = new LinkedList<>();
		HashSet<String> set = new HashSet<>();

		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
//		System.out.println(set);
		for(String x:set) {
			int count = 0;
			for(int i=0;i<str.length;i++) {
				if(x.equals(str[i])) {
					count++;
				}
			}
			System.out.println(x +" "+count);
		}

	}
}

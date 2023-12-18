package DSA;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemovetheDuplicatesfromString {
	public static void main(String[] args) {
		String[] str = {"Sree", "Sree", "harsha"};
//		LinkedList<String> set = new LinkedList<>();
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i=0;i<str.length;i++){
			set.add(str[i]);
		}
		for(String x:set) {
			System.out.println(x);
		}
	}

}

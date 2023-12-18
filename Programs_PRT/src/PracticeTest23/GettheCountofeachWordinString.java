package PracticeTest23;

import java.util.HashSet;

public class GettheCountofeachWordinString {
	public static void main(String[] args) {
		String[] s = {"Hi","welcome", "to","Google","to","Google"};
		HashSet<String> set = new HashSet<>();
		for(int i=0;i<s.length;i++) {
			set.add(s[i]);
		}
		for(String x:set) {
			int count = 0;
			for(int i = 0;i<s.length;i++) {
				if(x.equals(s[i])) {
					count++;
				}
			}
			System.out.println(x+"="+ count);
		}
	}
}

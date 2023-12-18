package PracticeTest23;

import java.util.HashSet;

public class GettheCountofCharInString {
	public static void main(String[] args) {
		String s = "morningstar";
		HashSet< Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));		
		}
		for( Character x:set) {
			int count = 0;
			for(int i=0;i<s.length();i++) {
				if(x==s.charAt(i)) {
					count++;
				}
			}
			if(count==1) {//if(count>1) unique
				System.out.println(x+"-" + count);
			}
//			System.out.println(x+" = " + count);
		}
	}
}

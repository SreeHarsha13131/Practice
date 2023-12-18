package PracticeTest23;

import java.util.HashSet;

public class GetCountofEachCharactersInString {
	public static void main(String[] args) {
		String s="naveenp";
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(Character ch:set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count=count+1;
				}
			}
			System.out.println(ch+" Occurance =====>>>"+count);
		}
	}
}

package PracticeTest23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class WorderwithIndex {
	public static void main(String[] args) {
		String s = "SreeHarsha";
		HashSet<Character> array = new HashSet<>();
		for(int i=0;i<s.length();i++) {
			array.add(s.charAt(i));
		}
		for(Character word:array)
		{
			for(int i=0;i<s.length();i++) {
				if(word==s.charAt(i))
				{
					System.out.println(word+"--"+ (i+1));
				}	
			
			}
//			System.err.println(word+" index"+ (i+1));
		}
	}
}

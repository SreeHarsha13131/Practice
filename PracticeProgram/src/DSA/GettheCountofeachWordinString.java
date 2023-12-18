package DSA;

import java.util.HashSet;

public class GettheCountofeachWordinString {
	public static void main(String[] args) {
		String[] str = {"He","who","where", "He"};
		HashSet<String> set = new HashSet<>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
		for(String word:set) {
			int  count = 0;
			for(int i = 0; i <str.length;i++) {
				if(word==str[i]) {
					count++;
				}		
			}
			if(count<=1) {
				System.out.println(word+"=  "+count);	
			}
//			System.out.println(word+"=  "+count);			
		}
	}
}

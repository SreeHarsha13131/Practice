package PracticeTest23;

import java.util.HashMap;
import java.util.Map.Entry;

public class GetSimilarCharFromString {
	public static void main(String args[]) {
		String s="this is naveen";
		HashMap<Character, Integer> hm=new HashMap<>();
		char[] c=s.toCharArray();
		for(char c1:c) {
			if(!hm.containsKey(c1)) {
				hm.put(c1, 1);
			}
			else {
				int count=hm.get(c1);
				hm.put(c1, count+1);
			}
		}
			for(Entry<Character, Integer> en:hm.entrySet()) {
				if(en.getValue()>1) {
				  System.out.println(en.getKey()+" value is "+ en.getValue());
				}
			}
		}
}



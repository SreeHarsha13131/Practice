package PracticeTest23;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayDuplicateStringHashMap {
	public static void main(String[] args) {
		String s = "The divine star is back the divine star is bakc";
		String[] str = s.toLowerCase().trim().split(" ");
		Map<String,Integer>  duplicateString = new HashMap<>();
		int count = 1;
		for(String x:str) {
			if(duplicateString.containsKey(x)){
				duplicateString.put(x, duplicateString.get(x)+1);
			}
			else {
				duplicateString.put(x, count);
			}
		}
		System.out.println("Duplicate string values are");
		for(Map.Entry entry:duplicateString.entrySet()) {
			int val=(Integer)entry.getValue();
			if(val>1) {
				System.out.println(duplicateString.keySet());
			}
		}
	}
}

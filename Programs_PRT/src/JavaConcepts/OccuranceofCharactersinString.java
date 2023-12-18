package JavaConcepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class OccuranceofCharactersinString {
	public static void main(String[] args) {
		String s = "MuMento";
		HashMap<Character, Integer> set = new HashMap<>();
		char[] c=s.toCharArray();
		for(char a:c) {
			if(!set.containsKey(a)) {
				set.put(a, 1);
			}else
			{
				int count = set.get(a);
				set.put(a, count+1);
			}
		}
		for(Entry<Character, Integer> result:set.entrySet()) {
			if(result.getValue()>1) {
				String finalResult = result.getKey()+"  "+ result.getValue();
				System.out.println(finalResult);
			}
		}		
	}
}

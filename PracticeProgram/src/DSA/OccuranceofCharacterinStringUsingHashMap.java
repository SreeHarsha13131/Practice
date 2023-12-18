package DSA;

import java.util.HashMap;
import java.util.Map.Entry;

public class OccuranceofCharacterinStringUsingHashMap {
	public static void main(String[] args) {
		String s = "SreeeHarsha";
		HashMap<Character,Integer> map = new HashMap<>();
		for( char x:s.toCharArray()) {
			if(!map.containsKey(x)) {
				map.put(x, 1);
			}else {
				int count =map.get(x);
				if(map.containsKey(x)) {
					map.put(x, 1+count);
				}
			}		
		}
		for(Entry<Character, Integer> en:map.entrySet()) {
			if(en.getValue()>=2) {
				System.out.println(en.getKey()+ " = "+en.getValue());
			}
		}

	}
}

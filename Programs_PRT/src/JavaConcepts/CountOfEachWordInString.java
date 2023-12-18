package JavaConcepts;

import java.util.HashSet;

public class CountOfEachWordInString{
	public static void main(String[] args) {
		String[] arr = {"Has","to","Has","to"};
		HashSet<String> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		for(String s:set) {
			int count = 0;
			for(int i=0;i<arr.length;i++) {
				if(s.equals(arr[i])) {
					count++;
				}
			}
			System.out.println(s+" :"+count);
		}
	}
}

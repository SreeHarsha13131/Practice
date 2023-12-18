package DSA;

import java.util.TreeSet;

public class SortStringInAscending {
	public static void main(String[] args) {
		String[] arr= {"AM","I","sreeharsha","cool"};
		TreeSet<String > set = new TreeSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		System.out.println(set.descendingSet());

	}
}

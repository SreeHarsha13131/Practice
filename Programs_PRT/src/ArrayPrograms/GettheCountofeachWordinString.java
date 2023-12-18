package ArrayPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class GettheCountofeachWordinString 
{
	public static void main(String[] args) {
		String s="hi welcome to tyss hi welcome";
		System.out.println(s);
		//step1:-declare hashset to store the 
		String[] str = s.split(" ");
		System.out.println(str);
		//		LinkedHashSet<String> set=new LinkedHashSet<String>();
		//		TreeSet<String> set=new TreeSet<String>();
		HashSet<String> set=new HashSet<String>();
		//		ArrayList<String> set=new ArrayList<String>();

		for(int i=0;i<str.length;i++)
		{
			//step2;-store every String value into hashset
			set.add(str[i]);
		}
		System.out.println(set);
		for(String word:set)
		{		
			int count=0;
			//step3:- compare the string values in set with the array 
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
					count++;
				}
			}
			//step4:- print the String  values with the count
			System.out.println(word+" "+count);
		}
	}
}

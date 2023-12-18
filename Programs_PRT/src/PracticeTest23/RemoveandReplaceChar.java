package PracticeTest23;

import java.util.Iterator;

public class RemoveandReplaceChar {

	public static void main(String[] args) {
		String s = "Gandu Ga";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='G') {
				ch[i] = 'B';
			}			
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}

	}

}

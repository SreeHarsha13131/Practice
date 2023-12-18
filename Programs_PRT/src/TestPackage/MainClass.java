package TestPackage;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class MainClass {
	    public static void main(String args[]) {
	      String s="testing";
	     char[] ar = s.toCharArray();
	     for(int i=0;i<ar.length;i++) {
	    	 int count=0;
	    	 if(s.charAt(i)==ar[i])
	    	 {
	    		 count++;
	    	 }
	    		 if(count>1) {
	    			 System.out.println(s.charAt(i)+" "+count);
	    		 }
	    	 }
	     }
	
}

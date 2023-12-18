package PracticeTest23;

public class PrimeNumber {
	public static void main(String[] nav) {
	  int n=12;
	  boolean flag=true;
	  for(int i=2;i<n;i++) {
		  if(n%i==0) {
			  flag=false;
		  }  
	  }
	  if(flag==true) {
		  System.out.println(n+ " is a palindrome");
	  }
	  else {
		  System.out.println(n+" is not a palindrome" );
		  
	  }
		
	}

}

package DSA;

public class NumberPalindrome {
	public static void main(String[] args) {
		int no = 1331;
		int rev = 0;
		int copy = no;
		while(no!=0) {
			int rem = no%10 ;
			rev = (rev*10)+rem;
			no=no/10;
		}		
		if(rev==copy) {
			System.out.println(rev+": is Palindrome ");
		}else {
			System.out.println(rev+": is not Palindrome");
		}	
	}
}

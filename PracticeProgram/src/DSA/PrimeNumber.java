package DSA;

public class PrimeNumber {
	public static void main(String[] args) {
		int no = 133;
		boolean flag = true;
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				flag = false;
			}
		}
		if(flag==true) {
			System.out.println(no+ " = number is palindrom");
		}else {
			System.out.println(no+" =  number is not palindrom");
		}
	}
}
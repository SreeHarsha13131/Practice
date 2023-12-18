package PracticeTest23;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int no=17;
		boolean flag = true;
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				flag=false;
			}		
		}
		if(flag==true) {
			System.out.println(no+" : number is palindrom");
		}else {
			System.out.println("not palindrom");
		}

	}

}

package PracticeTest23;

public class HappyNoAtOne {

	public static void main(String[] args) {
		int no=1040;
		int original = no;
		while(no>9) {
			int sum = 0;
			while(no!=0) {
				int rem = no%10;
				sum = sum+(rem*rem);
				no=no/10;
			}
			no=sum;
		}
		if(no==1) {
			System.out.println(original+" "+ ": is happy number" );
		}else {
			System.out.println("Not happy number");
		}

	}

}

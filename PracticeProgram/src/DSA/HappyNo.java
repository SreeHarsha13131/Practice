package DSA;

public class HappyNo {
	public static void main(String[] args) {
		int no = 17830;
		int orginal = no;
		while(no>9) {
			int sum = 0;
			while(no!=0) {
				int rem = no%10;
				sum = sum+(rem*rem);
				no = no/10;
			}
			no =sum;
		}
		if(no==1) {
			System.out.println("num is happy num");
		}else {
			System.out.println("not happy number");
		}

	}
}

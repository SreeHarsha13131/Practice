package JavaConcepts;

public class PrimeNum {
	public static void main(String[] args) {
		int no = 140;
		boolean flag = true;
		for(int i = 2;i<no ; i++) {
			if(no%i==0) {
				flag = false;
			}
		}
		if(flag == true) {
			System.out.println(no+": Is a Prime Number");
		}else {
			System.out.println(no+": Number is not Prime");
		}

	}
}

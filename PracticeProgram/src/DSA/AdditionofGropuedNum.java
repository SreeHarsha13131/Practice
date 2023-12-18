package DSA;

public class AdditionofGropuedNum {
	public static void main(String[] args) {
		String s = "e43rw4t32y34";
		int sum = 0;
		int gSum = 0;
		for(int i=0 ; i<s.length();i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				int no = s.charAt(i) - 48;
				gSum = (gSum*10)+no;			
			}else {
				sum = gSum +sum;
				gSum = 0;
			}
			
		}
		sum = sum + gSum;
		System.out.println(sum);
	}
}

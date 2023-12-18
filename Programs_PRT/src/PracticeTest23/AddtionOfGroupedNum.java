package PracticeTest23;

public class AddtionOfGroupedNum {
	public static void main(String[] args) {
		String str = "a132b45df%1";
		int sum = 0;
		int gsum = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				int no=str.charAt(i) - 0;
				gsum = (gsum*10) + no;
			}
			else {
				sum = sum+gsum;
				gsum = 0;
			}
		}
		sum=sum+gsum;
		System.out.println(sum);
	}

}

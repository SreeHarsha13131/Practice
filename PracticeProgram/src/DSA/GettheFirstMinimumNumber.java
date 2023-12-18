package DSA;

public class GettheFirstMinimumNumber {
	public static void main(String[] args) {
		int[] no = {40,30,54,90,70};
		for(int  i = 0;i<no.length;i++) {
			int  temp = no[i];
			for(int j=i+1 ; j<no.length; j++) {
				if(no[j]<no[i]) {
					no[i]=no[j];
					no[j]=temp;
				}
			}			
		}
		System.out.println("the first min number: " +no[0]);
		for(int i=0;i<no.length;i++) {
			
			System.out.print(no[i] + " " );		
		}
	}
}

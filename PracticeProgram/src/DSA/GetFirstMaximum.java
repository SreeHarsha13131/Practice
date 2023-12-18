package DSA;

public class GetFirstMaximum {
	public static void main(String[] args) {
		int[] no = {40,30,23,70,57};
		for(int i=0;i<no.length;i++) {
			for(int j=i+1;j<no.length;j++) {
				int temp = no[i];
				if(no[j]>no[i]) {
					no[i]=no[j];
					no[j] = temp;
				}
			}
		}
		for (int i = 0; i < no.length; i++) {
			//			System.out.print(no[i]+ " ,");
			//			break;
		}
		System.out.println(no[1]);

	}
}

package DSA;

public class MaxofLegthofString {
	public static void main(String[] args) {
		String[] arr = {"Sree","HarshaHallur","SreeHarsha"};
		String maxLength = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()<maxLength.length()) {//if(arr[i].length()>maxLength.length()) 
				maxLength = arr[i];
			}
		}
		System.out.print(maxLength+ "   : is the Max Length of the char ");
		for(int i=0;i<arr.length;i++) {
			if(maxLength.length()==arr[i].length()) {
				System.out.print(arr[i]+ "= "+ arr[i].length());
			}
		}

	}

}

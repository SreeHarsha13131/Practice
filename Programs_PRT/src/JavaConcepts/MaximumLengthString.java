package JavaConcepts;

public class MaximumLengthString {

	public static void main(String[] args) {
		String[] arr = {"SreeHarsha","Sree","Harsha"};
		int maxLength = 0;//int max = arr[0];
		for(int i = 0;i<arr.length;i++) {
			int actLength = arr[i].length();
			if(maxLength<actLength) {
				maxLength=actLength;//				max=arr[i];

			}
		}
		for(int i=0;i<arr.length;i++) {
			if(maxLength==arr[i].length()) {
				System.out.println(arr[i] + "  "+ maxLength);
			}
		}

	}

}

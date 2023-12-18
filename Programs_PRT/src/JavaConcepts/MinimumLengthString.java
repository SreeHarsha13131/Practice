package JavaConcepts;

public class MinimumLengthString {

	public static void main(String[] args) {
		String[] arr = {"SreeHarsha","Harsha","Sree","Us"};
//		String minLength = arr[0];
//		for(int i=0 ; i<arr.length;i++) {
//			if(arr[i].length()<minLength.length()) {
//				minLength=arr[i];
//			}
//		}
//		System.out.println(minLength);
//		for(int i=0;i<arr.length;i++) {
//			if(minLength.length()==arr[i].length()) {
//				System.out.println(arr[i]+ " "+ arr[i].length());
//			}
//		}
		int[] abc = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			abc [i] = arr[i].length();
		}
		for(int i = 0 ;i<abc.length;i++) {
			for(int j=i+1;j<abc.length;j++) {
				if(abc[j]<abc[i]) {
					int temp = abc[j];
					abc[j] = abc[i];
					abc[i] = temp;
				}
			}
		}
		for(int i = 0;i<arr.length;i++) {
			if(abc[0]==arr[i].length()) {
				System.out.println(arr[i]+ " "+arr[i].length());
			}
		}
	}

}

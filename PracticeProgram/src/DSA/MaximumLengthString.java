package DSA;

public class MaximumLengthString {
	public static void main(String[] args) {
		String[] arr = {"Sree","Harsha","SreeHarsha"};
		int maxLenght = 0;
		for(int  i = 0; i<arr.length; i++) {
			int actLength = arr[i].length();
			if(actLength>maxLenght) {
				maxLenght = actLength;
			}
		}
		System.out.println(maxLenght+ ": is the Max Length of the char");
        for(int i=0;i<arr.length;i++) {
        	if(arr[i].length()==maxLenght) {
        		System.out.println(arr[i]+ "= "+arr[i].length());
        	}
        }
	}
}

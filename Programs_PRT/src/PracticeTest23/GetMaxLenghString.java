package PracticeTest23;

public class GetMaxLenghString {
	public static void main(String[] args) {
		String[] arr= {"naveen","Windows","naveenap9902","testprogram"};
		String max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>max.length())
			{
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(max.length()==arr[i].length())
			{
				System.out.println(max.length()+" String is  "+arr[i]);
			}
		}
	}

}

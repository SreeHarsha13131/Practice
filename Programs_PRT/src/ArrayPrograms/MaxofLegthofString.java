package ArrayPrograms;

public class MaxofLegthofString {
	public static void main(String[] args) {
		String arr[]= {"hello","windows123","Testyanedtra","mango"};
		String max=arr[0];
		//get the maximum length if the string
		for(int i=0;i<arr.length;i++)
		{	
			if(arr[i].length()>max.length())				
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		//compare all the string value length with max length
		for(int i=0;i<arr.length;i++)
		{
			if(max.length()==arr[i].length())
			{
				System.out.println(arr[i]);
			}
		}
	}
}

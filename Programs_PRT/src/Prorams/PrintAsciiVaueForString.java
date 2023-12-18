package Prorams;

public class PrintAsciiVaueForString {
	
	public static void main(String args[]) 
	{
		String s="naveen";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			sum=sum+ch;
		}
		System.out.println(sum);
	}

}

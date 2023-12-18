package TestPackage;

public class DecendingOrder {
	
		public static void main(String[] args){
		String s ="geeks";
		//skgee
		char[] ar=s.toCharArray();

		for( int i=0;i<ar.length;i++)
		{
		for(int j=i+1;j<ar.length;j++)
		{
		if(ar[i]<ar[j])
		{
		char temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
		}
		}
		for(int k=0;k<ar.length;k++){
		System.out.print(ar[k]);
		}
		}
		}

}

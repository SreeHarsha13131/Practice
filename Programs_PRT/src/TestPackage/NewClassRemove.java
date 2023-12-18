package TestPackage;

public class NewClassRemove {
	
	public static void main(String[] args) {
		String s="ab漢字c汉12333字6AGH漢字@!";
		char[] a1 = s.toCharArray();
		String new1="";
		for(int i=0;i<a1.length;i++) {
			if(a1[i]>=0&&a1[i]<=65||a1[i]>=65&&a1[i]<=90||a1[i]>=95&&a1[i]<=120) {
			System.out.print(a1[i]);
		}
		}
	
		
		
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)<=1&&s.charAt(i)>=10||s.charAt(i)>=65&&s.charAt(i)<=120)
//			{
//				new1=new1+s.charAt(i);
//			}
//			System.out.println(new1);
//		}
	}
	

}

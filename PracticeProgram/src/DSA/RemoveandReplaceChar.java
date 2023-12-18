package DSA;

public class RemoveandReplaceChar {
	public static void main(String[] args) {
		String s = "Sreedarsda";
		char[] ch = s.toCharArray();
		for(int i = 0; i<ch.length;i++) {
			if(ch[i]=='d') {
				ch[i]='h';
			}			
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}

	}

}

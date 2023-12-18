package DSA;
import java.util.LinkedHashSet;
public class RemovetheduplicateChractes {
	public static void main(String[] args) {
		String s = "Veera";
		LinkedHashSet<Character> a = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			a.add(s.charAt(i));
		}
		for(char x:a)
		{
			System.out.print(x);
		}
	}
}

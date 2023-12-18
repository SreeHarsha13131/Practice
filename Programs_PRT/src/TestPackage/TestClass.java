package TestPackage;

public class TestClass {
	public static void main(String[] args) {
		
		int[] a= {5, 7, 7, 8,7, 9, 8,6 };
		//5, 7, 8, 9, 6
		int[] b;
		int ini=a[0];
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count=count+1;
				}
				//System.out.println(a[i]);
			}
			if(count==1||count==2) {
				System.out.println(a[i]);
			}
		}
	}

}

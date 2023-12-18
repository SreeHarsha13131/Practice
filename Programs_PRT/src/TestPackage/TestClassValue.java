package TestPackage;

class TestClassValuenew {
	
	static int accounts(){
		int msal = 10000;
		int nYears = 12;
		return msal * nYears;
		}
}
public class TestClassValue{
		public static void main(String []args){
			
		//int x = accounts();
		int bonus = 20000;
		int total = bonus;
		System.out.println(TestClassValuenew.accounts() +"Total salary is"+total);
		}

}

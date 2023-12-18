package TestPackage;

public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading1 m1=new MethodOverloading1();
		m1.num(400000000, 20000000);
	}
}
class MethodOverloading1{
	void num(int a,int b) {
		System.out.println("Int is executed " +a+b);
	}
	void num(long a,long b) {
		System.out.println("f is executed");
		System.out.println(a+b);
	}
}

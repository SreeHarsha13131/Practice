package Oops;
class Parent {
	static void staticMethod() {
		System.out.println("Static method in Parent");
	}
}
class Child extends Parent {
	static void staticMethod() {

		System.out.println("Static method in Child");
//		super.staticMethod();
	}
}
public class Main {
	public static void main(String[] args) {
		//        Parent parent = new Child();
		Child child = new Child();
		child.staticMethod(); // Calls Parent's static method, not Child's.
		child.staticMethod();
		//        Child.staticMethod();
		//        Parent.staticMethod();

	}
}
//In this example, even though parent is of type Child, the reference type is Parent, and therefore, it calls Parent's static method, not Child's. This demonstrates that static methods do not participate in method overriding or polymorphism and are determined solely by the reference type.







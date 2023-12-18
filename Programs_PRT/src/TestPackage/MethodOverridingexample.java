package TestPackage;

	class Kitkat{
		void display(){
		System.out.println("4mp camera");
		}
		}
		class Lopipop extends Kitkat{
		@Override
		void display(){
		System.out.println("8mp camera");
		//super.display();
		}
		}
		class MethodOverridingexample{
		public static void main(String [] dp){
			Lopipop funcall = new Lopipop();
		funcall.display();
		}
		}


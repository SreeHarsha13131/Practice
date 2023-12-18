package TestPackage;

	class Sample{
		void add(){
		System.out.println("heyyy you");
		}
		}
		class Demo extends Sample {
		void disp(){
		System.out.println("Demo:disp");
		}
		void add(){
		System.out.println("Demo:add");
		super.add();
		}
		}
		class RunTimePolyTest{
		public static void main(String[] args){
			Demo s1 = new Demo();
		s1.add();
		s1.disp();
		}
}

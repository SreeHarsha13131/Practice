package TestPackage;

public class PassByRefernce {
		int totalEmp = 5000;
		public static void main(String []args){
		System.out.println("******main starts******");
		PassByRefernce hr = new PassByRefernce();
		PuneHr.needcandi(hr);
		BlgHr.needcandi(hr);
		System.out.println("********main ends*******");
		}
		}
		class PuneHr{
		static void needcandi(PassByRefernce pune){
		pune.totalEmp = 3000;
		System.out.println(pune.totalEmp);
		}
		}
		class BlgHr{
		static void needcandi(PassByRefernce blg){
		blg.totalEmp = 1500;
		System.out.println(blg.totalEmp);
		}
		}



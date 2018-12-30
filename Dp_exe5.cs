using System;
delegate int NumberChanger(int a, int b);
namespace DelegateAppl(){
	class TestDelegate{
		public static int add(int a, int b){
			return a + b;
		}
		public static int mult(int a, int b){
			return a * b;
		}

		static void Main(string[] args){
			NumberChanger inst1 = new NumberChanger(AddNum);
			NumberChanger inst2 = new NumberChanger(MultNum);
		
			int sum = inst1(5);
			Console.WriteLine("Value of Num: {0}",sum);
			int prod = inst2(5);
			Console.WriteLine("Value of Num: {0}",prod);
		}	
	}
}
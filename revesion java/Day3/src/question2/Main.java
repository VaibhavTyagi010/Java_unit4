package question2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	interface Interface1{
//		void method1();
//	}
//
//	interface Interface2 extends Interface1{
//		void method2();
//	}
//	one interface can extends other Interface but class to extend interface only implements it and interface con not implements interface
//	
//	

	
//	interface Interface1{
//		void method1();
//	}
//
//	interface Interface2 extends Interface1{
//		void method2();
//	}
//
//	interface Implementation implements Interface2{
//		void method2();
//	}
//	 interface con not implements interface we only extend interface

	
//	interface Interface1{
//		void method1();
//	}
//
//	interface Interface2 extends Interface1{
//		void method2();
//	}
//
//	interface Implementation implements Interface2{
//		void method1();
//		void method2();
//	}
//	
//	interface con not implements interface we only extend interface
	
	
	
//	abstract class ImplementationAbstract implements Interface2{
//		public void method1() { }
//	}
//	if interface2 hold any abstarct method then we override first ontherwise code give error


//	interface Interface3 {
//		int test;
//	}
//we create it but by defoult test is public static final so first inisealize value;

//	interface Interface3 {
//		int test = 5;
//	}
//	//we create it but by defoult test is public static final so first inisealize value;


	
	
//	interface Interface4{
//		default void print(){
//			System.out.println("default");
//		}
//	}
//	after java 8 we define default method also in interface
	
//	interface Interface4{
//		default void print(){
//			System.out.println("default");
//		}
//	}
//
//	class Test implements Interface4{
//
//	}
//
//	Test test = new Test();
//	test.print();	
//	
//	it give error becouse object create only inside method
	
//	
//	interface Interface4{
//		default void print(){
//			System.out.println("default");
//		}
//	}
//
//	class Test1 implements Interface4{
//		public void print(){
//			System.out.println("override");
//		}
//	}
//
//	Test1 test = new Test1();
//	test.print()
//	print override because child object create it give priorty our functions 

}

package question2;

public class Main {
	
  /*
   line5 give error because Interface only hold variable which is public static or final
   if we don't make public static final then by default it's and if we try to create it private then it's give an error 
   */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	interface ExampleInterface1 {
		int value1 = 10; // Line 1
		public int value2 = 15; // Line 2
		public static int value3 = 20; // Line 3
		public static final int value4 = 25; // Line 4
		private int value5 = 10; // Line 5
}
	/*
	 no error come in this interface because interface hold abstract method and default method also hold.  
	 */
	interface ExampleInterface2 {
		void method1();

		default void method5() {
				System.out .println("Method5");
		}
}
}

package com.masai;

public class Static {
	
 int num=10; //it's a non-static variable
 static int num1=20; //it's a static variable

	public static void main(String[] args) {
    		
      System.out.println(num1);//easily access static variable in static function
      //System.out.println(num);//not access non-static variable in static function like that
      Static n= new Static() ; //to access non-static variable create object of class
      System.out.println(n.num);
       n.fun();
      
	}//it's a static method
  
	void fun()
	{
		System.out.println(num1);//easily access static variable in static variable
		System.out.println(num);//easily access non-static variable in non-static variable
	}//it's a non-static method
	
}

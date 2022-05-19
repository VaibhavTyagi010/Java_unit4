package com.masai;

public class Student {
	  int roll=76;
	    String name="vishu tyagi";
	    int marks=87;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
    Student s1= new Student();
    Student s2= new Student();
    s1.displayStudentDetails();
    s2.displayStudentDetails();
    s1=null;
    s2=null;
    		
    
	}
	void displayStudentDetails()
	{
		System.out.print(" roll num:- "+roll+"\n name:- "+name+"\n marks:- "+marks+"\n");
	}
	

}

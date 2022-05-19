package com.masai;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c=new Check();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		char a=sc.next().charAt(0);
		c.check1(a);

	}
   void check1(char a)
   {
	   String l="BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
	   String v="AEIOUaeiou";
	   for(int j=0;j<v.length();j++)
	   { 
		   if(v.charAt(j)==a)
		   {
	        System.out.println("that character "+a+" is vowel "); 
	        return ;
		   }
	   }
	   
	   for(int i=0;i<l.length();i++)
	   {
		   if(l.charAt(i)==a)
		   {
			   System.out.println("that character "+a+" is consonant");
			   return ;
		   }
		   
	   }
	   System.out.println("invalid character");
	   
   }
}

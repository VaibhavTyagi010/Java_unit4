package com.masai;

import java.util.Scanner;

public class Primefactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a number: ");  
		int num= sc.nextInt(); 
	if(num<2 || 100<num)
	System.out.println("Invalid number");
	else
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}
	

	}

}

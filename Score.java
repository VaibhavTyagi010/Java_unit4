package com.masai;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		int result=0;
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a run repeat 1: ");  
		int num1= sc.nextInt(); 
		result+=(num1*1);
		System.out.print("Enter a run repeat 2: ");  
		int num2= sc.nextInt();
		result+=(num2*2);
		System.out.print("Enter a run repeat 3: ");  
		int num3= sc.nextInt();
		result+=(num3*3);
		System.out.print("Enter a run repeat 4: ");  
		int num4= sc.nextInt();
		result+=(num4*4);
		System.out.print("Enter a run repeat 6: ");  
		int num5= sc.nextInt();
		result+=(num5*6);
	System.out.println("score of batsman : "+result);

	}

}

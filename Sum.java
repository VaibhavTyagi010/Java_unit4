package com.masai;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a number: ");  
		int num= sc.nextInt(); 
	
	int ans;
	ans=(num*(num+1)/2);
	System.out.println(ans);
	}
}

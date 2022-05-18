package com.masai;
import java.util.Scanner; 
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a city: ");  
		String str= sc.nextLine();              //reads string  
		switch(str)
		{
		case "Mumbai":
			System.out.print("Financial city"); 
			break;
		case "Kolkata":
			System.out.print("City of Joy"); 
			break;
		case "Delhi":
			System.out.print("Capital of the country"); 
			break;
		case "Bangalore":
			System.out.print("Cyber City"); 
			break;
		
		 default:
		System.out.print("May be Other Indian City");		
		}

	}

}

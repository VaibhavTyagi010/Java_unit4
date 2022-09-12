package question2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your lottery number");
         int num= sc.nextInt();
         sc.close();
         int l_num=123;
         if(l_num==num)
         {
        	 System.out.println("the award is $10,000");
        	 return;
         }
         else
         {
        	 String str=Integer.toString(num);
        	 String str1=Integer.toString(l_num);
        	 String arr[]=str.split("");
        	 String arr1[]=str1.split("");
        	 Arrays.sort(arr);
        	 Arrays.sort(arr1);
        	 if(Arrays.equals(arr, arr1)==true)
        	 { System.out.println("the award is $3,000");
        	 
        	 return;
        	 }
        	 else
        	 {
        		 for(int i=0;i<arr.length;i++)
        		 {
        			 for(int j=0;j<arr1.length;j++)
        			 {
        				 if(arr[i].equals(arr1[j]))
        				 {	 System.out.println("the award is $1,000");
        				 return;
        				 }
        				 }
        			 }
        		 }
        	 }
         }
	}



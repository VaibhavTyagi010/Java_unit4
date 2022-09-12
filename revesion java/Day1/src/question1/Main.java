package question1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int x = 0, y = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter circle x and y point");
        int circle_x = sc.nextInt();
        int circle_y = sc.nextInt();
        int radius = 10;
 
        if (isInside(circle_x, circle_y, radius, x, y))
            System.out.print("Inside");
        else
            System.out.print("Outside");
	}
	
	
	   static boolean isInside(int circle_x, int circle_y, int radius, int x, int y)
{

if ((x - circle_x) * (x - circle_x) +(y - circle_y) * (y - circle_y) <= radius * radius)
return true;
else
return false;
}

}

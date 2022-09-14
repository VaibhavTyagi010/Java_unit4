package question3;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	static List<Publication> list =new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publication p1=new Book(12, 200, "xyz");
		list.add(p1);
		Publication p2=new Book(12, 200, "xyz");
		list.add(p2);
		Publication p3=new Book(12, 200, "xyz");
		list.add(p3);
		
	    Publication p11=new Journal(12, 200, "xyz");
				list.add(p11);
	    Publication p12=new Journal(12, 200, "xyz");
				list.add(p12);
		for(Publication p: list)
		{
			System.out.println(p);
		}
	}

}

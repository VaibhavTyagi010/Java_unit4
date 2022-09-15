package Mobile;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		 List<Contact>list =new ArrayList<>();
		 list.add(new Contact("Vishu","9536402240"));
		 list.add(new Contact("Ajya","9536402241"));
		 list.add(new Contact("Vijya","9536402242"));
		 list.add(new Contact("Arpan","9536402240"));
		
		
		MobilePhone mp= new MobilePhone(list, "my numbers");
		//System.out.println(mp.removeContact(new Contact("Ajya","9536402241")));
	//	System.out.println(mp.findContact(new Contact("Ajya","9536402241")));
		System.out.println(mp.queryContac("Ajya"));
	//	mp.printContacts();
		
	}

}

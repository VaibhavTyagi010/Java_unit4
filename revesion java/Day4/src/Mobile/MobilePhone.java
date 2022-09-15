package Mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

	
	private List<Contact>myContacts =new ArrayList<>();
    private String called_myNumber ;
    
	public MobilePhone(List<Contact> myContacts, String called_myNumber) {
		super();
		this.myContacts = myContacts;
		this.called_myNumber = called_myNumber;
	}
	
	public boolean addNewContact(Contact c1)
	{  if(c1!=null)
		{myContacts.add(c1);
		return true;
		}
	    return false;
	}
	public boolean updateContact(Contact old,Contact new1)
	{
		for(int i=0;i<myContacts.size();i++)
		{  Contact c1=myContacts.get(i);
			if(c1.getName().equals(old.getName()) && c1.getNumber().equals(old.getNumber()))
			{
				c1.setName(new1.getName());
				c1.setNumber(new1.getNumber());
				return true;
			}
		}
		return false;
	}
	
	public boolean  removeContact(Contact old)
	{
		for(int i=0;i<myContacts.size();i++)
		{  Contact c1=myContacts.get(i);
			if(c1.getName().equals(old.getName()) && c1.getNumber().equals(old.getNumber()))
			{
				myContacts.remove(i);
				return true;
			}
		}
		return false;
	}
	public int  findContact(Contact old)
	{
		for(int i=0;i<myContacts.size();i++)
		{  Contact c1=myContacts.get(i);
			if(c1.getName().equals(old.getName()) && c1.getNumber().equals(old.getNumber()))
			{
				
				return i;
			}
		}
		return -1;
	}
	
	public int  findContact(String old)
	{
		for(int i=0;i<myContacts.size();i++)
		{  Contact c1=myContacts.get(i);
			if(c1.getName().equals(old) || c1.getNumber().equals(old))
			{
				
				return i;
			}
		}
		return -1;
	}
	public String  queryContac(String name)
	{
		for(int i=0;i<myContacts.size();i++)
		{  Contact c1=myContacts.get(i);
	
			if(c1.getName().equals(name))
			{
				
				return c1.getNumber();
			}
		}
		return null;
	}
	
	public void printContacts()
	{
		System.out.println("Contact List:");
		for(int i=0;i<myContacts.size();i++)
		{     Contact c1=myContacts.get(i);
			System.out.println(i+1+". "+c1.getName()+" -> "+c1.getNumber());
			
		}
	}
	
	
	
	
	
}

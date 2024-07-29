import java.util.LinkedList;
import java.util.Scanner;
public class StudentRecordManagement
{
	LinkedList<Record>list;
	public StudentRecordManagement()
	{
		list = new LinkedList<>();
	}
	public void add(Record record)
	{
		if(!find(record.getIdNumber()))
		{
			list.add(record);
		}
		else
		{
			System.out.println("Record already exists in the Reocrd list");
		}
	}
	public bollean find(int idNUmber)
	{
		for(Record l:list)
		{
			if(l.getIdNumber()==idNUmber)
			{
				System.out.println(l);
				return true;
			}
		}
		return false;
	}
	public void delete((int recIdNumber)
	{
		Record recordDel = nul;
		for (Record ll : list)
		{`	
			if(ll.getIdNumber()==recIdnumber)
			{
				recordDel=ll;
			}
		}
		if(recordDel==null)
		{
			System.out.println("Invalid record Id");
		}
		else
		{
			list.remove(recordDel);
			System.out.println("Successfully removed record from the list");
		}
	}
	public Record findrecord(int idNumber)
	{
		for (Record l:list)
		{
			if(l.getIdNumber()==idNumber)
			{
				return l;
			}
		}
		return null;
	}
	public void update(int id,Scanner input)
	{
		if(find(id))
		{
			Record rec = findRecord(id);
			System.out.println("what is the new student id number?");
			int idNumber =  input.nextInt();
			System.out.println("What is the new student contact Number");
			int contactNumber = input.nextInt();
			input.nextLine();
			System.out.print("what is the new student name>");
			String name = input.nextLine();
			rec.setIdNumber(idNumber);
			rec.setName(name);
			rec.setContactNumber(contactNumber);
			System.out.println("Record Updated Successfully");
		}
		else
		{
			System.out.println("Record not found in the student list");
		}
	}
	public void display()
	{
		if(list.isEmpty())
		{
			System.out.println("The list has no record");
		}
		for(Record record : list)
		{
			System.out.println(record.toString());
		}
	}
}




















			
	
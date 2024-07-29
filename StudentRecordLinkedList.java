import java.util.*;
public class StudentRecordLinkedList
{
	public static void main(String[] args)
	{
		StudentRecordManagement hr =  new StudentRecordManagement();
		Record record = new Record();
		record.setIdNumber(6869);
		record.setContactNumber(911);
		record.setName("Ankit");
		hr.add(record);
		Scanner input = new Scanner(System.in);
		int option = 0;
		do
		{
			menu();
			option = input.nextInt();
			switch(option)
			{
				case 1:
					System.out.println("what is the Student Id Number!");
					int idNumber = input.nextInt();
					System.out.println("What is the contact Number !");
					int contactNumber = input.nextInt();
					System.out.println("What is the Student Name!");
					String name= input.nextLine();
					record = new Record(name,idNumber,contactNumber);
					hr.add(record);
					System.out.println(record.toString());
					break;
				case 2:
					System.out.println("what is the Student Id Number!");
					int rId = input.nextInt();
					hr.delete(rId);
					break;
				case 3:
					System.out.println("what is the Student Id Number!");
					int rIdNo = input.nextInt();
					hr.update(rIdNo,input);
					break;
				case 4:
					System.out.println("what is the Student Id !");
					int bookId = input.nextInt();
					if(!hr.find(bookId))
					{
						System.out.println("Student id does not exit\n");
					}
					break;
				case 5:
					hr.display();
					break;
				case 9:
					System.out.println("\nthank you for using the program Goodbye!\n");
					break;
				default:
					System.out.println("\nInvalid input");
					break;
			}
		}
		while(option!=9);
	}
public static void menu()
	{
		System.out.println("MENU");
		System.out.println("1. Add Student");
		System.out.println("2. Delete Student");
		System.out.println("3. Update Student");
		System.out.println("4. Search Student");
		System.out.println("5. Display Students");
		System.out.println("9. Exit ");
		System.out.println("Enter your selection");
	}
}


import java.util.Scanner;
public class electricbill
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter your Option: \n\t1.Commercial\n\t2.Domestic\n\t3.Exit");
		int option = sc.nextInt();
		
		switch(option)
		{
			case 1:
				System.out.println("Enter your Bill Number:");
				int billno = sc.nextInt();		
				System.out.println("Enter Your Unit supplied to your home : ");
				int unit = sc.nextInt();
				{
				if((unit>=1)&&(unit<=100))
				{
					System.out.println("ELECTRIC BILL");
					System.out.println("Bill No : "+billno);
					System.out.println("No Cost For You");
				}
				else if((unit>100)&&(unit<=400))
				{
					System.out.println("ELECTRIC BILL");
					System.out.println("Bill No : "+billno);
					System.out.println("Cost is 5 rupees ");
				}
				else if((unit>400)&&(unit<=500))
				{
					System.out.println("ELECTRIC BILL");
					System.out.println("Bill No : "+billno);
					System.out.println("Cost is 10 rupees");
				}
				else if((unit>500)&&(unit<900))
				{
					System.out.println("ELECTRIC BILL");
					System.out.println("Bill No : "+billno);
					System.out.println("Cost is 20 rupees");
				}
				else if((unit>900)&&(unit<=100  00))
				{
					System.out.println("ELECTRIC BILL");
					System.out.println("Bill No : "+billno);
					System.out.println("Cost is 20 rupees");
				}
				
				}
				break;
			case 2:
				System.out.println("Enter your Bill Number:");
				int billno1 = sc.nextInt();
				System.out.println("Enter Your Unit supplied to your home : ");
				int unit1 = sc.nextInt();
				if((unit1>=1)&&(unit1<=100))
				{
					System.out.println("ELECTRIC BILL");
					System.out.println("Bill No : "+billno1);
					System.out.println("Cost is 1 rupees");
				}
				else if((unit1>100)&&(unit1<=400))
				{
					System.out.println("ELECTRIC BILL");
					System.out.println("Bill No : "+billno1);
					System.out.println("Cost is 10 rupees ");
				}
				else if((unit1>400)&&(unit1<=500))
				{
					System.out.println("ELECTRIC BILL");
					System.out.println("Bill No : "+billno1);
					System.out.println("Cost is 20 rupees");
				}
				else if((unit1>500)&&(unit1<=900))
				{
					System.out.println("ELECTRIC BILL");
					System.out.println("Bill No : "+billno1);
					System.out.println("Cost is 50 rupees");
				}
				break;
			case 3:
				System.out.println("THANK YOU SO MUCH SIR | MADAM ");
				break;		
		}
		
	}
}
		
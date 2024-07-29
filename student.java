import java.util.Scanner;
public class student
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Standard:");
		int sta =sc.nextInt();
		System.out.println("Enter French mark:");
		int fre = sc.nextInt();
		System.out.println("Enter English mark:");
		int eng =sc.nextInt();
		System.out.println("Enter Maths mark:");
		int mat= sc.nextInt();
		System.out.println("Enter Science mark:");
		int sci = sc.nextInt();
		System.out.println("Enter Social mark:");
		int soc = sc.nextInt();
		System.out.println("Enter your option :\n\t1.Swimming\n\t2.cricket\n\t3.tennis\n\t4.chess");
		int ex = sc.nextInt();
		std s1=new std();
		s1.marklist(fre,eng,mat,sci,soc);
		s1.fees(sta);
		s1.extra(ex);
	}
}
class std
{
	static void marklist(int fre,int eng,int mat,int sci,int soc)
	{
		System.out.println("MARK LIST");
		System.out.println("French : "+fre+"\tEnglish: "+eng+"\nMaths : "+mat+"\tScience: "+sci+"\nSocial: "+soc);
		int tot = fre+eng+mat+sci+soc;
		System.out.println("Total Marks : "+tot);
		int avg = tot/5;
		System.out.println("Average Mark : "+avg);
	}
	static void fees(int sta)
	{
		System.out.println("Your Standard : "+sta);
		if(sta==10)
		{
			System.out.println("Your Fees is 60,000");
		}
		else if(sta==11)
		{
			System.out.println("Your Fees is 80,000");
		}
		else if(sta==12)
		{
			System.out.println("Your fees is 1,00,000");
		}
		else
		{
			System.out.println("Your fees is 50,000");
		}
	}
	static void extra(int ex)
	{
		
		switch(ex)
		{
			case 1:
				System.out.println("For Swimming fees : 15000");
				break;
			case 2:
				System.out.println("For Cricket fees : 10000");
				break;
			case 3:
				System.out.println("For Tennis fees : 7000");
				break;
			case 4:
				System.out.println("For Chess fees : 5000");
				break;
		}
	}
}
		
		
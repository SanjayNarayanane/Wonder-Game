import java.util.Scanner;
public class vote
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age :");
		int age = sc.nextInt();
		if(age>=18)
		{
			System.out.println(" your are eligible to vote");
		}
		else
		{
			System.out.println("your aren't eligible to vote");
		}
	}
}
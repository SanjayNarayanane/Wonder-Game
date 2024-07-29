import java.util.Scanner;
	public class law
	{
		public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Place of Occurence : ");
		String place = sc.nextLine();
		System.out.println("Enter Name :");
		String name = sc.nextLine();
		System.out.println("Enter Initial : ");
		String initial = sc.nextLine();
		System.out.println("Enter occupation: ");
		String occ = sc.nextLine();
		System.out.println("Enter Address : ");
		String add = sc.nextLine();
		System.out.println("Enter Criminal Phone no : ");
		String cri_no = sc.nextLine();
		System.out.println("Married Or Un-Married (Yes/no): ");
		String mar = sc.nextLine();
		
		
		System.out.println("Enter Father Name : ");
		String fat = sc.nextLine();
		System.out.println("Enter Mother Name : ");
		String mon = sc.nextLine();
		System.out.println("Father Occupation : ");
		String occ1 = sc.nextLine();
		System.out.println("Mother Occupation : ");
		String occ2 = sc.nextLine();
		System.out.println("Enter Criminal Age : ");
		int age = sc.nextInt();
		System.out.println("Enter Criminal Height : ");
		int height = sc.nextInt();
		System.out.println("Enter Criminal Weight : ");
		int weight = sc.nextInt();
		
		System.out.println("Enter of No of Cases Registered : ");
		int no_case = sc.nextInt();
		System.out.println("Solo (Or) Gang in numbers :");
		int sg = sc.nextInt();
		
		System.out.println("Enter case option :\n\nINDIAN PENAL CODE\n\n\t1.murder or culpablehomicide\n\t2.attempt to murder\n\t3.act of rape\n\t4.cheating registratiand dishonestly\n\t5.cruelty towards a woman\n\t6. unnatural offenses\n\t7.acts of sexual harassment\n\nCODE OF CRIMINAL PROCEDURE \n\n\t8.police to arrest individuals\n\t9.on of First Information Report (FIR)\n\t10.the police to examine witnesses\n\t11. the time limits for the detention of an accused personn\n\t12.personal appearance in court\n\t13.the examination of the accused\n\t14.empowers the High Court to exercise \n\t15. the prior sanction required for the prosecution of public servants.\n\nCONSITUTION OF INDIA\n\n\t16.lays down the principles to be followed by the state\n\t17.the structure and powers of the central government.\n\t18.the organization and powers of the state governments\n\t19. a three-tier system of Panchayati Raj institutions in rural areas.\n\t20.devolution of powers and responsibilities to local authorities\n\nPROTECTION OF WOMEN \n\n\t21.protection and legal remedies to women \n\t22.cruelty by a husband or his relatives towards a married woman.\n\t23.the offense of assault or criminal force on a woman\n\t24. the offense of rape.\n\t25.sexual harassment of women in workplaces. \n\nRIGHT TO INFORMATION\n\n\t26.various terms used in the RTI Act\n\t27.the right to information and provides every citizen\n\t28.the process of filing an application for seeking information.\n\t29.the duties of the PIO upon receiving a request for information.\n\t30.the provisions of the RTI Act override any inconsistent \n\n");
			int option = sc.nextInt();
			if(option!=0)
			{
			switch(option)
			{
				case 1:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\t\t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\t\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\t\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\t\t\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\t\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg+"members");
					System.out.println("\n\t\t\t\t"+name+" is arrested in murder under section 299-304 ");
					System.out.println("\n\t\t\t\tRecord of the Criminal is Registered Successfully");
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
					
				case 2:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested in  attempt to murder under Section 307 ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			
				case 3:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested in Rape under Section 376 ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
				case 4:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested in  cheating and dishonestly under Section 420 ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
				System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
				case 5:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested in cruelty towards a woman under Section 498A");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
				case 6:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested in unnatural offenses under Section 377 ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
				case 7:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested in acts of sexual harassment  under Section 509 ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 8:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrest individuals under Section 41");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
			case 9:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrest due to  First Information Report (FIR)  under Section 154 ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 10:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested by police to examine witnessesin under Section 161 ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 11:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested by the time limits for the detention of an accused personn under Section 167 ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 12:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested for  personal appearance in court under  Section 205");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 13:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested for the examination of the accusedunder Section 313 ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 14:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested by empowers the High Court to exercise under Section 482 ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 15:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested by the prior sanction required for the prosecution of public servants under Section 482");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 16:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested for lays down the principles to be followed by the state (Articles 12-35) ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 17:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested  by the structure and powers of the central government (Articles 36-51) ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 18:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested by the organization and powers of the state governments (Articles 52-151) ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 19:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested for  three-tier system of Panchayati Raj institutions in rural areas  (Articles 243-243O) ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 20:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested for devolution of powers and responsibilities to local authorities (Articles 243P-243ZG)");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 21:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested for protection and legal remedies to women  Section 498A");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 22:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested for cruelty by a husband or his relatives towards a married woman Section 354  ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 23:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested for the offense of assault or criminal force on a woman  Section 376  ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 24:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested for the offense of rape Act, 2013 ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 25:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested for sexual harassment of women in workplaces Act, 1961 ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
		System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");	break;
			case 26:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested for various terms used in the RTI Act Act, 1961:");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 27:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested for the right to information and provides every citizen Section 2 ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
		System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");	break;
			case 28:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested for the process of filing an application for seeking information Section 3");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
		System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");	break;
			case 29:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\t\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested for the duties of the PIO upon receiving a request for information Section 4");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
			System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");break;
			case 30:
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-First Information Report-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
					System.out.println("\n\t\tCriminal Name : "+name+" \t\tCriminal Initial : "+initial);
					System.out.println("\n\t\tCriminal Height : "+height+"\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no+"\tPlace of Occurence : "+place);
					System.out.println("\n\t\tOccupation : "+occ+"\t\tMarital Status : "+mar);
					System.out.println("\n\t\tAddress : "+add);
					System.out.println("\n\t\tFather Name: "+fat+"\t\tMother Name: "+mon);
					System.out.println("\n\t\tFather's Occupation: "+occ1+"\tMother's Occupation: "+occ2);
					System.out.println("\n\t\tNo of Cases Registered : "+no_case+"\t\tSolo (or) Gang : "+sg);
					System.out.println("\n\t\t"+name+" is arrested for the provisions of the RTI Act override any inconsistent Section 22 ");
					System.out.println("\n\t\tRecord of the Criminal is Registered Successfully");
					System.out.println("\n\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
			break;
		}
	}
			
		
		/* no of cases , occupation for both father and mother ,no of people in family,gang or solo,gang members
		
		law1 l = new law1();
		l.la(option,name,height,weight,cri_no,occur);
		if(option==1)
		{
			System.out.println("\n----------First Information Report----------");
					System.out.println("\n\t\tCriminal Name : "+name);
					System.out.println("\n\t\tCriminal Height : "+height);
					System.out.println("\n\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no);
					System.out.println("\n\t\tPlace of Occurence : "+occur);
					System.out.println(name+"\n\t is arrested in section 299-304 ");
			
		}
		else if(option == 2)
		{
					System.out.println("\n----------First Information Report----------");
					System.out.println("\n\t\tCriminal Name : "+name);
					System.out.println("\n\t\tCriminal Height : "+height);
					System.out.println("\n\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no);
					System.out.println("\n\t\tPlace of Occurence : "+occur);
					System.out.println(name+"\n\t is arrested in section 299-304 ");
		}
		else if(option == 3)
		{
			System.out.println("\n----------First Information Report----------");
					System.out.println("\n\t\tCriminal Name : "+name);
					System.out.println("\n\t\tCriminal Height : "+height);
					System.out.println("\n\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no);
					System.out.println("\n\t\tPlace of Occurence : "+occur);
					System.out.println(name+"\n\t is arrested in section 299-304 ");
		}
		else if(option == 4)
		{
					System.out.println("\n----------First Information Report----------");
					System.out.println("\n\t\tCriminal Name : "+name);
					System.out.println("\n\t\tCriminal Height : "+height);
					System.out.println("\n\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no);
					System.out.println("\n\t\tPlace of Occurence : "+occur);
					System.out.println(name+"\n\t is arrested in section 299-304 ");
			
		}
		else if(option == 5)
		{
					System.out.println("\n----------First Information Report----------");
					System.out.println("\n\t\tCriminal Name : "+name);
					System.out.println("\n\t\tCriminal Height : "+height);
					System.out.println("\n\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no);
					System.out.println("\n\t\tPlace of Occurence : "+occur);
					System.out.println(name+"\n\t is arrested in section 299-304 ");
			
		}
		else if(option == 6)
		{
					System.out.println("\n----------First Information Report----------");
					System.out.println("\n\t\tCriminal Name : "+name);
					System.out.println("\n\t\tCriminal Height : "+height);
					System.out.println("\n\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no);
					System.out.println("\n\t\tPlace of Occurence : "+occur);
					System.out.println(name+"\n\t is arrested in section 299-304 ");
			
		}
 		else if(option == 7)
		{
			System.out.println("\n----------First Information Report----------");
					System.out.println("\n\t\tCriminal Name : "+name);
					System.out.println("\n\t\tCriminal Height : "+height);
					System.out.println("\n\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no);
					System.out.println("\n\t\tPlace of Occurence : "+occur);
					System.out.println(name+"\n\t is arrested in section 299-304 ");
			
		}*/
		
	}
}
	/*class law1
	{
		static void la(int option,String name,int height,int weight,String cri_no,String occur)
		{
			
			switch(option)
			{
				case 1:
					System.out.println("\n----------First Information Report----------");
					System.out.println("\n\t\tCriminal Name : "+name);
					System.out.println("\n\t\tCriminal Height : "+height);
					System.out.println("\n\t\tCriminal Weight : "+weight);
					System.out.println("\n\t\tCriminal Phone No : "+cri_no);
					System.out.println("\n\t\tPlace of Occurence : "+occur);
					System.out.println(name+"\n\t is arrested in section 299-304 ");
			}
		}
	}*/
	
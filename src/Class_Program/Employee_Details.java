package Class_Program;

import java.util.Scanner;

public class Employee_Details {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int Id,Contact,Gross,Bonus;
		String name,Address;
		int bonus4=5000,bonus1=7000,bonus2=3000,bonus3=8000;
		System.out.println("Employee Id: ");
		Id=s.nextInt();
		System.out.println("Employee Name: ");
		name=s.next();
		System.out.println("Address: ");
		s.nextLine();
		Address=s.nextLine();
		System.out.println("Contact: ");
		Contact=s.nextInt();
		System.out.println("Salary: ");
		Gross=s.nextInt();
		if (Gross<=2000 && Gross>0)
		{
			System.out.println("Net Salary ="+(Gross+bonus4));	
		}
		else if (Gross<=30000 && Gross>0)
		{
		System.out.println("Better Salary ="+(Gross+bonus2));
		}
		else if (Gross<+50000 && Gross>0)
		{
			System.out.println("Good Salary ="+(Gross+bonus3));
			}
		else if (Gross<=40000 && Gross>0)
		{
			System.out.println("High Salary ="+(Gross+bonus1));
			System.out.println("Employee Id: "+Id);
			System.out.println("Employee Name: "+name);
			System.out.println("Address: "+Address );
			System.out.println("Contact: "+Contact);
			System.out.println("Salary: "+Gross);
			
		}

	}

}

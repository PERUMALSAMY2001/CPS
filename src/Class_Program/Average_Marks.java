package Class_Program;

import java.util.Scanner;

public class Average_Marks {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int id,m1,m2,m3,total,average,grade;
		String name;
		System.out.println("Student id: ");
		id=s.nextInt();
		System.out.println("Mark1: ");
		m1=s.nextInt();
		System.out.println("Mark2: ");
		m2=s.nextInt();
		System.out.println("Mark3: ");
		m3=s.nextInt();
		total=m1+m2+m3;
		average=total/3;
		System.out.println("total "+total);
		System.out.println("average "+average);
		if (average>=90) {
			System.out.println("Remark: Excellent");
		}
		else if (average>=80)
		{
		System.out.println("Remark: Very Good");
		}
		else if (average>=70)
		{
		System.out.println("Remark: Good");
		}
		else if (average>=60)
		{
		System.out.println("Remark: Work hard");
		}
		else
		{
		System.out.println("Remark: Fail");
		}
	}

}

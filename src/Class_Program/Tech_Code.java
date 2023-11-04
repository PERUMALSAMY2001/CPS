package Class_Program;

import java.util.Scanner;

public class Tech_Code {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		int len=0,num;
		String str =String.valueOf(n);
		len = str.length();
		if (len==4)
		{
			num = (n/100) + (n%100);
			if (num*num==n)
				System.out.println("Tech Number");
		}
		else if
		{
			System.out.println("Not a Tech Number");
		}
		else 
		{
			System.out.println("not a valid number");
		}
		s.close();
	}

}

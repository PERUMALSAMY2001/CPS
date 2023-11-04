package Class_Program;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int first,second;
		double result=0;
		char ch;
		System.out.println("Enter the first number: ");
		first=s.nextInt();
		System.out.println("Enter the second number: ");
		second=s.nextInt();
		System.out.println("Enter the operator(+,-,*,/): ");
		ch=s.next().charAt(0);
		switch (ch)
		{
		case '+':
		result=first+second;
		break;
		case '-':
		result=first-second;
		break;
		case '*':
			result=first*second;
			break;
		case '/':
			result=first/second;
			break;
			default:
				System.out.println("Error: operator is not correct");
		}
		/*
		 * int =%d / %i
		 * double =%f
		 * char = %c
		 * string =%s
		 * float =%f
		 */
		System.out.println("result ="+result);
		System.out.printf("format first =%f\n",result);
		System.out.printf("format with two decimal first = %.2f",result);
	}

}

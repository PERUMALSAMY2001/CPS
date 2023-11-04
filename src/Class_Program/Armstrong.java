package Class_Program;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.print("Enter the Number: ");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int result=number; 
		int temp;
		int check=0;
		while(number>0) {
			temp=number%10;
			check =check+(temp*+temp*+temp);
			number=number/10;
		}
		if (result==check) 
			System.out.println(" It is Armstrong: ");
			else 
				System.out.println("It is Not Armstrong: ");
		s.close();
	}
	
}

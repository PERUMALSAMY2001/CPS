package Class_Program;

import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner s=new Scanner (System.in);
		int number=0,sum=0;
		int result=1,digit;
		result = number*number;
		while (number>0) {
			digit =result%10;
			sum=sum+digit;
					result=result/10;
		}
		if (sum==number) {
			System.out.println("Neon Number: ");
		}
			else 
				System.out.println("Not Neon Number: ");
		s.close();
		}
		
		
				
		
		
		
			
			
		}



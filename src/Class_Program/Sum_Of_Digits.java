// Reverse the number
package Class_Program;

import java.util.Scanner;

public class Sum_Of_Digits {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n =s.nextInt();
		int rem,sum=0;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10; 
			}
		System.out.println(sum);
		s.close();
		}
		
	}
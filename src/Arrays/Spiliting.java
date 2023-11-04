package Arrays;

import java.util.Scanner;

public class Spiliting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(c*c==a*a+b*b) 
			System.out.println("Yes");
		else 
			System.out.println("No");
	}

}

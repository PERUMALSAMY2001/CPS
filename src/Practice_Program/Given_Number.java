package Practice_Program;

import java.util.Scanner;

public class Given_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,l,r;
		n=s.nextInt();
		l=s.nextInt();
		r=s.nextInt();
		if(n>l && n<r) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
}
}
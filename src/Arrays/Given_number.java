package Arrays;

import java.util.Scanner;

public class Given_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1[]=str.split(" ");
		int a=Integer.parseInt(str1[0]);
		int b=Integer.parseInt(str1[1]);
		System.out.println((int)Math.pow(a, b));
		
	}

}

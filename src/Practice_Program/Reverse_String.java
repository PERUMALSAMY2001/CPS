package Practice_Program;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		StringBuffer sb =new StringBuffer(str1);
		if(str1.equalsIgnoreCase(sb.reverse().toString()))
				System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		

	}

}

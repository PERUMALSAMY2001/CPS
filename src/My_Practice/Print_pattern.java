package My_Practice;

import java.util.Scanner;

public class Print_pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row;
		char ch;
		row=s.nextInt();
		for(int i=0;i<=row;i++) {
			for(int space=row;space>i;space--)
				System.out.print(" ");
			for(int j=1;j<=i;j++) {
			System.out.print(ch++ +" ");
		}
System.out.println();
	}

}
}

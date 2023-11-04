package Class_Program;

import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int result=0;
		for(int i=1; i<=n; i++) {
			result +=i;
		}
		System.out.println("Sum = "+result);
		s.close();
	}

}

import java.util.Scanner;

public class Biggest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;  //result;
		System.out.println("Enter the A Value: ");
	   a=s.nextInt();
	   System.out.println("Enter the B Value: ");
	   b=s.nextInt();
		if(a>b) 
			System.out.println("a is biggest number: "+a);
		else
			System.out.println("b is biggest number: "+b);
s.close();
	}
}

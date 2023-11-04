import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the First Number: ");
		a=s.nextInt();
		System.out.println("Enter the Second number: ");
		b=s.nextInt();
		//char operators;
		//string operators=s.nextLine();
		
		
		if (a<+b) {
			//System.out.println("+"+",-,*,/,% : ");
			System.out.println(a+b);
		}
		else if(a<-b) {
			System.out.println(" "+(a-b));
			}
		/*else if(a*b) {
			System.out.println(" "+(a*b));
			}
		else if(a</b) {
			System.out.println(" "+(a/b));
			}
		else (a%b) {
			System.out.println(" "+(a%b));
		}*/
			
	
}
}		
		


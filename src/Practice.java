import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number: ");
		int n,sum=0;
		n=s.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) 
				sum=sum+i;
				}
		if(sum>n) {
			System.out.println("It is Abundant");
			
		}
		else {
			System.out.println("It is Not Abundant");
		}
		}
		
		}


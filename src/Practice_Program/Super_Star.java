package Practice_Program;

import java.util.Scanner;

public class Super_Star {

	public static void main(String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("enter the num: ");
int n,sum=0;
n=s.nextInt();
while(n>=0) {
	if(n%10==0) {
	sum=sum+n;
	System.out.println("Sum is "+n);
	break;
	}
	n--;
	}
}
}
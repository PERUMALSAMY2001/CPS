package Practice_Program;

import java.util.Scanner;

public class Practice_Array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		System.out.println("Entwer Num: ");
		int n=s.nextInt();
		int flag=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0 &&n!=1) 
			System.out.println("Prime");
			else if(n!=1) 
				System.out.println("Not");
			}
		}
package Practice_Program;

import java.util.Scanner;

public class String_Swap {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the n value: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) 
			arr[i]=s.nextInt();
		if(n%2==0) {
			for(int i=1;i<n; i+=2)
		System.out.print(arr[i]+""+arr[i-1]+"");
		}
		else 
			for(int i=1;i<n-1;i+=2)
		System.out.print(arr[i]+""+arr[i-1]+"");
		System.out.print(arr[n-1]);
	}
	

}

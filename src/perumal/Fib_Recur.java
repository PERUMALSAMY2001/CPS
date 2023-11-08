package perumal;

import java.util.Scanner;

public class Fib_Recur {
	static void fib(int n,int f1,int f2,int f3) {
		if(f3<=n) {
			f3=f1+f2;
		System.out.print(f3+" ");
		 f1=f2;
		 f2=f3;
		 return;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Entert the Fib");
		int n=s.nextInt();
		int f1=0,f2=1,f3;
		System.out.print(f1+" "+f2+" ");
	}
}
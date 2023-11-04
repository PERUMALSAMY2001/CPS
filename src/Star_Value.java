import java.util.Scanner;

public class Star_Value {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int row=0,i,j,space=1;
		System.out.println("Enter the value");
		row=s.nextInt();
		space=row-1;
		for(i=1;i<=row;i++) {
			for(j=1;j<=space;j++) {
				System.out.print(" ");
			}
			space--;
			for(j=1;j<=2*(i-1);j++) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
		space=1;
		for(i=1;i<=row-1;i++) {
		for(j=1;j<=row-space;j++) {
			System.out.print(" ");
		}
		space++;
		}
		for(i=1;i<=2*(row-i);i++) {
			System.out.print("* ");
	}
		System.out.print(" ");
}	
}
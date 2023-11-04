package Arrays;

import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Radius of circle: ");
		float r=s.nextFloat();
		
		float area=(float)3.14*r*r;
		System.out.println(area);
		}

}

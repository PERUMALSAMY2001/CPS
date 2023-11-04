package Access_Modifier;

import java.util.Scanner;

public class Search_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in); 
		System.out.print("Enter No. of elements you want in array: ");
		int n=s.nextInt();
		int count=0;
		int arr[]=new int[n];
		System.out.println("Enter the All Elements: ");
		for(int i=0;i<n;i++) 
			arr[i]=s.nextInt();
			System.out.print("Enter the elements of which you want "+ "count number of occurrence: ");
			int Search=s.nextInt();
			for(int i=0;i<n;i++) {
				if (arr[i]==Search)
				count++;
		}
		if(count>0) {
			System.out.println("Number of Occurrence of the  Elements: "+count);
		}
			else
				System.out.println("Number of Occurrence of the Elements: "+count );
		}
	}
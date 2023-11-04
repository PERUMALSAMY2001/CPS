package Access_Modifier;

import java.util.Scanner;

public class Large_Small {

	public static void main(String[] args) {
		int n,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		 n=s.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter all the elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();		}
		for (int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
		System.out.println("Second Largest: "+arr[n-2]);
		System.out.println("Smallest: "+arr[0]);
		s.close();
}
}

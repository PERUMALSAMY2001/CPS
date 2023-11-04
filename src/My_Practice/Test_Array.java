package My_Practice;

public class Test_Array {

	public static void main(String[] args) {
		int arr[]= {1,20,9,10,5};
		int i=0,j=0,temp;
		for( i=0;i<arr.length;i++) {
			for( j=i+1;j<arr.length;j++) {
				//System.out.println(" "+arr[i]);
				//System.out.println(" "+arr[j]);
			if(arr[i]>arr[j]) {
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;	
			}
			
			}
			System.out.print(" "+arr[i]);
		}
		
	
	}
}
package Arrays;

public class Repeat_value {

	public static void main(String[] args) {
		int arr[]= {7,8,12,6,3,4,1,9,7,6,1,4};
		int repeat=0;
		for(int i=0;i<arr.length;i++) {
			if(arr [i]> repeat) 
				repeat=arr[i];
		}
		int sum[]=new int[repeat+1];
		for(int j=0;j<arr.length;j++) {
			sum[arr[j]]++;
		}
		for(int i=0;i<=repeat;i++) {
			if(sum[i]>1)
				System.out.println(i+ " ");
		}
		}

	}


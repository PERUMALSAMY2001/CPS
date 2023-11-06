package Arrays;

public class Biggest {

	public static void main(String[] args) {
		int a[]= {9,7,8,6,3,1,12,2,5};
		int result=0;
		for(int i=0;i<a.length;i++) {
			if(result<a[i])
				result=a[i];
			
		}
		System.out.println(result);
	}

}

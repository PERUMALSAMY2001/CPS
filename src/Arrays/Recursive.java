package Arrays;

public class Recursive {
	
	public static void main(String[] args) {
		int a[]= {9,10,12,22,49,58,78,100};
		recursive(a,0);
	}

	private static void recursive(int[] a, int i) {
		if(a.length==i) {
			return;
	}
		else {
			System.out.println(i+": "+a[i]);
			recursive(a,i+1);
		}
	
		
	}
}
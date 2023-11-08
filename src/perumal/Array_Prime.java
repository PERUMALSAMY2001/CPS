package perumal;

public class Array_Prime {

	public static void main(String[] args) {
		int  a[]= {13,17,21,31,5,999991,23,25};
		int i,j,flag=0,n;
	        for( i=0; i<a.length; i++) {
	        	n=a[i];
	        	int rem=0;
	        	//System.out.println(a[i]);
	   		for ( j = 1; j <=n; j++) {
	            if (n % j == 0) {
	        rem++;
	            }
	            flag++;
	      	}
	   		if(rem==2) {
	   			System.out.println("Prime: "+a[i]);
	   		}
	   		else {
	   			System.out.println("Not Prime: "+a[i]);
	   		}
	       
	        }              
}
}
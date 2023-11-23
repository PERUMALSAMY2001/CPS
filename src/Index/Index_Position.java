package Index;

	import java.util.Arrays; 
	  
	public class Index_Position { 
	    public static char findIndex(long[] arr, int t) {
	  
	        char index = (char) Arrays.binarySearch(arr, t); 
	        return (char) ((index < 0) ? -1 : index); 
	    } 

}

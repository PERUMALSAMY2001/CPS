package Access_Modifier;

public class String_LastIndex {

	public static void main(String[] args) {
		String strOrig="Hello world ,Hello Reader";
		int lastIndex=strOrig.lastIndexOf("Hello");
		if(lastIndex==-1)
		{
			System.out.println("Hello not found");
			
		}
		else
		{
			System.out.println("Last occurence of Hello is at Index " +lastIndex);
		}
	}

}

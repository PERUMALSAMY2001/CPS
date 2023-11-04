package Access_Modifier;

public class String_Reverse {

	public static void main(String[] args) {
		String string="abcdef 1234";
		String reverse=new StringBuffer(string).reverse().toString();
		
		System.out.println("\nString before reverse: "+string);
		System.out.println("string after reverse: "+reverse); 
		String text="The cat is on the table";
		System.out.println(text.contains("tha"));

	}

}

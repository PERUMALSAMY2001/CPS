//Program for conditional Operator
public class Relational {

	public static void main(String[] args) {
		int a =5, b=12, c=20, result;
		result =(a>b) ?a : b;
		//System.out.println("Biggest number = "+result)
		if(a>b)
			System.out.println("a is greater: "+a);
		else if (b>c)
			System.out.println("b is greater: "+b);
		else
			System.out.println("c is biggest: "+c);
	}

}

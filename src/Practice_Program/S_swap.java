package Practice_Program;

import java.util.Scanner;

public class S_swap {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String str1=s.next();
		int len=str1.length();
		char ch[]=str1.toCharArray();
		if(len%2==0)
			for(int i=1;i<len;i+=2) {
				System.out.print(ch[i]+""+ch[i-1]);
			}
		else {
			for(int i=1;i<len-1;i+=2) 
				System.out.print(ch[i]+""+ch[i-1]);
				System.out.print(ch[len-1]);
			}
		s.close();
		}
		
	}


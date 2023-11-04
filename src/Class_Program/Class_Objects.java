package Class_Program;

import java.util.Scanner;

public class Class_Objects {
	int stud_id;
	String stud_name;
	void print(int id, String name) {
		stud_id=id;
		stud_name=name;
	System.out.println("Student id: "+stud_id);
	System.out.println("Student Name: "+stud_name);
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the Student id: ");
		int id=s.nextInt();
		System.out.println("Enter the Student Name: ");
		String name=s.next();
		
	Class_Objects obj=new Class_Objects();
	obj.print(id,name); //Calling the Method print
	
	}

}

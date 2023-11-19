package Inheritance;

public class Student2 {

	public static void main(String[] args) {
		Student1 s=new Student1();
		s.setId(195149);
		s.setMarks("566");
		s.setRank('A');
		s.setPercentage(87);
		System.out.println("Id: "+s.getId());
		System.out.println("Marks :"+s.getMarks());
		System.out.println("Rank :"+s.getRank());
		System.out.println("Percentage: "+s.getPercentage());

	}

}

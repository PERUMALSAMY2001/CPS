package Inheritance;

class sports extends marks {
	float score;
	void score(float score) {
		this.score=score;
	}
	void score() {
		System.out.println("Score: "+score);
	}
	public void reg_no(int i) {
		// TODO Auto-generated method stub
		
	}
}
public class MultilevelInheritanceExample   {
 
public static void main(String args[])  {
	sports ob=new sports();  
	ob.reg_no(11289);  
}
}

package Class_Program;

public class Sum2 {
	int emp_id;
	String emp_name;
	double salary;
	
	public Sum2 () {
		emp_id=1;
		emp_name="vijay";
		salary=10000;
	}
void getEmp() {
	
	System.out.println("Employee id: "+emp_id);
	System.out.println("Employee Name: "+emp_name);
	System.out.println("Salary: "+salary);
	
}
	
	public static void main(String[] args) {
	Sum2 ob=new Sum2();
	System.out.println("State Emp_id: "+ob.emp_id);
	System.out.println("Getter Method Calling");
	ob.getEmp();
	

	}

}

package Random;

public class Constractor {
	 String name;
	private Constractor() {
		name="Perumal";
		
	}

	public static void main(String[] args) {
		Constractor Constractor = new Constractor();
		System.out.println("The Name Is : "+Constractor.name);

	}

}


public class TestEmployee {
	
	public static void main(String[] args) {
		Executivee ex1 = new Executivee(101, "siri", 1000, 3000);
		Manager mg1 = new Manager(102, "harshi", 2000, 4000);
		
		showSalary(ex1);
		showSalary(mg1);
		// TODO Auto-generated constructor stub
	}

	private static void showSalary(employee e) {
		if(e instanceof Manager)
			System.out.println("Executive salary: " + e.getsalary());
		else
			System.out.println("Manager salary: " + e.getsalary());

		// TODO Auto-generated method stub
		
	}

}

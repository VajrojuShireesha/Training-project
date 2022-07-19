
public class Executivee extends employee {
	private double incentives;

	public Executivee() {
		// TODO Auto-generated constructor stub
	}

	public Executivee(int empNo, String empName, double salary, double incentives) {
		super(empNo, empName, salary);
		this.incentives = incentives;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getsalary() {
		
		// TODO Auto-generated method stub
		return super.getsalary() + incentives;
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Incentives:" + incentives);
	}
	

	
}


public class customer {
	private String custName;
	private int custID;
	
	public customer() {
		custName = "siri";
		custID = 18;	
	}
	
	public customer(String PcustName, int PcustID) {
		custName = PcustName;
		custID = PcustID;
		
	}
	public void print() {
		System.out.println("Name=" +custName+ "\tage:" +custID);
	}
	
	public static void main(String[] args) {
		customer p = new customer("sravs",19);
		p.print();
		
		customer c2 = new customer();
		c2.print();
		
		// TODO Auto-generated method stub

	}

}

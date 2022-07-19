

public class Stock implements Exchange {

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set() {
		// TODO Auto-generated method stub
		
	}
 public static void main(String []args) {
	 Stock ibm = new Stock();
	 Holder h = ibm;
	 h.view();
	 System.out.println("\n");
	 Broker b=ibm;
	 b.view();
	 b.get();
	 System.out.println("\n");
	 Exchange e =ibm;
	 e.view();
	 e.get();
	 e.set();
	 
 }
}
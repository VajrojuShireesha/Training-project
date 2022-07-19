public class TestStock {

	public static void main(String[] args) {
		
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
public class TestAccounts {
	public static void main(String[] args) {
		
		Accounts a1 = new Accounts("siri",5000);
		/*a1.summary();
		
		a1.deposit(2000);
		a1.summary();
		
		a1.withdraw(5000);
		a1.summary();
		
		a1.withdraw(8000);*/
		Savings s=new Savings();
		//s.withdrawl(10);
		
	Current c=new Current("harshi");
	c.summary();
	c.deposit(15000);
	c.withdraw(5000);
		
	}

}
public class Accounts {
	  private int accno;
	  private String holder;
	  protected double balance;
	  
	  private static int autogen = 1200;
	  
	  public Accounts() {
	  }
	  public Accounts(String holder,double balance) {
		  this.accno = autogen ++;
		  this.holder = holder;
		  this.balance = balance;
		  
	  }
public void summary() {
	System.out.println("A/C no:" + accno);
	System.out.println("Holder:"+holder);
	System.out.println("Balance:"+balance);
}
public void deposit(double amount) {
	balance += amount;
}
public void withdraw(double amount) {
	if (amount <= balance)
		balance -= amount;
	else 
		System.out.println("insufficientbalance!");

}
}
public class Savings extends Accounts {
	
	public Savings() {
		
	}
	
    public Savings (String holder) {
    	super(holder,1000);

}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount<(balance -1000))
			balance -=amount;
		else
			System.out.println("Insufficient balance:");
		
	}
    
    
}
public class Current extends Accounts{
private double overdraft;
	public Current() {
	}

	public Current(String holder) {
		super(holder, 5000);
		this.overdraft=8000;
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: "+overdraft);
	}

	@Override
	public void deposit(double amount) {
		if(overdraft==10000) {
			overdraft+=amount;
			System.out.println("Overdraft: "+overdraft);
		}
			else  {
				balance+=amount;
				System.out.println("Balance: "+balance);

			}
	}

	@Override
	public void withdraw(double amount) {

		if(balance>=5000) {
			balance-=amount;
			System.out.println(balance);
			System.out.println(overdraft);

		}
		else if(balance<5000) {
				overdraft-=amount;
				System.out.println(overdraft);
	}


		else {
			System.out.println("Insufficient Balance");
		}
		}}

public class AccountsFactory {
	public Savings openSavings(String holder) {
		return new Savings(holder);
	}
	
	public Current openCureent(String holder) {
		return new Current(holder);
	}

	

}

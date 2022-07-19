package ex2;

public class stock {
	
	public stock() {
		System.out.println("Stock constructor");
	}
	
	private static stock stock;
	
	public static stock get() {
		if(stock == null)
			stock = new stock();
		return stock;
	}
	

}

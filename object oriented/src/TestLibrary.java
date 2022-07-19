
public class TestLibrary {
	
	public static void main(String[] args) {
		Boookk b1 = new Boookk("The chemistry");
		Memberrr m1 = new Memberrr("siri");
		
		b1.status();
		m1.status();
		
		b1.issues(m1);
		b1.status();
	}

}


public class Boookk {
	private String title;
	private Memberrr mbr;
	
	public Boookk(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void status() {
		if(mbr == null)
			System.out.println(title + "is not issued by any member");
		else
			System.out.println(title + "is issued to " + mbr.getName());
	}
	public void issues(Memberrr m) {
		this.mbr = m;
		m.setBk(this);
		System.out.println("BOOK ISSUED");
	}
		
	public void returns(Memberrr m) {
	
		
	}

	

}


public class SyncDemo implements Runnable {
	

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		print(name);		
	}

	private void print(String name) {
		try {
			System.out.println("[");
			Thread.sleep(1000);
			System.out.println(name);
			Thread.sleep(1000);
			System.out.println("]");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		SyncDemo sd = new SyncDemo();
		 
		Thread t1 = new Thread(sd,"alfa");
		Thread t2 = new Thread(sd,"beta");
		Thread t3 = new Thread(sd,"gama");
		
		t1.start();
		t2.start();
		t3.start();

		// TODO Auto-generated constructor stub
	}

}

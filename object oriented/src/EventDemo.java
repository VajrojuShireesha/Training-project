class EventImpl implements Event{

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("class level implementation");
		
	}
	
}
public class EventDemo {
	
	class InnerEventImpl implements Event{

		@Override
		public void perform() {
			// TODO Auto-generated method stub
			System.out.println("Inner class implementaton");
			
		}
		
	}
	public static void main(String[] args) {
		EventImpl e1 = new EventImpl();
		e1.perform();
		
		EventDemo demo = new EventDemo();
		InnerEventImpl e2 = demo.new InnerEventImpl();
		e2.perform();
		
		EventDemo.StaticInnerEventImpl e3 = new EventDemo.StaticInnerEventImpl();
		e3.perform();
		
		((Object) demo).nestedEvent();
		demo.oneMoreEvent();
		}
		// TODO Auto-generated method stub
		
	}
}


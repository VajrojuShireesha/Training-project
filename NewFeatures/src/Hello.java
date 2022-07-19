@FunctionalInterface
public interface Hello {
	String sayHello();
	
	default String sayBye() {
		return "asta la vista";
	}
		
		static void greet() {
			System.out.println("Happy Holidays");
		}
	}

public class HelloDemo {

	public static void main(String[] args) {
		
		Hello h1 = () -> "Hello Lamda";
		System.out.println(h1.sayHello());
		
		Hello h2 = () -> {
			String greet = "Hye Lambda";
			return greet;
		};
		System.out.println(h2.sayHello());
		
		System.out.println(h2.sayBye());
		
		System.out.println(h2.greet());
	}
}
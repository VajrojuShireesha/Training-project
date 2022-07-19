import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;



public class PersonReflection {
	
	public static void main(String[] args) throws Exception{

//	public static void main(String[] args ) {
//		person p1 =new person("kim", 29);
		
		Class pc = Class.forName("person");
		
		System.out.println(pc.getName());
		
		System.out.println("---list of constructors");
		
		Constructor[] Constructors = pc.getConstructors();
		for(Constructor c : Constructors) {
			System.out.println(c);
		
		System.out.println("---list of methods");
		Method[] methods = pc.getMethods();
		for(Method m : methods) {
			System.out.println(m);
			
		System.out.println("---methods of person class");
		Method[] decMethods = pc.getDeclaredMethods();
		for(Method m1 : decMethods) {
			System.out.println(m1);
			
		System.out.println("---List of Fields person class---");
			Field[] fields =pc.getDeclaredFields();
			for(Field f:fields) {
				System.out.println(f);
			}
		}
		
		}
		}
	}

}

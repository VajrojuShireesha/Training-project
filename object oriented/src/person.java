public class person implements Cloneable {
	private String name;
	private int age;
	
	
	public person() {
		this("anonymous",-1);
		
	
	}


	public person(String pname, int page) {
		name = pname;
		age = page;
		
	}
	public void print() {
		System.out.println("Name: " + name + "\tage:" + age);
		
	}
	public String toString() {
		return "Name:"+name+"\tAge:"+ age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof person) {
			person p = (person) obj;
			if(p.name.equals(this.name)&& p.age == this.age)
				return true;
			
		}
		return false;

	}	

	public static void main(String[] args) throws CloneNotSupportedException {
		person p = new person("polo", 21);
		person pc = (person) p.clone();
				System.out.println(pc);
				
		
		person p2 = new person("milky",20);
		System.out.println(p2);
		System.out.println(p.equals(p2));

		

		
			}

	}
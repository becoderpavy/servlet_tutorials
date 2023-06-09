
class User {

//	private  int id = 121;
//	public String name;

//	public static int id = 121; // static variable
//	public String name;      // non static variable

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	public User() {
		System.out.println("Default constructor");
	}

	public User(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Paramtere constructor");
	}
	
	
	public User(String name) {
		this.name = name;
		System.out.println("name constructor");
	}

}

public class Example {
	public static void main(String[] args) {
		User ob = new User();
		User ob2 = new User(121,"Harsha");
		User ob3 = new User("Harsha");
//		ob.id=123;
//		ob.name="Harsh";		
//		System.out.println("id="+User.id);		
//		System.out.println("name="+ob.name);

//		ob.setId(121);
//		ob.setName("Harsh");

//		System.out.println(ob);

//		int id = ob.getId();
//		String name = ob.getName();

//		System.out.println("id=" + id);
//		System.out.println("name=" + name);
		
		
		System.out.println(ob2.getId());
		System.out.println(ob2.getName());
		
		
		
		

	}
}

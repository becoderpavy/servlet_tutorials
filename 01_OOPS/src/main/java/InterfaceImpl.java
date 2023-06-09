
class demo implements InterfaceExamp {

	public String register(String name) {
		return "Register Successfully";
	//	System.out.println("Register Successfully");
	}

	public void registerUser(String name) {
	}

	// public void getMoney(String name); // abstarct method 
	
	
}

public class InterfaceImpl {
	public static void main(String[] args) {
		InterfaceExamp ob = new demo();
		String name = ob.register("Harsh");
		ob.registerUser("Harsh");
		System.out.println(ob.register("Harsh"));
	}
}


class Animal { // parent class
	private String food;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

}

class bird extends Animal { // child class
	private String drink;

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

}

public class InheritanceExample {

	public static void main(String[] args) {
		bird ob = new bird();
		ob.setFood("Animal Food");
		String af = ob.getFood();

		System.out.println(af);
	}

}
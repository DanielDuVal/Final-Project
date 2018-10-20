package orderingSystem;

public class DeluxeBurger extends MenuItem{
	
int registerNumber;
	
	public DeluxeBurger(int registerNumber) {

		name = "Deluxe Burger";
		this.registerNumber = registerNumber;
	}

	public double getPrice() {
		return 5.99;
	}
}

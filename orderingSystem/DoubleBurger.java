package orderingSystem;

public class DoubleBurger extends MenuItem{
	
int registerNumber;
	
	public DoubleBurger(int registerNumber) {

		name = "Double Burger";
		this.registerNumber = registerNumber;
	}

	public double getPrice() {
		return 3.99;
	}
}

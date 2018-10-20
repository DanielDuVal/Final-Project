package orderingSystem;

public class Fries extends MenuItem{
	
	int registerNumber;

	public Fries(int registerNumber) {

		name = "Fries";
		this.registerNumber = registerNumber;
	}

	public double getPrice() {
		return 1.99;
	}
}

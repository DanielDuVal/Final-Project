package orderingSystem;

public class Hamburger extends MenuItem{
	
	int registerNumber;
	
	public Hamburger(int registerNumber) {

		name = "Hamburger";
		this.registerNumber = registerNumber;
	}

	public double getPrice() {
		return 2.99;
	}
}

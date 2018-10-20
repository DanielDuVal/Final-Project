package orderingSystem;

public abstract class MenuItem {

	String name = "Unknown item.";

	public String getName() {
		return name;
}
	
	public abstract double getPrice();
}

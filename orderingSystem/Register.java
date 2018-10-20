package orderingSystem;

public abstract class Register {					

	public abstract void createMenuItem(String item);
	
	public abstract void removeMenuItem(int itemNumber);
	
	public abstract MenuItem getMenuItem(int itemNumber);
	
	public abstract String getName(int itemNumber);
	
	public abstract Double getPrice(int itemNumber);	
}

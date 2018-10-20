package itemBuilder;

import orderingSystem.MenuItem;

public class Cheese extends Decorator{

	MenuItem menuItem;

	public Cheese(MenuItem menuItem) {
		this.menuItem = menuItem;
	}
	
	public String getName() {
		StringBuffer name = new StringBuffer(menuItem.getName());
		name.append("\n cheese");
		return name.toString();
	}

	public double getPrice() {
		return .50 + menuItem.getPrice();
	}
}
package itemBuilder;

import orderingSystem.MenuItem;

public class Mayonnaise extends Decorator{

	MenuItem menuItem;
	
	public Mayonnaise(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

	public String getName() {
		StringBuffer name = new StringBuffer(menuItem.getName());
		name.append("\n mayonnaise");
		return name.toString();
	}

	public double getPrice() {
		return .05 + menuItem.getPrice();
	}
}

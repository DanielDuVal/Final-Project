package itemBuilder;

import orderingSystem.MenuItem;

public class Pickles extends Decorator{
	
	MenuItem menuItem;

	public Pickles(MenuItem menuItem) {
		this.menuItem = menuItem;
	}
	
	public String getName() {
		StringBuffer name = new StringBuffer(menuItem.getName());
		name.append("\n pickles");
		return name.toString();
	}

	public double getPrice() {
		return .05 + menuItem.getPrice();
	}
}

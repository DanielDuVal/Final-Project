package display;

import orderingSystem.MenuItem;

public interface DisplayElement {
	
	public void display();
	public MenuItem getMenuItem(int itemNumber);
}

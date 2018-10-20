package display;

import java.util.ArrayList;

import orderingSystem.MenuItem;

public class KitchenDisplay implements Observer, DisplayElement{

	private ArrayList<MenuItem> order;
	
	public void update(ArrayList<MenuItem> order) {
		this.order = order;
		display();
	}
	
	public void display() {
		for(int i = 0; i < order.size(); i++) {
			System.out.println(order.get(i).getName());
		}	
	}
	public MenuItem getMenuItem(int itemNumber) {
		return order.get(itemNumber);
	}
}
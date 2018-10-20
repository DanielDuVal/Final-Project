package orderingSystem;

import orderingSystem.MenuItem;
import java.util.ArrayList;

import display.Observer;

public class Register_2 extends Register implements Subject{
	
	private ArrayList<MenuItem> order;
	private ArrayList<Observer> observer;
	
	public Register_2() {
		order = new ArrayList<MenuItem>(1);
		observer = new ArrayList<Observer>(1);
	}

	public void createMenuItem(String item) {
		int registerNumber = 1;
		MenuItem menuItem = null;
		
		if(item.equalsIgnoreCase("Hamburger")) {
				menuItem = new Hamburger(registerNumber);
		}
			else if(item.equalsIgnoreCase("Double Burger")) {
				menuItem = new DoubleBurger(registerNumber);
			}
			else if(item.equalsIgnoreCase("Deluxe Burger")) {
				menuItem = new DeluxeBurger(registerNumber);
			}
			else if(item.equalsIgnoreCase("Fries")){
				menuItem = new Fries(registerNumber);
			}	
			else
				System.out.println("Error: null item");
		
			order.add(menuItem);
			detailsChanged();
	}
	
	public void removeMenuItem(int itemNumber) {
		order.remove(itemNumber);
		detailsChanged();
	}
	
	public MenuItem getMenuItem(int itemNumber) {
		return order.get(itemNumber);
	}

	public String getName(int itemNumber) {
		String item = order.get(itemNumber).getName();	
		return item;
	}
	
	public Double getPrice(int itemNumber) {
		double item = order.get(itemNumber).getPrice();	
		return item;
	}
	
	public void detailsChanged() {
		notifyObservers();
	}

	public void notifyObservers() {
		for(int i = 0; i < observer.size();i++) {
			Observer tempObserver = (Observer) observer.get(i);
			tempObserver.update(order);
		}
	}

	public void registerObserver(Observer o) {
		observer.add(o);
	}

	public void removeObserver(Observer o) {
		int index = observer.indexOf(o);
		if(index >= 0)
			observer.remove(index);
	}
	
	public Observer getOberver(int observerNumber) {
		return observer.get(observerNumber);
	}
}

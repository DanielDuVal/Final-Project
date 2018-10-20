package display;

import java.util.ArrayList;

import orderingSystem.MenuItem;

public class RegisterDisplay implements Observer, DisplayElement{

		private ArrayList<MenuItem> order;
		private double total;
		
		public void update(ArrayList<MenuItem> order) {
			this.order = order;
			display();
		}
		
		private void totalPrice() {
			for(int i = 0; i < order.size(); i++) {
				total = total + order.get(i).getPrice();
				System.out.println(total);
			}
		}
		
		public void display() {
			for(int i = 0; i < order.size(); i++) {
				System.out.println(order.get(i).getName());
				System.out.println(order.get(i).getPrice());
			}
			totalPrice();
		}
		
		public MenuItem getMenuItem(int itemNumber) {
			return order.get(itemNumber);
		}
}

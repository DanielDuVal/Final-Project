package itemBuilder;

import orderingSystem.MenuItem;

public class Onions extends Decorator{

		MenuItem menuItem;

		public Onions(MenuItem menuItem) {
			this.menuItem = menuItem;
		}
		
		public String getName() {
			StringBuffer name = new StringBuffer(menuItem.getName());
			name.append("\n onions");
			return name.toString();
		}

		public double getPrice() {
			return .05 + menuItem.getPrice();
		}
	}
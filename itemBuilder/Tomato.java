package itemBuilder;

import orderingSystem.MenuItem;

public class Tomato extends Decorator {
		
		MenuItem menuItem;

		public Tomato(MenuItem menuItem) {
			this.menuItem = menuItem;
		}
		
		public String getName() {
			StringBuffer name = new StringBuffer(menuItem.getName());
			name.append("\n tomato");
			return name.toString();
		}

		public double getPrice() {
			return .25 + menuItem.getPrice();
		}
}

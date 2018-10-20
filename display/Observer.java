package display;

import java.util.ArrayList;
import orderingSystem.MenuItem;

public interface Observer {
	
	public void update(ArrayList<MenuItem> order);
}

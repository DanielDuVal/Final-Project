package orderingSystem;

import display.Observer;

public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	public Observer getOberver(int observerNumber);
}

package fryer;

public abstract class Fryer {
	private boolean on = false;
	private int time;
	
	public void on() {
		on = true;
	}
	
	public void off() {
		on = false;
	}
	
	public void setTimer(int time) {
		this.time = time;
	}
	
	public boolean getState() {
		return on;
	}
	
	public int getTime() {
		return time;
	}
}

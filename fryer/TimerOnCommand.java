package fryer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerOnCommand implements Command{
	Fryer fryer;
	Timer timer;
	int time = fryer.getTime();
	
	TimerOnCommand(Fryer fryer){
		this.fryer = fryer;
	}
	
	public void execute() {
		timer = new Timer();
		TimerTask task = null;
		timer.scheduleAtFixedRate(task, 0, time);
		task = new TimerTask() {
			public void run(){
				System.out.println(time--);
				if(time < 0)
					timer.cancel();
			}
		};
	}
}
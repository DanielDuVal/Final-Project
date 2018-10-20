package fryer;

public class TimerOffCommand implements Command{
	Fryer fryer;
	
	
	TimerOffCommand(Fryer fryer){
		this.fryer = fryer;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
	}
}

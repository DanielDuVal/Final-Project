package fryer;

public class FryerOffCommand implements Command{
	Fryer fryer;
	
	FryerOffCommand(Fryer fryer){
		this.fryer = fryer;
	}
	
	public void execute() {
		fryer.off();
	}
}

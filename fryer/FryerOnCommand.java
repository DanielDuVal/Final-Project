package fryer;

public class FryerOnCommand implements Command{
	Fryer fryer;
	
	FryerOnCommand(Fryer fryer){
		this.fryer = fryer;
	}

	public void execute() {
		fryer.on();
	}
}

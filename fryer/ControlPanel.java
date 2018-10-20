package fryer;

public class ControlPanel {
	Command[] onCommands;
	Command[] offCommands;
	Command[] timerOnCommands;
	Command[] timerOffCommands;
	Command[] setTimerCommands;
	
	public ControlPanel() {
		onCommands = new Command[3];
		offCommands = new Command[3];
		timerOnCommands = new Command[3];
		timerOffCommands = new Command[3];
		setTimerCommands = new Command[3];
		Command noCommand = new NoCommand();
		
		for(int i = 0; i < 3; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
			timerOnCommands[i] = noCommand;
			timerOffCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand, Command timerOnCommand, Command timerOffCommand, Command setTimerCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
		timerOnCommands[slot] = timerOnCommand;
		timerOffCommands[slot] = timerOffCommand;
		setTimerCommands[slot] = setTimerCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
	
	public void timerOnButtonWasPushed(int slot) {
		timerOnCommands[slot].execute();
	}
	
	public void timerOffButtonWasPushed(int slot) {
		timerOffCommands[slot].execute();
	}
	
	public void setTimerButtonWasPushed(int slot) {
		setTimerCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Control Panel -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		for(int i = 0; i < timerOnCommands.length; i++) {
			stringBuff.append("\n slot " + i + "] " + timerOnCommands[i].getClass().getName()
				+ "		" + timerOffCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}

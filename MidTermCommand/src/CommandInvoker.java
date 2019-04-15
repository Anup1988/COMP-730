
public class CommandInvoker {
	
	private CommandInterface command;
	
	
	public void movePlayer() {
		
		command.execute();
	}
	
	public CommandInterface getCommand() {
		
		return command;
	}
	
	public void setCommand(CommandInterface command) {
		
		this.command = command;
		
	}
	
	
	
}

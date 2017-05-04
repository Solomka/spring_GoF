package guru.springframework.gof.command.invoker;

import guru.springframework.gof.command.commandobjects.CommandBase;

/* Invoker */
/*
 * What this essentially means is that the same invoker (switch) can be used to invoke commands to perform actions
 *  on different receivers (devices)
 */
public class RemoteControl {
	CommandBase onCommand, offCommand, undoCommand;

	/*
	 * In the command pattern, the invoker issues commands without knowing anything about the receiver.
	 * In fact the invoker issuing the command doesn’t even know what operation will be carried out on issuing a command. 
	 */
	public void onButtonPressed(CommandBase onCommand /*request as object as parameter*/) {
		//car.move(); //tight coupling between Invoker and Receiver
		this.onCommand = onCommand;
		onCommand.execute();
		undoCommand = onCommand;
	}

	public void offButtonPressed(CommandBase offCommand) {
		this.offCommand = offCommand;
		offCommand.execute();
		undoCommand = offCommand;
	}

	public void undoButtonPressed() {
		undoCommand.undo();
	}

}

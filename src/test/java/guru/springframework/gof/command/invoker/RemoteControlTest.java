package guru.springframework.gof.command.invoker;

import org.junit.Test;

import guru.springframework.gof.command.commandobjects.CarMoveCommand;
import guru.springframework.gof.command.commandobjects.CarStopCommand;
import guru.springframework.gof.command.commandobjects.CommandBase;
import guru.springframework.gof.command.commandobjects.TopRotateCommand;
import guru.springframework.gof.command.commandobjects.TopStopRotateCommand;
import guru.springframework.gof.command.receiver.Car;
import guru.springframework.gof.command.receiver.RotatingTop;

public class RemoteControlTest {
	@Test
	public void testRemoteControlButtonPressed() throws Exception {
		
		//Invoker doesn't know who is receiver
		RemoteControl remoteControl = new RemoteControl();
		
		System.out.println("-----Testing onButtonPressed on RemoteControl for Car-----");		
		Car car = new Car();
		
		CommandBase carMoveCommand = new CarMoveCommand(car);
		//Invoker doesn't know who is receiver (CAR)
		remoteControl.onButtonPressed(carMoveCommand);
		
		System.out.println("-----Testing offButtonPressed on RemoteControl for Car-----");		
		CommandBase carStopCommand = new CarStopCommand(car);
		//Invoker doesn't know who is receiver(CAR)
		remoteControl.offButtonPressed(carStopCommand);
		
		System.out.println("-----Testing undoButtonPressed() on RemoteControl for Car-----");
		remoteControl.undoButtonPressed();
		
		/***************************************************************************************/

		System.out.println("-----Testing onButtonPressed on RemoteControl for RotatingTop-----");
		RotatingTop top = new RotatingTop();
		
		CommandBase topRotateCommand = new TopRotateCommand(top);
		//Invoker doesn't know who is receiver (RotatingTop)
		remoteControl.onButtonPressed(topRotateCommand);

		System.out.println("-----Testing offButtonPressed on RemoteControl for RotatingTop-----");
		CommandBase topStopRotateCommand = new TopStopRotateCommand(top);
		//Invoker doesn't know who is receiver (RotatingTop)
		remoteControl.offButtonPressed(topStopRotateCommand);

		System.out.println("-----Testing undoButtonPressed on RemoteControl for RotatingTop-----");

		remoteControl.undoButtonPressed();

	}

}
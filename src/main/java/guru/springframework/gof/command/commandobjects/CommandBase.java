package guru.springframework.gof.command.commandobjects;

/*
 * Creates objects which encapsulate actions and parameters.
 * 
 * “Encapsulate a request as an object, 
 * thereby letting you parameterize clients with different requests, queue or log requests, and support undoable (відміна) operations.”
 */
/*
 * Інкапсулювання запиту (carMove/ carStop/ topRotate/ topStopRotate) в обєкт дозволяє:
 * 	 - предати запит як параметр іншому обєкту (сервісу/ клієнту)
 * 	 - ставити запит в чергу
 * 	 - логувати запит
 * 	 - підтримувати відміну запиту
 */

/*
 *  This pattern states that requests should be encapsulated as objects that like any other objects 
 *  can be stored and passed around the application. 
 *  Requests encapsulated as objects are known as commands.
 */

/* interface between Invoker (RemoteControl) and Receiver (Car/ RotatingTop) */

/*
 * As apparent, by applying the Command Pattern we can take reusability to another level
 *  and this is made possible due to the loose coupling between the invoker and receiver
 *   and the command object that acts as the interface between them.
 */

/*
 * Whenever you are writing code that require some invoker to perform different actions on multiple receivers, 
 * consider using the Command Pattern
 */
public interface CommandBase {
    void execute();
    void undo();
}

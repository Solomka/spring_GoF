package guru.springframework.gof.ChainofResponsibility;

import org.junit.Test;

import guru.springframework.gof.ChainofResponsibility.handlers.AbstractSupportHandler;

public class RequestorClientTest {

	@Test
	public void testGetHandlerChain() throws Exception {

		/*
		 * A classic example of the Dependency Inversion Principle that states: Modules should be independent. 
		 * They should depend on abstractions. and abstractions should not depend on details.
		 *  Details should depend on abstractions. Our object chain depends on the abstraction (AbstractSupportHandler)
		 */
		
		/*
		 *  The Open Closed Principle states: “software entities (classes, modules, functions, etc.) should be fixed 
		 *  and yet represent an unbounded group of possible behaviors through concrete subclasses. 
		 */
		/*
		 *  Single Responsibility Principle which states-
		 *   The classes you write, should not be a swiss army knife. 
		 *   They should do one thing, and to that one thing well
		 */
		/*
		 * *** SOLID ***
		 * Dependency Inversion Principle => Our object chain depends on the abstraction (AbstractSupportHandler)
		 * Open Closed Principle		  => the abstract (AbstractSupportHandler) class and the concrete subclasses
		 * Single Responsibility Principle => TechnicalSupportHandler, BillingSupportHandler, and GeneralSupportHandler classes
		 */
		//the complete decoupling between the client and the object chain that handles the client’s request.
		AbstractSupportHandler handler = RequestorClient.getHandlerChain();

		handler.receiveRequest(AbstractSupportHandler.TECHNICAL, " I'm having problem with my internet connectivity.");

		System.out.println("............................................");

		handler.receiveRequest(AbstractSupportHandler.BILLING, "Please resend my bill of this month.");

		System.out.println("............................................");

		handler.receiveRequest(AbstractSupportHandler.GENERAL, "Please send any other plans for home users.");
	}
}
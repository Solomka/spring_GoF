package guru.springframework.gof.bridge.abstraction;

import org.junit.Test;

import guru.springframework.gof.bridge.implementation.EmailMessageSender;
import guru.springframework.gof.bridge.implementation.TextMessageSender;

public class MessageTest {

	@Test
	public void testSend() throws Exception {

		Message textMessage = new TextMessage/*abstraction*/(new TextMessageSender()/*implementation*/);
		textMessage.send();

		Message emailMessage = new TextMessage/*abstraction*/(new EmailMessageSender()/*implementation*/);
		emailMessage.send();
	}
}
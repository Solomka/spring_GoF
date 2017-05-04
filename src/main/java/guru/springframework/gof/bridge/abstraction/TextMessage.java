package guru.springframework.gof.bridge.abstraction;

import guru.springframework.gof.bridge.implementation.MessageSender;

public class TextMessage extends Message {

	/*
	 * отделение реализации от интерфейса. 
	 * Реализация больше не имеет
	 * посто-янной привязки к интерфейсу
	 */
	public TextMessage(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send() {
		messageSender.sendMessage();
	}

}

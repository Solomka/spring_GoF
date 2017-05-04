package guru.springframework.gof.ChainofResponsibility;

import guru.springframework.gof.ChainofResponsibility.handlers.AbstractSupportHandler;
import guru.springframework.gof.ChainofResponsibility.handlers.BillingSupportHandler;
import guru.springframework.gof.ChainofResponsibility.handlers.GeneralSupportHandler;
import guru.springframework.gof.ChainofResponsibility.handlers.TechnicalSupportHandler;

public class RequestorClient {

	public static AbstractSupportHandler getHandlerChain() {

		AbstractSupportHandler technicalSupportHandler = new TechnicalSupportHandler(AbstractSupportHandler.TECHNICAL);//10
		AbstractSupportHandler billingSupportHandler = new BillingSupportHandler(AbstractSupportHandler.BILLING);//20
		AbstractSupportHandler generalSupportHandler = new GeneralSupportHandler(AbstractSupportHandler.GENERAL);//30

		technicalSupportHandler.setNextHandler(billingSupportHandler);
		billingSupportHandler.setNextHandler(generalSupportHandler);

		return technicalSupportHandler;
	}

}

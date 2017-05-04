package guru.springframework.gof.facade.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import guru.springframework.gof.facade.servicefacade.OrderServiceFacadeImpl;

public class OrderFulfillmentControllerTest {

	@Test
	public void testOrderProduct() throws Exception {
		
		OrderFulfillmentController controller = new OrderFulfillmentController();
		controller.facade = new OrderServiceFacadeImpl();
		
		controller.orderProduct(9);
		boolean result = controller.orderFulfilled;
		
		assertTrue(result);
	}
}
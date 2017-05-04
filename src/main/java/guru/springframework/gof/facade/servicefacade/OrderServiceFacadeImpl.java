package guru.springframework.gof.facade.servicefacade;

import guru.springframework.gof.facade.domain.Product;
import guru.springframework.gof.facade.subcomponents.InventoryService;
import guru.springframework.gof.facade.subcomponents.PaymentService;
import guru.springframework.gof.facade.subcomponents.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade {

	public boolean createOrder(int pId) {

		boolean orderFulfilled = false;

		Product product = new Product();
		product.productId = pId;

		if (InventoryService.ifProductIsAvailable(product)) {
			System.out.println("Product with ID: " + product.productId + " is available in Inventory Warehouse.");

			boolean paymentConfirmed = PaymentService.ifPaymentSucceeded();

			if (paymentConfirmed) {
				System.out.println("Payment confirmed...");
				ShippingService.shipProduct(product);
			
				orderFulfilled = true;
			}
		}
		return orderFulfilled;
	}
}

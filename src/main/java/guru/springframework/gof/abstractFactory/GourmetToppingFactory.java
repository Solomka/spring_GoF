package guru.springframework.gof.abstractFactory;

import guru.springframework.gof.abstractFactory.topping.CaliforniaOilSauce;
import guru.springframework.gof.abstractFactory.topping.Cheese;
import guru.springframework.gof.abstractFactory.topping.GoatCheese;
import guru.springframework.gof.abstractFactory.topping.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory {

	private static GourmetToppingFactory gourmetToppingFactoryInstance;

	private GourmetToppingFactory() {

	}

	public static GourmetToppingFactory getGourmetToppingFactoryInstance() {
		if (gourmetToppingFactoryInstance == null) {
			gourmetToppingFactoryInstance = new GourmetToppingFactory();
		}
		return gourmetToppingFactoryInstance;
	}

	@Override
	public Cheese createCheese() {
		return new GoatCheese();
	}

	@Override
	public Sauce createSauce() {
		return new CaliforniaOilSauce();
	}
}

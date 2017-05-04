package guru.springframework.gof.abstractFactory;

import guru.springframework.gof.abstractFactory.topping.Cheese;
import guru.springframework.gof.abstractFactory.topping.MozzarellaCheese;
import guru.springframework.gof.abstractFactory.topping.Sauce;
import guru.springframework.gof.abstractFactory.topping.TomatoSauce;

public class SicilianToppingFactory extends BaseToppingFactory {

	private static SicilianToppingFactory sicilianToppingFactoryInstance;

	private SicilianToppingFactory() {

	}

	public static SicilianToppingFactory getSicilianToppingFactory() {
		if (sicilianToppingFactoryInstance == null) {
			sicilianToppingFactoryInstance = new SicilianToppingFactory();
		}
		return sicilianToppingFactoryInstance;
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}
}

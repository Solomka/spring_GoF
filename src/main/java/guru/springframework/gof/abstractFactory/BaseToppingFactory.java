package guru.springframework.gof.abstractFactory;

import guru.springframework.gof.abstractFactory.topping.Cheese;
import guru.springframework.gof.abstractFactory.topping.Sauce;

/**
 * Abstract Factory:
 * 
 * Topping = Cheese + Souce
 * Pizza(BaseToppingFactory toppingFactory) = Pizza(Cheese, Souce)
 * 
 * @author Solomka
 *
 */

/*
 * Often you’ll find you only need one instance of the factory. If this is the
 * case, you should consider implementing the concrete factory as a Singleton.
 */
public abstract class BaseToppingFactory {

	public abstract Cheese createCheese();

	public abstract Sauce createSauce();

}

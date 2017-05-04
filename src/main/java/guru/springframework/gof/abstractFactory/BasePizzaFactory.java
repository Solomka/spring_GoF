package guru.springframework.gof.abstractFactory;


import guru.springframework.gof.abstractFactory.product.Pizza;

/**
 * Factory Method Pattern
 * 
 * @author Solomka
 *
 */
public abstract class BasePizzaFactory {
	
	//factory method
    public abstract Pizza createPizza(String type);
}

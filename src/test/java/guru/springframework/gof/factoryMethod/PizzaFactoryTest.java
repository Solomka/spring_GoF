package guru.springframework.gof.factoryMethod;

import org.junit.Test;

public class PizzaFactoryTest {
    @Test
    public void testMakePizzas(){
    	//CheesePizza cheesePizza = new CheesePizza();
    	//cheesePizza.addIngredients();
    	//cheesePizza.bakePizza();
    	
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}

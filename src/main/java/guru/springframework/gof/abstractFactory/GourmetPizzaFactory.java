package guru.springframework.gof.abstractFactory;

import guru.springframework.gof.abstractFactory.product.CheesePizza;
import guru.springframework.gof.abstractFactory.product.PepperoniPizza;
import guru.springframework.gof.abstractFactory.product.Pizza;
import guru.springframework.gof.abstractFactory.product.VeggiePizza;

public class GourmetPizzaFactory extends BasePizzaFactory {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		/*
		 * the abstract factory pattern delegates responsibility to a separate
		 * object (abstract factory) dedicated to create a family of related
		 * objects. Then, through composition, the abstract factory object can
		 * be passed to the client who will use it (instead of factory method)
		 * to get the family of related objects.
		 */

		// Pizza == client

		/*
		 * In the abstract factory pattern you provide an interface to create
		 * families of related or dependent objects, but you do not specify the
		 * concrete classes of the objects to create.
		 */
		// GourmetTopping gourmentTopping = new GourmetTopping(GoatCheese,
		// CaliforniaOilSauce);
		BaseToppingFactory toppingFactory = GourmetToppingFactory.getGourmetToppingFactoryInstance();
		switch (type.toLowerCase()) {
		case "cheese":
			// pizza = new CheesePizza( new GourmetTopping(GoatCheese,
			// CaliforniaOilSauce));
			//pizza = new CheesePizza(GoatCheese, CaliforniaOilSauce);
			pizza = new CheesePizza(toppingFactory);
			break;
		case "pepperoni":
			pizza = new PepperoniPizza(toppingFactory);
			break;
		case "veggie":
			pizza = new VeggiePizza(toppingFactory);
			break;
		default:
			throw new IllegalArgumentException("No such pizza.");
		}

		pizza.addIngredients();
		pizza.bakePizza();
		return pizza;
	}
}

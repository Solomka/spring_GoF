package guru.springframework.gof.factoryMethod;

public abstract class BasePizzaFactory {
    
	//factory method
    public abstract Pizza createPizza(String type);
}

package guru.springframework.gof.builder.director;

import org.junit.Test;

import guru.springframework.gof.builder.builders.ConcreteHouseBuilder;
import guru.springframework.gof.builder.builders.PrefabricatedHouseBuilder;
import guru.springframework.gof.builder.product.House;

public class ConstructionEngineerTest {

	@Test
	public void testConstructHouse() throws Exception {
		
		//ConcreteHouse house = new ConcreteHouse(Foundation, Structure, Roof, furnished, painted);

		Director engineer = new Director(new ConcreteHouseBuilder());
		//Director engineer = new Director(new PrefabricatedHouseBuilder());
		House house = engineer.constructHouse();
		System.out.println("House is: " + house);

		/*
		engineer = new Director(new PrefabricatedHouseBuilder());
		house = engineer.constructHouse();
		System.out.println("House is: " + house);
		*/
	}
}
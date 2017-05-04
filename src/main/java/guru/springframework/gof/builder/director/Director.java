package guru.springframework.gof.builder.director;

import guru.springframework.gof.builder.builders.HouseBuilder;
import guru.springframework.gof.builder.product.House;

public class Director {
	
    private HouseBuilder houseBuilder;
    
    public Director(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
    	
        this.houseBuilder.buildFoundation();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.paintHouse();
        this.houseBuilder.furnishHouse();
        
        return this.houseBuilder.getHouse();

    }
}

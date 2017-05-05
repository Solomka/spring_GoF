package guru.springframework.gof.mediator.mediator;

import org.junit.Test;

import guru.springframework.gof.mediator.colleague.ArmedUnit;
import guru.springframework.gof.mediator.colleague.SoldierUnit;
import guru.springframework.gof.mediator.colleague.TankUnit;

public class CommanderImplTest {

	@Test
	public void testMediator() throws Exception {
		Commander commander = new CommanderImpl();
		
		ArmedUnit soldierUnit = new SoldierUnit(commander);
		ArmedUnit tankUnit = new TankUnit(commander);
		
		commander.registerArmedUnits(soldierUnit, tankUnit);
		
		commander.startAttack(soldierUnit);
		commander.startAttack(tankUnit);
		commander.ceaseAttack(soldierUnit);
		commander.startAttack(tankUnit);
	}
}
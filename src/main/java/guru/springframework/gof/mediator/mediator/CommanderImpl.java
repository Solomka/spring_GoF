package guru.springframework.gof.mediator.mediator;

import guru.springframework.gof.mediator.colleague.ArmedUnit;

/*
 * mediator (посередник) between two objects in order to porvide loose coupling between these two objects(SoldierUnit and TankUnit)
 */
public class CommanderImpl implements Commander {
	
	ArmedUnit soldierUnit, tankUnit;
	
	boolean attackStatus = true;

	@Override
	public void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit) {
		this.soldierUnit = soldierUnit;
		this.tankUnit = tankUnit;
	}

	@Override
	public void setAttackStatus(boolean attackStatus) {
		this.attackStatus = attackStatus;
	}

	@Override
	public boolean canAttack() {
		return attackStatus;
	}

	//broadcast event
	@Override
	public void startAttack(ArmedUnit armedUnit) {
		armedUnit.attack();
	}

	@Override
	public void ceaseAttack(ArmedUnit armedUnit) {
		armedUnit.stopAttack();
	}
}

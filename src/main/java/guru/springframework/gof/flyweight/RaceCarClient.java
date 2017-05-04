package guru.springframework.gof.flyweight;

public class RaceCarClient {

	private RaceCar raceCar;

	public RaceCarClient(String name) {
		/* Ask factory for a RaceCar */
		raceCar = CarFactory.getRaceCar(name);
	}

	/*
	 * Notice how the client code is responsible for maintaining the state of
	 * the individual object. If state was not maintained in the client object,
	 * but in the flyweight object, the changes would be seen by all objects
	 * having a reference to the flyweight object.
	 */
	/**
	 * The extrinsic state of the flyweight is maintained by the client
	 */
	private int currentX = 0;
	private int currentY = 0;

	public void moveCar(int newX, int newY) {
		/* Car movement is handled by the flyweight object */
		raceCar.moveCar(currentX, currentY, newX, newY);
		currentX = newX;
		currentY = newY;
	}

}

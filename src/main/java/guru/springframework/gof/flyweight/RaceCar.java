package guru.springframework.gof.flyweight;

/*
 * а в приложении используется большое число объектов; 
а из-за этого накладные расходы на хранение высоки; 
а большую часть состояния объектов можно вынести вовне; 
а многие группы объектов можно заменить относительно небольшим количе-
ством разделяемых объектов, поскольку внешнее состояние вынесено;
приложение не зависит от идентичности объекта. Поскольку объекты-при-способленцы могут разделяться, то проверка на идентичность возвратит 
«истину» для концептуально различных объектов.
 */
/*
 * What this pattern says is that if an application requires a large number of fine-grained objects,
 *  share them instead of repeated instantiation.
 *  The object you share is referred as a flyweight.
 */
/*
 * Intrinsic data: Information that is stored in the flyweight object. 
 * The information is independent of the flyweight’s context, thereby making it sharable. W
 * hile applying the pattern, you take all of the objects that have the same intrinsic data and replace them with a single flyweight.
Extrinsic data: Information that depends on the flyweight’s context and hence cannot be shared. 
Client objects stores and computes extrinsic data and passes it to the flyweight when it needs it.
 */
/*
 *  => Reduces the cost of complex object models.

       Use sharing to support large numbers of fine-grained objects efficiently.
 */
public abstract class RaceCar {

	/*
	 * Intrinsic states - things that are CONSTANT and are stored in the memory
	 */
	/* Intrinsic state stored and shared in the Flyweight object */
	String name;
	int speed;
	int horsePower;

	/*
	 * Extrinsic states - thing that are NOT CONSTANT and need to be calculated
	 * on the fly and are not stored in the memory
	 */
	/*
	 * Extrinsic state is stored or computed by client objects, and passed to
	 * the Flyweight.
	 */
	abstract void moveCar(int currentX, int currentY, int newX, int newY);
}

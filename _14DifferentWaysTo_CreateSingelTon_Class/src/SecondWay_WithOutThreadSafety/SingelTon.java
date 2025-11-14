package SecondWay_WithOutThreadSafety;
/*Lazy initialization:
•	Here the instance is created only when it’s first requested.
•	Advantage: The instance is created only when it is needed.
•	Drawback: If multiple threads call getInstance() method simultaneously, when instance is null, then multiple objects are created. This is violating the singleton principle
*/

public class SingelTon {

	private static SingelTon singelTon;

	private SingelTon() {
	}

	public static SingelTon getInstance() {
		if (singelTon == null) {
			singelTon = new SingelTon();
		}
		return singelTon;
	}
}

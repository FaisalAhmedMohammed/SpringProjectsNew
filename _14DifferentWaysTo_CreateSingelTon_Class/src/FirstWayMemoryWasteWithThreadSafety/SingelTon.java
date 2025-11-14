package FirstWayMemoryWasteWithThreadSafety;

/*Step 1: first of all we should not allow other class to create object of singleton class using new keyword we have to options 
	Make u r class as abstract  but the problem is even we also cannot create the objects (no one can created object) so we have to use 2nd option
	I have to make the constructor as private so other classes cannot create the object, so this constructor is not visible to other classes
	Create private static reference variable which creates the object of the class
	Create private static method which returns the Object 
	The other class who wants this class object then can call the method using Class Name
*/
public class SingelTon {

	private static SingelTon instance = new SingelTon();

	private SingelTon() {
	}

	public static SingelTon getObject() {
		return instance;
	}

}

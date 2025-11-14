package LazyInitializing_WithThreadSafety;

/*	Here we are making this method is synchronized then only thread can called
 *  the method at a time then the other threads has to wait 
 
	Thread 1 has entered in to this method then singleton is null object is
 created and return that object  then thread 1 will come out of this method then lock get released 
 
	Now thread 2 will enter in to the get Instance () method already object is
 created the singleton variable is not null then same object will return back to the t2.
 
	It is good implementation but not best implementation

	Suppose thread 1 has entered  then thread 2 has to wait until the two statements
 inside the methods are executed suppose if there are 100 threads then  all the threads
  has to wait until the method is executed here waiting time is more there is a performance issue
*/
public class SingelTon {

	private static SingelTon singelTon;

	private SingelTon() {

	}

	public synchronized static SingelTon getInstance() {
		if (singelTon == null) {
			singelTon = new SingelTon();
		}
		return singelTon;
	}

}

package Fourth_UsingSynchronizedBlock;

/*	Here if condition is a critical section so we are keeping in the
 *  synchronized block ,synchronized block accept only current object of the class

	So here t1 is entered and t2 is waiting, so then t1 is entered singleton 
    variable is null then object is created , once it is coming out of the block
    then lock get released
   
	Whenever t1 is getting out from going to return statement, exactly same
    time t2 will enter, t2 is not waiting until return statement is executed 
    so time is less 
    
	Check before entering in to the synchronized block check that singleton variable is
    null or not, if it is not null then go directly return statement, so by checking we 
    can avoid that block for all the threads

 * */
public class SingelTon {
	private static SingelTon singelTon;

	private SingelTon() {

	}

	public static SingelTon getInstance() {

		synchronized (SingelTon.class) { // this is synchronized block which takes Class Object as parameter
			if (singelTon == null) {
				singelTon = new SingelTon();
			}

		}
		return singelTon;
	}

}

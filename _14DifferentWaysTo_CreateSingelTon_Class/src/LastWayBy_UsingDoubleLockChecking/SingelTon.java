package LastWayBy_UsingDoubleLockChecking;

public class SingelTon {

	private static SingelTon singelTon;

	private SingelTon() {

	}

	public static SingelTon getInstance() {
		if (singelTon == null) {
			synchronized (SingelTon.class) {
				if (singelTon == null) {
					singelTon = new SingelTon();
				}
			}
		}
		return singelTon;
	}

}

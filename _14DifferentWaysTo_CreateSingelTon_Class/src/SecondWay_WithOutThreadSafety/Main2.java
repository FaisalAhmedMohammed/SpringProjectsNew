package SecondWay_WithOutThreadSafety;

public class Main2 {
	public static void main(String[] args) {
		
		SingelTon instance = SingelTon.getInstance();
		System.out.println(instance.hashCode());
	}

}

package SecondWay_WithOutThreadSafety;

public class Main1 {
	public static void main(String[] args) {
		
		SingelTon instance = SingelTon.getInstance();
		System.out.println(instance.hashCode());
	}

}

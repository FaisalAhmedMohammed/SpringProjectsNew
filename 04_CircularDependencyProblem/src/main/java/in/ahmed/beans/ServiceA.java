package in.ahmed.beans;

public class ServiceA {
	ServiceB serviceB;

	public void setServiceB(ServiceB serviceB) {
		this.serviceB = serviceB;
	}

	public void m1() {
		serviceB.f1();
	}

	public void m2() {
		System.out.println("ServiceA m2() method");
	}

}

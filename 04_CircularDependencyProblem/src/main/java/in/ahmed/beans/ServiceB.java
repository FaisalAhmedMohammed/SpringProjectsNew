package in.ahmed.beans;

public class ServiceB {

	ServiceA serviceA;

	public ServiceB(ServiceA serviceA) {
		this.serviceA = serviceA;
	}

	public void f1() {
		System.out.println("ServiceB f1() method");
	}

	public void f2() {
		serviceA.m2();

	}

}

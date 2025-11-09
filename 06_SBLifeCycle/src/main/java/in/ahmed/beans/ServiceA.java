package in.ahmed.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ServiceA implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

	private String message;// primitive type reference variable as dependency injection

	public ServiceA() {    // this is parameter less constructor it executes when the container creates object 
		System.out.println("ServiceA :: Constructor");
	}

	public void setMessage(String message) { // setter method
		this.message = message;
		System.out.println("Dependency injected");
	}

	public void printMessage() { // method which is invoked by the client to access the service
		System.out.println("printMessage() method :: executed" + message);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware :: setBeanName() method");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextAware :: setApplicationContext");
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println("InitializingBean :: afterPropertiesSet()");
	}

	public void setUp() {
		System.out.println("custom init - method");
	}

	public void tearDown() {
		System.out.println("custom destroy - method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean :: destroy()");
	}

}

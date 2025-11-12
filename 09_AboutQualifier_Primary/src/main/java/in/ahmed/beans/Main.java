package in.ahmed.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("in.ahmed.beans")  // Make sure package name matches your classes
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        Vehicle bean = context.getBean(Vehicle.class);
        bean.drive();
    }
}

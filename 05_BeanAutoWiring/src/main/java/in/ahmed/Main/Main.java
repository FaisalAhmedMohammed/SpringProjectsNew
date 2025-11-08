package in.ahmed.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ahmed.beans.ReportManager;
import in.ahmed.inter.ReportCreator;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		 ReportManager bean = context.getBean(ReportManager.class);
		 bean.printReport();
	}

}

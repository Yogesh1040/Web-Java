package scopeBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Human h1 = context.getBean("human",Human.class);
		Human h2 = context.getBean("human",Human.class);
		
		boolean status = (h1 == h2);
		System.out.println("Status - "+status);
		
		System.out.println("Memory Location of h1 - "+h1);
		System.out.println("Mwmory Location of h2 - "+h2);
	}
}

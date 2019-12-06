package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		
		//load the spring configuration file 
         
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo/applicationContext.xml");
		
		//retrieve bean from spring container 
		
		Coach thecoach = context.getBean("myCoach",Coach.class);
		
		//call the method on the bean 
		System.out.println(thecoach.getDailyWorkout());
		//close the context
		context.close();
	}

}

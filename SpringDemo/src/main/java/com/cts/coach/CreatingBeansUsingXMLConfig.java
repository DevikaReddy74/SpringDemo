package com.cts.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.coach.types.Coach;

//This uses the applicationContext.xml file for configuring the beans(objects)
// Configuring the spring beans by using XML Configuration

public class CreatingBeansUsingXMLConfig {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//retrieve bean from spring container
		Coach coach = context.getBean("baseBall", Coach.class);	
		
		//call methods on the bean 
		System.out.println(coach.getDailyWorkout());
		
		//close the context
		context.close();
		
	}

}

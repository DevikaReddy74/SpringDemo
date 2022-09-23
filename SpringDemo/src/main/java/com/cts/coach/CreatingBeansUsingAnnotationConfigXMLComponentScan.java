package com.cts.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.coach.types.Coach;

//This uses the annotationConfigContext.xml file for XML component scan
//Configuring the spring beans by using Annotations 

public class CreatingBeansUsingAnnotationConfigXMLComponentScan {

	public static void main(String[] args) {

		//read the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotationConfigContext.xml");
				
		//retrieve bean from spring container
		Coach coach = context.getBean("cricketCoach", Coach.class);	
		Coach coach2 = context.getBean("tennisCoach", Coach.class);	
		
		//call methods on the bean 
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach2.getDailyWorkout());
		
		//close the context
		context.close();
	}

}

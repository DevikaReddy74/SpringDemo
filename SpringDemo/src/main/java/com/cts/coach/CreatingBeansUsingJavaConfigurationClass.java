package com.cts.coach;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.coach.types.Coach;
import com.cts.coach.types.SportConfig;

//This uses the Java Configuration class(here i.e., SportConfig.java) for component scan
//Configuring the spring beans by using Annotations 

public class CreatingBeansUsingJavaConfigurationClass {




		public static void main(String[] args) {

			//read the spring configuration java class
			AnnotationConfigApplicationContext context=
					new AnnotationConfigApplicationContext(SportConfig.class);
					
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

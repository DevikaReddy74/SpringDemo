package com.cts.coach.types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Here bean id is "tennisCoach" 
//@Component("tennisCoach")	

// If we didn't mention id then Default Bean id is classname starts with lowercase "tennisCoach"
@Component
@Scope("singleton")		//It is a default scope
public class TennisCoach implements Coach {

	//Dependency injection
	//It is enough to Use field injection or constructor injection or setter injection
	@Autowired	//Field injection. then no need setter injection
	private WakeupPlan wakeupTime;
	
	public TennisCoach() {
	}
	
//	@Autowired		//Constructor injection by using Autowird Annotation
//	public TennisCoach(WakeupPlan wakeupTime){
//		this.wakeupTime=wakeupTime;
//	}
//	
//	@Autowired 		//setter injection by using Autowired annotation also called as method injection
//	public void setDailyWakeupTime(WakeupPlan dailyWakeupTime) {
//		this.wakeupTime = dailyWakeupTime;
//	}
//	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Tennis Coach Workout Plans";
	}
	@Override
	public void timeToWake() {
		wakeupTime.wakeUpTime();
	}



}

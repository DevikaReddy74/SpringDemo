package com.cts.coach.types;

import org.springframework.stereotype.Component;

@Component("cricketCoach")
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Cricket Coach Workout Plans";
	}

	@Override
	public void timeToWake() {
		// TODO Auto-generated method stub

	}

}

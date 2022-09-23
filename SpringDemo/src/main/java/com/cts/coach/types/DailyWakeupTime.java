package com.cts.coach.types;

import org.springframework.stereotype.Component;

@Component
public class DailyWakeupTime implements WakeupPlan{
	
	@Override
	public void wakeUpTime() {
		System.out.println("Wake up at 5 AM");
	}

}

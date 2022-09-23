package com.cts.coach;

import com.cts.coach.types.BaseballCoach;
import com.cts.coach.types.Coach;
import com.cts.coach.types.FootballCoach;

//Creating objects normally

public class CreatingObjectsNormallyMain {

	public static void main(String[] args) {

		Coach coach=new BaseballCoach();
		System.out.println(coach.getDailyWorkout());//Returns Baseball plans
		
		Coach coach2=new FootballCoach();
		System.out.println(coach2.getDailyWorkout());//Return Football plans
	}

}

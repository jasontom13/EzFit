package exercises.Biceps;

import java.io.Serializable;

import exercises.BicepExercise;


public class CableCurl extends BicepExercise implements Serializable{

	private static final long serialVersionUID = 8082268806550017527L;
	private String name = "Cable Curl";
	private String desc = "ask someone who works out";
	
	public CableCurl(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		
		
		
		// TODO Auto-generated constructor stub
		easySets = 5;
		easyReps = 5;
		easyDuration = 5;
		mediumSets = 9;
		mediumReps = 9;
		mediumDuration = 9;
		hardSets = 20;
		hardReps = 20;
		hardDuration = 20;
	}
	

}

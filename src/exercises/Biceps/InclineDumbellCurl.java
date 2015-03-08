package exercises.Biceps;

import java.io.Serializable;

import exercises.BicepExercise;


public class InclineDumbellCurl extends BicepExercise implements Serializable{

	private static final long serialVersionUID = 5732585197381340365L;
	private String name = "Incline Dumbell Curl";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public InclineDumbellCurl(String name, String desc, Integer sets,
			Integer reps, Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}

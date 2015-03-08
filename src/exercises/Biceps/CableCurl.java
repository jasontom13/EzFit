package exercises.Biceps;

import java.io.Serializable;

import exercises.BicepExercise;


public class CableCurl extends BicepExercise implements Serializable{

	private static final long serialVersionUID = 8082268806550017527L;
	private String name = "Concentration Curl";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public CableCurl(String name, String desc, Integer sets,
			Integer reps, Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}

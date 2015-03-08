package exercises.Biceps;

import java.io.Serializable;

import exercises.BicepExercise;


public class StraightBarCurl extends BicepExercise implements Serializable{

	private static final long serialVersionUID = 8554895891768136446L;
	private String name = "Straight Bar Curl";
	private String desc = "ask someone who works out";
	private int sets = -1;
	private int reps = -1;
	
	public StraightBarCurl(String name, String desc, Integer sets,
			Integer reps, Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}
	
}

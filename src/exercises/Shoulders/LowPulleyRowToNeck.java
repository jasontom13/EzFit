package exercises.Shoulders;

import java.io.Serializable;

import exercises.ShoulderExercise;

public class LowPulleyRowToNeck extends ShoulderExercise implements Serializable{

	private static final long serialVersionUID = 5816958652740509656L;
	private String name = "LowPulleyRowToNeck";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;

	public LowPulleyRowToNeck(String name, String desc, Integer sets,
			Integer reps, Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}
	
}
package exercises.Shoulders;

import java.io.Serializable;

import exercises.ShoulderExercise;

public class FrontPlateRaise extends ShoulderExercise implements Serializable{

	private String name = "FrontPlateRaise";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public FrontPlateRaise(String name, String desc, Integer sets,
			Integer reps, Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 819196598229002117L;

}

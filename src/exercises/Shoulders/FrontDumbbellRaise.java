package exercises.Shoulders;

import java.io.Serializable;

import exercises.ShoulderExercise;

public class FrontDumbbellRaise extends ShoulderExercise implements Serializable{

	private static final long serialVersionUID = 1578907152350334086L;
	private String name = "FrontDumbbellRaise";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public FrontDumbbellRaise(String name, String desc, Integer sets,
			Integer reps, Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}

package exercises.Shoulders;

import java.io.Serializable;

import exercises.ShoulderExercise;

public class DumbbellShoulderPress extends ShoulderExercise implements Serializable{

	private static final long serialVersionUID = -1844502511423427375L;
	private String name = "DumbbellShoulderPress";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	
	public DumbbellShoulderPress(String name, String desc, Integer sets,
			Integer reps, Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}
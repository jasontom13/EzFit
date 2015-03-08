package exercises.Shoulders;

import java.io.Serializable;

import exercises.ShoulderExercise;

public class FacePull extends ShoulderExercise implements Serializable{

	private static final long serialVersionUID = 2474146589412677796L;
	private String name = "FacePull";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public FacePull(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}


}

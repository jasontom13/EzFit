package exercises.Abs;

import java.io.Serializable;

import exercises.AbExercise;

public class Landmine180 extends AbExercise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2391501718740962749L;
	private String name = "Chin Up";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;

	public Landmine180(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}
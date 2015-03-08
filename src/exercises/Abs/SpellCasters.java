package exercises.Abs;

import java.io.Serializable;

import exercises.AbExercise;

public class SpellCasters extends AbExercise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2391501718740962749L;
	private String name = "Chin Up";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public SpellCasters(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}
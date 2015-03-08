package exercises.Legs;

import java.io.Serializable;

import exercises.TrapsExercise;

public class Squats extends TrapsExercise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -146998443833702068L;
	private String name = "Butterfly";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public Squats(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}
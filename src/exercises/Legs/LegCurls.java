package exercises.Legs;

import java.io.Serializable;

import exercises.LegExercise;

public class LegCurls extends LegExercise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3480724672193694962L;
	private String name = "Squats";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public LegCurls(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}

package exercises.Traps;

import java.io.Serializable;

import exercises.TrapsExercise;

public class CleanShrugs extends TrapsExercise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6462831309432213728L;
	private String name = "Squats";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public CleanShrugs(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}
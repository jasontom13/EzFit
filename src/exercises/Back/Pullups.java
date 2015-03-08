package exercises.Back;

import java.io.Serializable;

import exercises.BackExercise;

public class Pullups extends BackExercise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5086602596419859268L;
	/**
	 * 
	 */
	private String name = "Chin Up";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public Pullups(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}
package exercises.Chest;

import java.io.Serializable;

import exercises.ChestExercises;

public class Butterfly extends ChestExercises implements Serializable {

	private String name = "Butterfly";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public Butterfly(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 8188141919769722563L;

}
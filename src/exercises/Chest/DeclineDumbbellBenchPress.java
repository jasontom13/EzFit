package exercises.Chest;

import java.io.Serializable;

import exercises.ChestExercises;

public class DeclineDumbbellBenchPress extends ChestExercises implements Serializable {

	
	private static final long serialVersionUID = 2735858630442997842L;
	
	private String name = "Butterfly";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public DeclineDumbbellBenchPress(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}
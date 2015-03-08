package exercises.Triceps;

import java.io.Serializable;

import exercises.TricepExercise;

public class DumbbellOneArmTricepsExtension extends TricepExercise implements
Serializable {

	private String name = "DumbbellOneArmTricepsExtension";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;

	public DumbbellOneArmTricepsExtension(String name, String desc,
			Integer sets, Integer reps, Boolean isDone, Integer duration,
			Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}


	private static final long serialVersionUID = 1709202289228217186L;

}

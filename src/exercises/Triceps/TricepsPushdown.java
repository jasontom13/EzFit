package exercises.Triceps;

import java.io.Serializable;

import exercises.TricepExercise;

public class TricepsPushdown extends TricepExercise implements
Serializable {

	private String name = "TricepsPushdown";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	public TricepsPushdown(String name, String desc, Integer sets,
			Integer reps, Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = -7338385833895159057L;

}

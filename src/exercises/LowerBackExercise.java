package exercises;

import java.io.Serializable;

import bicepbuddy.Exercise;

public class LowerBackExercise extends Exercise implements Serializable {

	private static final long serialVersionUID = 2669540857055087710L;
	
	public LowerBackExercise(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}

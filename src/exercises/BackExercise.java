package exercises;

import java.io.Serializable;

import bicepbuddy.Exercise;

public class BackExercise extends Exercise implements Serializable {

	private static final long serialVersionUID = -8790040851512659654L;
	
	public BackExercise(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}


}
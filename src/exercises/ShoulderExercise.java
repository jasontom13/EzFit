package exercises;

import java.io.Serializable;

import bicepbuddy.Exercise;

public class ShoulderExercise extends Exercise implements Serializable {

	private static final long serialVersionUID = -5704045475061362382L;
	
	public ShoulderExercise(String name, String desc, Integer sets,
			Integer reps, Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}


}

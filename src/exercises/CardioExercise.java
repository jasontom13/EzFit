package exercises;

import java.io.Serializable;

import bicepbuddy.Exercise;

public class CardioExercise extends Exercise implements Serializable {

	private static final long serialVersionUID = -5659707398230702693L;

	public CardioExercise(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}

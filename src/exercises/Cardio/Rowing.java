package exercises.Cardio;

import java.io.Serializable;

import exercises.CardioExercise;

public class Rowing extends CardioExercise implements Serializable {
	
	public Rowing(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		
		easyDuration = 7;
		mediumDuration = 9;
		hardDuration = 11;
	}

	private static final long serialVersionUID = 8188141919769722563L;

}

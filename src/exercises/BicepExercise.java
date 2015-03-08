package exercises;

import java.io.Serializable;
import bicepbuddy.Exercise;

public class BicepExercise extends Exercise implements Serializable{

	private static final long serialVersionUID = -7986671599040496237L;
	
	public BicepExercise(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}

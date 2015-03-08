package exercises;

import java.io.Serializable;

import bicepbuddy.Exercise;

public class AbExercise extends Exercise implements Serializable{
	
	private static final long serialVersionUID = 4531251549804747032L;
	
	public AbExercise(String name, String desc, Integer sets,
			Integer reps, Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}
package exercises.Shoulders;

import java.io.Serializable;

import exercises.ShoulderExercise;

public class BentOverDumbbellRearDeltRaiseWithHeadOnBench extends ShoulderExercise implements Serializable{

	private String name = "BentOverDumbbellRearDeltRaiseWithHeadOnBench";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public BentOverDumbbellRearDeltRaiseWithHeadOnBench(String name,
			String desc, Integer sets, Integer reps, Boolean isDone,
			Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 2722792271829175571L;

}

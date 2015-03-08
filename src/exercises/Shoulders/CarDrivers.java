package exercises.Shoulders;

import java.io.Serializable;

import exercises.ShoulderExercise;

public class CarDrivers extends ShoulderExercise implements Serializable{

	private String name = "CarDrivers";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;

	public CarDrivers(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 7181542039206268296L;

}
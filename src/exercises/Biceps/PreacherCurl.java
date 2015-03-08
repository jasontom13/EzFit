package exercises.Biceps;

import java.io.Serializable;

import exercises.BicepExercise;


public class PreacherCurl extends BicepExercise implements Serializable{

	public PreacherCurl(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 4181366580048908173L;
	private String name = "Preacher Curl";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;

}

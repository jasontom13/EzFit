package exercises.Biceps;

import java.io.Serializable;

import exercises.BicepExercise;


public class ReverseCurl extends BicepExercise implements Serializable{

	private static final long serialVersionUID = -4264037049456575673L;
	private String name = "Reverse Curl";
	private String desc = "ask someone who works out";
	private int sets = -1;
	private int reps = -1;
	
	public ReverseCurl(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}
	
}

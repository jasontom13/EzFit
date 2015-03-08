package exercises.Shoulders;

import java.io.Serializable;

import exercises.ShoulderExercise;

public class DumbbellOneArmShoulderPress extends ShoulderExercise implements Serializable{

	private String name = "DumbbellOneArmShoulderPress";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public DumbbellOneArmShoulderPress(String name, String desc, Integer sets,
			Integer reps, Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = -7788198919122689840L;	

}
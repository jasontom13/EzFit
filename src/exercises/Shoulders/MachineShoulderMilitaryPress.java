package exercises.Shoulders;

import java.io.Serializable;

import exercises.ShoulderExercise;

public class MachineShoulderMilitaryPress extends ShoulderExercise implements Serializable{

	private static final long serialVersionUID = 8585560977231079564L;
	private String name = "MachineShoulderMilitaryPress";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public MachineShoulderMilitaryPress(String name, String desc, Integer sets,
			Integer reps, Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}
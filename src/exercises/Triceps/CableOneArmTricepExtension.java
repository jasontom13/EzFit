package exercises.Triceps;

import java.io.Serializable;

import exercises.TricepExercise;

public class CableOneArmTricepExtension extends TricepExercise implements
		Serializable {

	private static final long serialVersionUID = 8082268806550017527L;
	private String name = "CableOneArmTricepExtension";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public CableOneArmTricepExtension(String name, String desc, Integer sets,
			Integer reps, Boolean isDone, Integer duration, Boolean core) {
		super(name, desc, sets, reps, isDone, duration, core);
		// TODO Auto-generated constructor stub
	}

}

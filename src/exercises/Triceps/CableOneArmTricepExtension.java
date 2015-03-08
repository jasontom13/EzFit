package exercises.Triceps;

import java.io.Serializable;

import exercises.TricepExercise;

public class CableOneArmTricepExtension extends TricepExercise implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8082268806550017527L;
	private String name = "CableOneArmTricepExtension";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;

	public CableOneArmTricepExtension() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getSets() {
		return sets;
	}

	public void setSets(int sets) {
		this.sets = sets;
	}

	public Integer getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

}

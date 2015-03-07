package exercises.Biceps;

import java.io.Serializable;

import exercises.BicepExercise;


public class ReverseCurl extends BicepExercise implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4264037049456575673L;
	private String name = "Reverse Curl";
	private String desc = "ask someone who works out";
	private int sets = -1;
	private int reps = -1;
	
	public ReverseCurl() {
		// TODO Auto-generated constructor stub
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

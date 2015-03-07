package exercises.Biceps;

import java.io.Serializable;

import exercises.BicepExercise;


public class HammerCurl extends BicepExercise implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 722036789292687041L;
	private String name = "Hammer Curl";
	private String desc = "ask someone who works out";
	private int sets = 5;
	private int reps = 5;
	
	public HammerCurl() {
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

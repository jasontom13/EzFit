package exercises.Biceps;

import java.io.Serializable;

import exercises.BicepExercise;


public class StraightBarCurl extends BicepExercise implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8554895891768136446L;
	private String name = "Straight Bar Curl";
	private String desc = "ask someone who works out";
	private int sets = -1;
	private int reps = -1;
	
	public StraightBarCurl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the sets
	 */
	public Integer getSets() {
		return sets;
	}

	/**
	 * @param sets the sets to set
	 */
	public void setSets(int sets) {
		this.sets = sets;
	}

	/**
	 * @return the reps
	 */
	public Integer getReps() {
		return reps;
	}

	/**
	 * @param reps the reps to set
	 */
	public void setReps(int reps) {
		this.reps = reps;
	}

}

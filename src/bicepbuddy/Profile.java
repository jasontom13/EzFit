package bicepbuddy;

import java.io.Serializable;

public class Profile implements Serializable{

	private String name;

	private Double weight;
	private Double height;
	private Integer age;
	
	private String difficulty=null;
	private Integer workouts; // per week
	private int goal; // scale from 0/weight loss to 100/bulk
	
	int workoutsCompleted;
	int exercisesCompleted;
	int xp;

	public Profile() {
			//String name, Double weight, Double height, Integer age,
			//Integer difficulty, Integer workouts, int goal) {
//		this.name = name;
//		this.weight = weight;
//		this.height = height;
//		this.age = age;
//		this.difficulty = difficulty;
//		this.workouts = workouts;
//		this.goal = goal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public Integer getWorkouts() {
		return workouts;
	}

	public void setWorkouts(Integer workouts) {
		this.workouts = workouts;
	}

	public int getType() {
		return goal;
	}

	public void setType(int goal) {
		this.goal = goal;
	}
}

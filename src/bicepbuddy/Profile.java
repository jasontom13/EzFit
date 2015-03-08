package bicepbuddy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Profile implements Serializable {

	private static final long serialVersionUID = -5316580046572463031L;

	private String name;

	private Double weight; // pounds
	private int height; // inches
	private Double bmi;
	private Integer age;

	private int goal; // 0 loss or 1 gain
	private String difficulty;
	private Integer workoutsPerWeek;
	int workoutNumber; // from 1 to <workouts>

	public int getWorkoutNumber() {
		return workoutNumber;
	}

	public void setWorkoutNumber(int workoutNumber) {
		this.workoutNumber = workoutNumber;
	}

	private List<ProgressUpdate> progressUpdates;
	
	public Profile() {
		this.workoutNumber=0;
		this.name = "EMPTY";
		this.weight = -1.0;
		this.height = -1;
		this.age = -1;
		this.difficulty = "EMPTY";
		this.workoutsPerWeek = -1;
		this.goal = -1;
		progressUpdates = new ArrayList<ProgressUpdate>();

	

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

	public int getHeight() {
		return height;
	}

	public void setHeight(int feet, int inches) {
		this.height = (12 * feet) + inches;
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
		return workoutsPerWeek;
	}

	public void setWorkouts(Integer workouts) {
		this.workoutsPerWeek = workouts;
	}

	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	public Double getBmi() {
		bmi = calculateBmi();
		return bmi;
	}

	public Double calculateBmi() {
		// convert height (inches) to height (centimeters) and square the result
		double heightConverted = Math.pow(this.height, 2);
		// convert weight (pounds) to weight (kilograms)
		double weightConverted = this.weight * 703;
		// calculate bmi
		bmi = weightConverted / heightConverted;
		return bmi;
	}

	public void completedWorkout() {
		workoutNumber++;
	}

	// Weekly counter
	public int getWeeksWorkouts() {
		return (workoutNumber%workoutsPerWeek)+1;
	}

	// Forever counter
	public int getTotalWorkouts() {
		return workoutNumber;
	}
	
	public void updateProgress(double weight, int day) {
		progressUpdates.add(new ProgressUpdate(weight, day));
	}
}

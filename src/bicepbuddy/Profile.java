package bicepbuddy;

import java.io.Serializable;
import java.util.ArrayList;

import exercises.BackExercise;
import exercises.BicepExercise;
import exercises.ChestExercises;
import exercises.LegExercise;
import exercises.LowerBackExercise;
import exercises.ShoulderExercise;
import exercises.TrapsExercise;
import exercises.TricepExercise;

public class Profile implements Serializable{

	private static final long serialVersionUID = -5316580046572463031L;

	private String name;

	private Double weight; //pounds
	private int height; //inches
	private Double bmi;
	private Integer age;
	
	private int goal; // 0 loss or 1 gain
	private String difficulty;
	private Integer workouts; // per week
	int workoutNumber; // from 1 to <workouts>
	
	private int workoutsCompletedThisWeek = 0; // how many have they completed this week
	private int workoutsCompletedEver = 0; // how many since starting the app
		
	private ArrayList<Exercise> twoOne = new ArrayList<Exercise>();
	private ArrayList<Exercise> twoTwo = new ArrayList<Exercise>();
	
	private ArrayList<Exercise> threeOne = new ArrayList<Exercise>();
	private ArrayList<Exercise> threeTwo = new ArrayList<Exercise>();
	private ArrayList<Exercise> threeThree = new ArrayList<Exercise>();
	
	private ArrayList<Exercise> fourOne = new ArrayList<Exercise>();
	private ArrayList<Exercise> fourTwo = new ArrayList<Exercise>();
	private ArrayList<Exercise> fourThree = new ArrayList<Exercise>();
	private ArrayList<Exercise> fourFour = new ArrayList<Exercise>();
	
	private ArrayList<Exercise> fiveOne = new ArrayList<Exercise>();
	private ArrayList<Exercise> fiveTwo = new ArrayList<Exercise>();
	private ArrayList<Exercise> fiveThree = new ArrayList<Exercise>();
	private ArrayList<Exercise> fiveFour = new ArrayList<Exercise>();
	private ArrayList<Exercise> fiveFive = new ArrayList<Exercise>();
	
	ArrayList<Exercise> oneDay = new ArrayList<Exercise>();
	ArrayList<ArrayList<Exercise>> twoDays = new ArrayList<ArrayList<Exercise>>();
	ArrayList<ArrayList<Exercise>> threeDays = new ArrayList<ArrayList<Exercise>>();
	ArrayList<ArrayList<Exercise>> fourDays = new ArrayList<ArrayList<Exercise>>();
	ArrayList<ArrayList<Exercise>> fiveDays = new ArrayList<ArrayList<Exercise>>();
	

	public Profile() {
		this.name = "EMPTY";
		this.weight = -1.0;
		this.height = -1;
		this.age = -1;
		this.difficulty = "EMPTY";
		this.workouts = -1;
		this.goal = -1;
		
		for (int i = 0; i<2; i++) {
			oneDay.add(new LegExercise());
			oneDay.add(new ChestExercises());
			oneDay.add(new BicepExercise());
			oneDay.add(new BackExercise());
			oneDay.add(new ShoulderExercise());
			oneDay.add(new TricepExercise());
			oneDay.add(new TrapsExercise());
		}
		
		twoOne.add(new LegExercise());
		twoOne.add(new ChestExercises());
		twoOne.add(new ChestExercises());
		twoOne.add(new TricepExercise());
		twoOne.add(new TricepExercise());
		twoOne.add(new BackExercise());
		twoOne.add(new LowerBackExercise());
		twoOne.add(new ShoulderExercise());
		twoOne.add(new BicepExercise());
		twoOne.add(new TrapsExercise());
		
		twoTwo.add(new LegExercise());
		twoTwo.add(new BackExercise());
		twoTwo.add(new BackExercise());
		twoTwo.add(new BicepExercise());
		twoTwo.add(new BicepExercise());
		twoTwo.add(new BackExercise()); //Deadlift
		twoTwo.add(new ChestExercises());
		twoTwo.add(new TricepExercise());
		twoTwo.add(new TrapsExercise());
		
		twoDays.add(twoOne);
		twoDays.add(twoTwo);
		
		for (int i = 0; i<5; i++) {
			threeOne.add(new LegExercise());
		}
		
		for (int i = 0; i<2; i++) {
			threeTwo.add(new ChestExercises());
			threeTwo.add(new ShoulderExercise());
			threeTwo.add(new TricepExercise());
		}
		
		threeThree.add(new BackExercise());
		threeThree.add(new BicepExercise());
		threeThree.add(new LowerBackExercise());
		threeThree.add(new BicepExercise());
		threeThree.add(new BackExercise());
		
		threeDays.add(threeOne);
		threeDays.add(threeTwo);
		threeDays.add(threeThree);
		
		for (int i = 0; i<6; i++) {
			fourOne.add(new LegExercise());
		}
		
		
		fourTwo.add(new ChestExercises());
		fourTwo.add(new TricepExercise());
		fourTwo.add(new ChestExercises());
		fourTwo.add(new ChestExercises());
		fourTwo.add(new TricepExercise());
		
		for (int i = 0; i<3; i++) {
			fourThree.add(new BackExercise());
			fourThree.add(new BicepExercise());
		}
		
		fourFour.add(new ShoulderExercise());
		fourFour.add(new TricepExercise());
		fourFour.add(new TrapsExercise());
		fourFour.add(new ShoulderExercise());
		fourFour.add(new TricepExercise());
		fourFour.add(new ShoulderExercise());
		
		fourDays.add(fourOne);
		fourDays.add(fourTwo);
		fourDays.add(fourThree);
		fourDays.add(fourFour);
		
		fiveOne = fourOne;
		fiveTwo = fourTwo;
		fiveThree = fourThree;
		fiveFour = fourFour;
		
		for (int i = 0; i<5; i++)
			fiveFive.add(new LegExercise());
		fiveFive.add(new BackExercise());
		
		fiveDays.add(fiveOne);
		fiveDays.add(fiveTwo);
		fiveDays.add(fiveThree);
		fiveDays.add(fiveFour);
		fiveDays.add(fiveFive);
		
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
		this.height = (12*feet)+inches;
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
		//convert height (inches) to height (centimeters) and square the result
		double heightConverted = Math.pow(this.height, 2);
		//convert weight (pounds) to weight (kilograms)
		double weightConverted = this.weight*703;
		//calculate bmi
		bmi = weightConverted/heightConverted;
		return bmi;
	}

	public void completedWorkout() {
		workoutsCompletedThisWeek++;
		workoutsCompletedEver++;
	}
	
	//Weekly counter
	public int getWeeksWorkouts() {
		return workoutsCompletedThisWeek;
	}
	
	//Forever counter
	public int getTotalWorkouts() {
		return workoutsCompletedEver;
	}
}

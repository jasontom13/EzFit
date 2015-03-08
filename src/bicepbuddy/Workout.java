package bicepbuddy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import exercises.BicepExercise;

public class Workout implements Serializable {

	private static final long serialVersionUID = 4365628953453152523L;
	private List<Exercise> exercises;
	private Profile profile;
	
	private static final int ELLIPTICAL = 0;
	private static final int BENCH = 1;
	private static final int ROWING = 2;
	private static final int TREADMILL = 3;
	private static final int STAIRCLIMBER = 4;
	private static final int CYCLE = 5;
	private static final int JUMPINGJACKS = 6;
	private static final int JUMPROPE = 7;

	public Workout(Profile profile) {
		exercises = new ArrayList<Exercise>();
		this.profile = profile;
	}

	public void add(Exercise e) {
		exercises.add(e);
	}

	// get exercise at top of list
	public Exercise getExercise(Integer i) {
		return exercises.get(i);
	}

	public boolean workoutCompleted() {
		Boolean isDone = true;
		for (Exercise e : exercises)
			isDone = isDone && e.getDone();

		if (isDone)
			profile.completedWorkout();

		return isDone;
	}

	public List<Exercise> getList() {
		return exercises;
	}

	public List<Exercise> Generator() {
		//Generic empty exercise
		Exercise e = new BicepExercise(null, null, null, null, null, null, null);
		
		//All lists of possible exercises
		List<Exercise> biceps = e.getBicepExercises();
		List<Exercise> triceps = e.getTricepExercises();
		List<Exercise> chest = e.getChestExercises();
		List<Exercise> legs = e.getLegExercises();
		List<Exercise> lowerBack = e.getLowerBackExercises();
		List<Exercise> shoulders = e.getShoulderExercises();
		List<Exercise> traps = e.getTrapsExercises();
		List<Exercise> back = e.getBackExercises();	
		List<Exercise> abs = e.getAbExercises();
		Exercise[] cardio = e.getCardioExercises();
		
		//Randomize lists
		Collections.shuffle(biceps);
		Collections.shuffle(triceps);
		Collections.shuffle(chest);
		Collections.shuffle(legs);
		Collections.shuffle(lowerBack);
		Collections.shuffle(shoulders);
		Collections.shuffle(traps);
		Collections.shuffle(back);
		Collections.shuffle(abs);
		
		Random rand = new Random();

		// What is their goal? (loss 0 or bulk 1)
		int goal = profile.getGoal();

		// How many work-outs per week are they doing?
		int daysAWeek = profile.getWorkouts();

		// What difficulty level are they at?
		String difficulty = profile.getDifficulty();
		
		// What work-out are they on for this week?
		int workoutNum = profile.getWeeksWorkouts(); 

		/* Weight Loss Track */
		if (goal == 0) {

			// Populate exercise list based off of how many days per week and what day they are on
			switch (daysAWeek) {
			
			case 1:
				exercises.add(cardio[ELLIPTICAL]);
				exercises.add(cardio[BENCH]);
				exercises.add(cardio[ROWING]);
				exercises.add(abs.remove(rand.nextInt(abs.size())));
				exercises.add(abs.remove(rand.nextInt(abs.size())));
				exercises.add(cardio[JUMPROPE]);
				exercises.add(cardio[TREADMILL]);
				break;
			case 2:
				if (workoutNum == 1) {
					exercises.add(cardio[ELLIPTICAL]);
					exercises.add(cardio[BENCH]);
					exercises.add(cardio[JUMPROPE]);
					exercises.add(abs.remove(rand.nextInt(abs.size())));
					exercises.add(abs.remove(rand.nextInt(abs.size())));
					exercises.add(cardio[TREADMILL]);
				} else {
					exercises.add(cardio[TREADMILL]);
					exercises.add(abs.remove(rand.nextInt(abs.size())));
					exercises.add(abs.remove(rand.nextInt(abs.size())));
					exercises.add(cardio[STAIRCLIMBER]);
					exercises.add(back.remove(rand.nextInt(back.size())));
					exercises.add(cardio[ROWING]);
				}
				break;
			case 3:
				if (workoutNum == 1) {
					exercises.add(cardio[CYCLE]);
					exercises.add(abs.remove(rand.nextInt(abs.size())));
					exercises.add(abs.remove(rand.nextInt(abs.size())));
					exercises.add(cardio[ROWING]);
					exercises.add(cardio[STAIRCLIMBER]);
					exercises.add(cardio[JUMPINGJACKS]);
				} else if (workoutNum == 2) {
					exercises.add(cardio[ELLIPTICAL]);
					exercises.add(cardio[BENCH]);
					exercises.add(cardio[CYCLE]);
					exercises.add(abs.remove(rand.nextInt(abs.size())));
					exercises.add(abs.remove(rand.nextInt(abs.size())));
					exercises.add(cardio[JUMPINGJACKS]);
				} else {
					exercises.add(cardio[CYCLE]);
					exercises.add(cardio[ROWING]);
					exercises.add(abs.remove(rand.nextInt(abs.size())));
					exercises.add(abs.remove(rand.nextInt(abs.size())));
					exercises.add(back.remove(rand.nextInt(back.size())));
					exercises.add(cardio[ELLIPTICAL]);
				}
				break;
			case 4:
				if (workoutNum == 1) {
					exercises.add(cardio[ELLIPTICAL]);
					exercises.add(cardio[BENCH]);
					exercises.add(cardio[STAIRCLIMBER]);
					exercises.add(abs.remove(rand.nextInt(abs.size())));
					exercises.add(abs.remove(rand.nextInt(abs.size())));
				} else if (workoutNum == 2) {
					exercises.add(cardio[CYCLE]);
					exercises.add(back.remove(rand.nextInt(back.size())));
					exercises.add(cardio[ROWING]);
					exercises.add(cardio[JUMPINGJACKS]);
				} else if (workoutNum == 3) {
					exercises.add(cardio[TREADMILL]);
					exercises.add(cardio[JUMPROPE]);
					exercises.add(abs.remove(rand.nextInt(abs.size())));
					exercises.add(abs.remove(rand.nextInt(abs.size())));
					exercises.add(cardio[CYCLE]);
				} else {
					exercises.add(cardio[CYCLE]);
					exercises.add(cardio[BENCH]);
					exercises.add(back.remove(rand.nextInt(back.size())));
					exercises.add(cardio[STAIRCLIMBER]);
					exercises.add(cardio[ROWING]);
				}
				//No break b/c 5-day schedule = 4-day schedule +1, should cascade
			case 5:
				exercises.add(cardio[ELLIPTICAL]);
				exercises.add(cardio[JUMPROPE]);
				exercises.add(cardio[CYCLE]);
				exercises.add(cardio[STAIRCLIMBER]);
				exercises.add(cardio[ROWING]);
				break;

			default:
				break;

			}
			Collections.shuffle(exercises);
		}

		/* Bulk-Up Track */
		else {			
			switch (daysAWeek) {
			case 1:
				for (int i = 0; i<2; i++) {
					exercises.add(chest.remove(rand.nextInt(chest.size())));
					exercises.add(biceps.remove(rand.nextInt(biceps.size())));
					exercises.add(back.remove(rand.nextInt(back.size())));
					exercises.add(shoulders.remove(rand.nextInt(shoulders.size())));
					exercises.add(triceps.remove(rand.nextInt(triceps.size())));
				}	
				exercises.add(traps.remove(rand.nextInt(traps.size())));
				exercises.add(legs.remove(rand.nextInt(legs.size())));
				break;
			case 2:
				if (workoutNum == 1) {
					exercises.add(legs.remove(rand.nextInt(legs.size())));
					exercises.add(chest.remove(rand.nextInt(chest.size())));
					exercises.add(chest.remove(rand.nextInt(chest.size())));
					exercises.add(triceps.remove(rand.nextInt(triceps.size())));
					exercises.add(triceps.remove(rand.nextInt(triceps.size())));
					exercises.add(back.remove(rand.nextInt(back.size())));
					exercises.add(lowerBack.remove(rand.nextInt(lowerBack.size())));
					exercises.add(shoulders.remove(rand.nextInt(shoulders.size())));
					exercises.add(biceps.remove(rand.nextInt(biceps.size())));
					exercises.add(traps.remove(rand.nextInt(traps.size())));
					Collections.shuffle(exercises);
				} else {
					exercises.add(legs.remove(rand.nextInt(legs.size())));
					exercises.add(back.remove(rand.nextInt(back.size())));
					exercises.add(back.remove(rand.nextInt(back.size())));
					exercises.add(biceps.remove(rand.nextInt(biceps.size())));
					exercises.add(biceps.remove(rand.nextInt(biceps.size())));
					exercises.add(lowerBack.remove(rand.nextInt(lowerBack.size())));
					exercises.add(chest.remove(rand.nextInt(chest.size())));
					exercises.add(triceps.remove(rand.nextInt(triceps.size())));
					exercises.add(traps.remove(rand.nextInt(traps.size())));
					Collections.shuffle(exercises);
				}
				break;
			case 3:
				if (workoutNum == 1) {
					for (int i = 0; i<5; i++) {
						exercises.add(legs.remove(rand.nextInt(legs.size())));
					}
				} else if (workoutNum == 2) {
					for (int i = 0; i<2; i++) {
						exercises.add(chest.remove(rand.nextInt(chest.size())));
						exercises.add(shoulders.remove(rand.nextInt(shoulders.size())));
						exercises.add(triceps.remove(rand.nextInt(triceps.size())));
					}
				} else {
					exercises.add(back.remove(rand.nextInt(back.size())));
					exercises.add(biceps.remove(rand.nextInt(biceps.size())));
					exercises.add(lowerBack.remove(rand.nextInt(lowerBack.size())));
					exercises.add(biceps.remove(rand.nextInt(biceps.size())));
					exercises.add(back.remove(rand.nextInt(back.size())));
				}
				break;
			case 4:
				if (workoutNum == 1) {
					for (int i = 0; i<6; i++) {
						exercises.add(legs.remove(rand.nextInt(legs.size())));
					}
					
				} else if (workoutNum == 2) {
					exercises.add(chest.remove(rand.nextInt(chest.size())));
					exercises.add(chest.remove(rand.nextInt(chest.size())));
					exercises.add(chest.remove(rand.nextInt(chest.size())));
					exercises.add(triceps.remove(rand.nextInt(triceps.size())));
					exercises.add(triceps.remove(rand.nextInt(triceps.size())));
					Collections.shuffle(exercises);
					
				} else if (workoutNum == 3) {
					for (int i = 0; i<3; i++) {
						exercises.add(back.remove(rand.nextInt(back.size())));
						exercises.add(biceps.remove(rand.nextInt(biceps.size())));
					}
					
				} else {
					exercises.add(shoulders.remove(rand.nextInt(shoulders.size())));
					exercises.add(triceps.remove(rand.nextInt(triceps.size())));
					exercises.add(traps.remove(rand.nextInt(traps.size())));
					exercises.add(shoulders.remove(rand.nextInt(shoulders.size())));
					exercises.add(triceps.remove(rand.nextInt(triceps.size())));
					exercises.add(shoulders.remove(rand.nextInt(shoulders.size())));
				}
				//no break because first 5 days of 5-day schedule are same as 4-day schedule, should cascade this way
			case 5:
				if (workoutNum == 5) {
					for (int i = 0; i<5; i++) {
						exercises.add(legs.remove(rand.nextInt(legs.size())));
					}
					exercises.add(lowerBack.remove(rand.nextInt(lowerBack.size())));
					Collections.shuffle(exercises);
				}
				break;

			default:
				break;
			}
			
			for (Exercise ex : exercises)
				ex.setDifficulty(difficulty, goal);
		}
		
		return exercises;
	}

}

package bicepbuddy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import exercises.BackExercise;
import exercises.BicepExercise;
import exercises.ChestExercises;
import exercises.LegExercise;
import exercises.LowerBackExercise;
import exercises.ShoulderExercise;
import exercises.TrapsExercise;
import exercises.TricepExercise;

public class Workout implements Serializable {

	private static final long serialVersionUID = 4365628953453152523L;
	private List<Exercise> exercises;
	private Profile profile;

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
		
		//Randomize lists
		Collections.shuffle(biceps);
		Collections.shuffle(triceps);
		Collections.shuffle(chest);
		Collections.shuffle(legs);
		Collections.shuffle(lowerBack);
		Collections.shuffle(shoulders);
		Collections.shuffle(traps);
		Collections.shuffle(back);
		
		Random rand = new Random();

		// What is their goal? (loss 0 or bulk 1)
		int goal = profile.getGoal();

		// How many work-outs per week are they doing?
		int daysAWeek = profile.getWorkouts();

		// What difficulty level are they at?
		String difficulty = profile.getDifficulty();
		
		// What work-out are they on for this week?
		int workoutNum = profile.getWeeksWorkouts()+1; //plus 1 for current workout num

		/* Weight Loss Track */
		if (goal == 0) {

			// Populate exercise list based off of how many days per week and what day they are on
			switch (daysAWeek) {
			
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;

			default:
				break;

			}

		}

		/* Bulk-Up Track */
		else {			
			switch (daysAWeek) {
			case 1:
				for (int i = 0; i<2; i++) {
					exercises.add(legs.get(rand.nextInt(legs.size())));
					exercises.add(chest.get(rand.nextInt(chest.size())));
					exercises.add(biceps.get(rand.nextInt(biceps.size())));
					exercises.add(back.get(rand.nextInt(back.size())));
					exercises.add(shoulders.get(rand.nextInt(shoulders.size())));
					exercises.add(triceps.get(rand.nextInt(triceps.size())));	
					exercises.add(traps.get(rand.nextInt(traps.size())));
				}
				break;
			case 2:
				if (workoutNum == 1) {
					exercises.add(legs.get(rand.nextInt(legs.size())));
					exercises.add(chest.get(rand.nextInt(chest.size())));
					exercises.add(chest.get(rand.nextInt(chest.size())));
					exercises.add(triceps.get(rand.nextInt(triceps.size())));
					exercises.add(triceps.get(rand.nextInt(triceps.size())));
					exercises.add(back.get(rand.nextInt(back.size())));
					exercises.add(lowerBack.get(rand.nextInt(lowerBack.size())));
					exercises.add(shoulders.get(rand.nextInt(shoulders.size())));
					exercises.add(biceps.get(rand.nextInt(biceps.size())));
					exercises.add(traps.get(rand.nextInt(traps.size())));
					Collections.shuffle(exercises);
				} else {
					exercises.add(legs.get(rand.nextInt(legs.size())));
					exercises.add(back.get(rand.nextInt(back.size())));
					exercises.add(back.get(rand.nextInt(back.size())));
					exercises.add(biceps.get(rand.nextInt(biceps.size())));
					exercises.add(biceps.get(rand.nextInt(biceps.size())));
					exercises.add(lowerBack.get(rand.nextInt(lowerBack.size())));
					exercises.add(chest.get(rand.nextInt(chest.size())));
					exercises.add(triceps.get(rand.nextInt(triceps.size())));
					exercises.add(traps.get(rand.nextInt(traps.size())));
					Collections.shuffle(exercises);
				}
				break;
			case 3:
				if (workoutNum == 1) {
					for (int i = 0; i<5; i++) {
						exercises.add(legs.get(rand.nextInt(legs.size())));
					}
				} else if (workoutNum == 2) {
					for (int i = 0; i<2; i++) {
						exercises.add(chest.get(rand.nextInt(chest.size())));
						exercises.add(shoulders.get(rand.nextInt(shoulders.size())));
						exercises.add(triceps.get(rand.nextInt(triceps.size())));
					}
				} else {
					exercises.add(back.get(rand.nextInt(back.size())));
					exercises.add(biceps.get(rand.nextInt(biceps.size())));
					exercises.add(lowerBack.get(rand.nextInt(lowerBack.size())));
					exercises.add(biceps.get(rand.nextInt(biceps.size())));
					exercises.add(back.get(rand.nextInt(back.size())));
				}
				break;
			case 4:
				if (workoutNum == 1) {
					for (int i = 0; i<6; i++) {
						exercises.add(legs.get(rand.nextInt(legs.size())));
					}
					
				} else if (workoutNum == 2) {
					exercises.add(chest.get(rand.nextInt(chest.size())));
					exercises.add(chest.get(rand.nextInt(chest.size())));
					exercises.add(chest.get(rand.nextInt(chest.size())));
					exercises.add(triceps.get(rand.nextInt(triceps.size())));
					exercises.add(triceps.get(rand.nextInt(triceps.size())));
					Collections.shuffle(exercises);
					
				} else if (workoutNum == 3) {
					for (int i = 0; i<3; i++) {
						exercises.add(back.get(rand.nextInt(back.size())));
						exercises.add(biceps.get(rand.nextInt(biceps.size())));
					}
					
				} else {
					exercises.add(shoulders.get(rand.nextInt(shoulders.size())));
					exercises.add(triceps.get(rand.nextInt(triceps.size())));
					exercises.add(traps.get(rand.nextInt(traps.size())));
					exercises.add(shoulders.get(rand.nextInt(shoulders.size())));
					exercises.add(triceps.get(rand.nextInt(triceps.size())));
					exercises.add(shoulders.get(rand.nextInt(shoulders.size())));
				}
				//no break because first 5 days of 5-day schedule are same as 4-day schedule, should cascade this way
			case 5:
				if (workoutNum == 5) {
					for (int i = 0; i<5; i++) {
						exercises.add(legs.get(rand.nextInt(legs.size())));
					}
					exercises.add(lowerBack.get(rand.nextInt(lowerBack.size())));
					Collections.shuffle(exercises);
				}
				break;

			default:
				break;
			}
		}

		for (Exercise ex : exercises)
			ex.setDifficulty(difficulty);
		
		return exercises;
	}

}

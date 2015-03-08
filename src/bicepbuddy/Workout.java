package bicepbuddy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

	public List<Exercise> Generator(int workoutNumber) {

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

			// Calculate the workout!
			switch (daysAWeek) {
			case 1:
				exercises.add(BicepExercise.getBiceps().get(0));
				exercises.add(TricepExercise.getTriceps().get(0));
				exercises.add(ShoulderExercise.getShoulders().get(0));
				exercises.add(ChestExercises.getChest().get(0));
				exercises.add(LegExercise.getLegs().get(0));
				exercises.add(BackExercise.getUpperBack().get(0));
				exercises.add(LowerBackExercise.getLowerBack().get(0));
				exercises.add(TrapsExercise.getTraps().get(0));
				break;
			case 2:
				exercises.add(BicepExercise.getBiceps().get(0));
				exercises.add(BicepExercise.getBiceps().get(0));
				exercises.add(ChestExercises.getChest().get(0));
				exercises.add(ChestExercises.getChest().get(0));
				exercises.add(LegExercise.getLegs().get(0));
				exercises.add(LegExercise.getLegs().get(0));
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

		return exercises;
	}

}

package exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bicepbuddy.Exercise;
import exercises.Legs.Squats;

public class LegExercise extends Exercise implements Serializable {

	private static final long serialVersionUID = 2669540857055087710L;
	private static List<LegExercise> legList = new ArrayList<LegExercise>();

	public LegExercise() {
	}

	public static List<LegExercise> getChest() {

		legList.add(new Squats());

		Collections.shuffle(legList);
		return legList;
	}

	public static List<Exercise> getLegs() {
		// TODO Auto-generated method stub
		return null;
	}
}

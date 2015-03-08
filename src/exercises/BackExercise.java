package exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exercises.Legs.Squats;
import bicepbuddy.Exercise;

public class BackExercise extends Exercise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8790040851512659654L;
	private static List<BackExercise> backList = new ArrayList<BackExercise>();

	public BackExercise() {
	}

	public static List<BackExercise> getBack() {

		//add all types

		Collections.shuffle(backList);
		return backList;
	}

	public static List<Exercise> getUpperBack() {
		// TODO Auto-generated method stub
		return null;
	}
}

package exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bicepbuddy.Exercise;
import exercises.Shoulders.AlternatingDeltoidRaise;
import exercises.Shoulders.ArmCircles;
import exercises.Shoulders.ArnoldDumbbellPress;
import exercises.Shoulders.BackFlyersWithBands;
import exercises.Shoulders.BentOverDumbbellRearDeltRaiseWithHeadOnBench;
import exercises.Shoulders.BentOverLowPulleySideLateral;
import exercises.Shoulders.CarDrivers;

public class ShoulderExercise extends Exercise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5704045475061362382L;
	/**
	 * 
	 */

	private static List<ShoulderExercise> shoulderList = new ArrayList<ShoulderExercise>();

	public ShoulderExercise() {
	}

	public static List<ShoulderExercise> getBiceps() {

		shoulderList.add(new AlternatingDeltoidRaise());
		shoulderList.add(new ArmCircles());
		shoulderList.add(new ArnoldDumbbellPress());
		shoulderList.add(new BackFlyersWithBands());
		shoulderList.add(new BentOverDumbbellRearDeltRaiseWithHeadOnBench());
		shoulderList.add(new BentOverLowPulleySideLateral());
		shoulderList.add(new CarDrivers());

		Collections.shuffle(shoulderList);
		return shoulderList;
	}

	public static List<Exercise> getShoulders() {
		// TODO Auto-generated method stub
		return null;
	}
}

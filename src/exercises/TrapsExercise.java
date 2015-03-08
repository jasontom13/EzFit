package exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exercises.Triceps.BodyUp;
import exercises.Triceps.CableOneArmTricepExtension;
import exercises.Triceps.CloseGripBarbellBenchPress;
import exercises.Triceps.DumbbellOneArmTricepsExtension;
import exercises.Triceps.ParallelBarDip;
import exercises.Triceps.SeatedTricepsPress;
import exercises.Triceps.StandingBentOverOneArmDumbbellTricepsExtension;
import exercises.Triceps.TricepsPushdown;
import bicepbuddy.Exercise;

public class TrapsExercise extends Exercise implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4455967463527571729L;
	private static List<TrapsExercise> trapsList;
	public TrapsExercise() {
	}
	
	public static List<TrapsExercise> getTriceps(){
		
		//trapsList.add(new something);

		
		Collections.shuffle(trapsList);
		return trapsList;
	}

	public static List<Exercise> getTraps() {
		// TODO Auto-generated method stub
		return null;
	}

}

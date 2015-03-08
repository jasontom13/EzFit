package exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bicepbuddy.Exercise;
import exercises.Triceps.BodyUp;
import exercises.Triceps.CableOneArmTricepExtension;
import exercises.Triceps.CloseGripBarbellBenchPress;
import exercises.Triceps.DumbbellOneArmTricepsExtension;
import exercises.Triceps.ParallelBarDip;
import exercises.Triceps.SeatedTricepsPress;
import exercises.Triceps.StandingBentOverOneArmDumbbellTricepsExtension;
import exercises.Triceps.TricepsPushdown;

public class TricepExercise extends Exercise implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5381161887377682651L;
	private static List<TricepExercise> tricepList = new ArrayList<TricepExercise>();
	
	public TricepExercise() {
	}
	
	public static List<TricepExercise> getTriceps(){
		
		tricepList.add(new CableOneArmTricepExtension());
		tricepList.add(new CloseGripBarbellBenchPress());
		tricepList.add(new BodyUp());
		tricepList.add(new DumbbellOneArmTricepsExtension());
		tricepList.add(new ParallelBarDip());
		tricepList.add(new SeatedTricepsPress());
		tricepList.add(new StandingBentOverOneArmDumbbellTricepsExtension());
		tricepList.add(new TricepsPushdown());
		
		Collections.shuffle(tricepList);
		return tricepList;
	}
}

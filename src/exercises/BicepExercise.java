package exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bicepbuddy.Exercise;
import exercises.Biceps.CableCurl;
import exercises.Biceps.ConcentrationCurl;
import exercises.Biceps.HammerCurl;
import exercises.Biceps.InclineDumbellCurl;
import exercises.Biceps.PreacherCurl;
import exercises.Biceps.ReverseCurl;
import exercises.Biceps.StraightBarCurl;

public class BicepExercise extends Exercise implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7986671599040496237L;
	private static List<BicepExercise> bicepList = new ArrayList<BicepExercise>();
			
	public BicepExercise() {
	}
	
	public static List<BicepExercise> getBiceps(){
		
		bicepList.add(new CableCurl());
		bicepList.add(new ConcentrationCurl());
		bicepList.add(new HammerCurl());
		bicepList.add(new InclineDumbellCurl());
		bicepList.add(new PreacherCurl());
		bicepList.add(new ReverseCurl());
		bicepList.add(new StraightBarCurl());
		
		Collections.shuffle(bicepList);
		return bicepList;
	}
}

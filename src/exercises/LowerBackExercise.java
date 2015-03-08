package exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exercises.Legs.Squats;
import bicepbuddy.Exercise;

public class LowerBackExercise extends Exercise implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4531251549804747032L;
	private static List<LowerBackExercise> lowerBackList;
	
	public LowerBackExercise() {
	}

	public static List<LowerBackExercise> getLowerBack() {

		//lowerBackList.add(new Squats());

		Collections.shuffle(lowerBackList);
		return lowerBackList;
	}

}

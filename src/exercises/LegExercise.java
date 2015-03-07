package exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bicepbuddy.Exercise;

public class LegExercise extends Exercise implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1821040058248977046L;
	private static List<LegExercise> legs;
	public LegExercise() {
		
		legs = new ArrayList<LegExercise>();

	}
	
	public List<LegExercise> getLeg(){
		Collections.shuffle(legs);
		return legs;
	}
}

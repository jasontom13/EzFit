package exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bicepbuddy.Exercise;

public class ShoulderExercise extends Exercise implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7639440435395975055L;
	private static List<ShoulderExercise> shoulders;
	public ShoulderExercise() {
		
		shoulders = new ArrayList<ShoulderExercise>();

	}
	
	public List<ShoulderExercise> getShoulders(){
		Collections.shuffle(shoulders);
		return shoulders;
	}
}

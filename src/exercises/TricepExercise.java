package exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bicepbuddy.Exercise;

public class TricepExercise extends Exercise implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5381161887377682651L;
	private static List<TricepExercise> triceps;
	public TricepExercise() {
		
		triceps = new ArrayList<TricepExercise>();

	}
	
	public List<TricepExercise> getTriceps(){
		Collections.shuffle(triceps);
		return triceps;
	}

}

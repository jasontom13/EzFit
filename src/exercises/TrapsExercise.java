package exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bicepbuddy.Exercise;

public class TrapsExercise extends Exercise implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4455967463527571729L;
	private static List<TrapsExercise> traps;
	public TrapsExercise() {
		
		traps = new ArrayList<TrapsExercise>();

	}
	
	public List<TrapsExercise> getTraps(){
		Collections.shuffle(traps);
		return traps;
	}

}

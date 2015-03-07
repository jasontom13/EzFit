package exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bicepbuddy.Exercise;

public class BackExercise extends Exercise implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4531251549804747032L;
	private static List<BackExercise> back;
	public BackExercise(String name, String desc, String type, Integer sets,
			Integer reps, Integer duration) {
		
		back = new ArrayList<BackExercise>();

	}
	
	public static List<BackExercise> getBacks(){
		Collections.shuffle(back);
		return back;
	}
}

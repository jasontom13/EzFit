package exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bicepbuddy.Exercise;

public class ChestExercises extends Exercise implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6806737520119569926L;
	private static List<ChestExercises> chest;
	public ChestExercises() {
		
		chest = new ArrayList<ChestExercises>();

	}
	
	public List<ChestExercises> getChest(){
		Collections.shuffle(chest);
		return chest;
	}

}

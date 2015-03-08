package exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bicepbuddy.Exercise;
import exercises.Chest.Butterfly;

public class ChestExercises extends Exercise implements Serializable {

	private static final long serialVersionUID = 2669540857055087710L;
	private static List<ChestExercises> chestList = new ArrayList<ChestExercises>();

	public ChestExercises() {
	}

	public static List<ChestExercises> getChest() {

		chestList.add(new Butterfly());

		Collections.shuffle(chestList);
		return chestList;
	}
}

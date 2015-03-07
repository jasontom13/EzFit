package bicepbuddy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Workout {

	private List<Exercise> exercises;
	
	public Workout() {
		exercises = new ArrayList<Exercise>();
	}
	
	public void add(Exercise e) {
		exercises.add(e);
	}
	
	//get exercise at top of list
	public Exercise getExercise(Integer i) {
		return exercises.get(i);
	}
	
	public boolean isEmpty(){
		Boolean isEmpty = false;
		for (Exercise e : exercises)
			isEmpty = isEmpty && e.getDone();
		return isEmpty;
	}

	public List<Exercise> getList() {
		return exercises;
	}
}

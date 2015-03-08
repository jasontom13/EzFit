package bicepbuddy;

import java.io.Serializable;

public class Main implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4430534502202925130L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profile profile = new Profile();
		profile.setAge(199);
		profile.setDifficulty("Easy");
		profile.setHeight(5, 10);
		profile.setWeight(150.0);
		profile.setName("Fucker");
		profile.setWorkouts(1);
		Workout workout = new Workout(profile);
		
		//workout.Generator();
		
		System.out.println(profile.getWeight());
		System.out.println(profile.getHeight());
		System.out.println(profile.getBmi());
		
		System.out.println(workout.getExercise(0).getName());
	}

}

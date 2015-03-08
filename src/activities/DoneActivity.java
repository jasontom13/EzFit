package activities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import bicepbuddy.Profile;
import edu.arizona.ezfit.R;

public class DoneActivity extends Activity {

	private Profile user;
	private int numCompleted;
	private int weeklyWorkouts;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_done);
		
		FileInputStream fileInStream = null;

		try {
			fileInStream = getApplicationContext().openFileInput("saved.dat");
			ObjectInputStream objectInStream = new ObjectInputStream(
					fileInStream);
			user = (Profile) objectInStream.readObject();
			objectInStream.close();
		} catch (java.io.FileNotFoundException e) {
			e.printStackTrace();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		} catch (java.lang.ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		user.completedWorkout();
		numCompleted = user.getWeeksWorkouts()-1;
		weeklyWorkouts = user.getWorkouts();
		
		TextView head = (TextView) findViewById(R.id.progressReport);
		head.setText("You have completed " + (numCompleted) + " out of " + (weeklyWorkouts) + " workouts this week!");
		
		ProgressBar progress = (ProgressBar) findViewById(R.id.progressBar);
		progress.setMax(weeklyWorkouts);
		progress.setProgress(numCompleted);
		String filename = "saved.dat";
		FileOutputStream fileOutStream = null;
		try {

			fileOutStream = openFileOutput(filename,
					Context.MODE_PRIVATE);
			ObjectOutputStream outStream = new ObjectOutputStream(
					fileOutStream);
			outStream.writeObject(user);
			outStream.close();

		} catch (java.io.FileNotFoundException e) {
			e.printStackTrace();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		
	}
}

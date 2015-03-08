package activities;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import bicepbuddy.Profile;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import edu.arizona.ezfit.R;

public class SplashScreenActivity extends Activity {
	Profile user = null;
	/** Duration of wait **/
	private final int SPLASH_DISPLAY_LENGTH = 1500;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splashscreen);
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
		
				Intent mainIntent;
				/* Create an Intent that will start the Menu-Activity. */
				if (user == null) {
					mainIntent = new Intent(SplashScreenActivity.this,
							MainActivity.class);
				}
				else{
					mainIntent = new Intent(SplashScreenActivity.this, WorkoutActivity.class);
				}
				startActivity(mainIntent);
			}
	

	
}

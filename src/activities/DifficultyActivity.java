package activities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ToggleButton;
import bicepbuddy.Profile;
import edu.arizona.ezfit.R;

public class DifficultyActivity extends Activity {
	Profile user=new Profile();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_difficulty);
		final ToggleButton easy = (ToggleButton) findViewById(R.id.easyDiff);
		final ToggleButton medium = (ToggleButton) findViewById(R.id.mediumDiff);
		final ToggleButton hard = (ToggleButton) findViewById(R.id.hardDiff);
		final Button next = (Button) findViewById(R.id.diffNext);
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
		//Log.i("JASON:", user.toString());

		OnClickListener bl = new OnClickListener() {

			@Override
			public void onClick(View v) {
				int id = v.getId();
				if (id == R.id.easyDiff) {
					if (easy.isChecked()){
						medium.setChecked(false);
						hard.setChecked(false);
					}
				} else if (id == R.id.mediumDiff) {
					if (medium.isChecked()){
						easy.setChecked(false);
						hard.setChecked(false);
					}
				} else if (id == R.id.hardDiff) {
					if (hard.isChecked()){
						medium.setChecked(false);
						easy.setChecked(false);
					}
				} else if (id == R.id.diffNext) {
					if (easy.isChecked()) {
					 user.setDifficulty("Easy");
					 } else if (medium.isChecked()) {
					 user.setDifficulty("Medium");
					 } else {
					 user.setDifficulty("Hard");
					 }
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
					Intent i = new Intent(DifficultyActivity.this, WorkoutsummaryActivity.class);
					startActivity(i);
				}

			}

		};
		easy.setOnClickListener(bl);
		medium.setOnClickListener(bl);
		hard.setOnClickListener(bl);
		next.setOnClickListener(bl);
	}

}

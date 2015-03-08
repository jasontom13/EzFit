package activities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import bicepbuddy.Profile;
import edu.arizona.ezfit.R;
import extras.VerticalSeekBar;

public class MainActivity extends Activity{
	Profile user = new Profile();
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button loss = (Button) findViewById(R.id.weightLoss);
		Button gain = (Button) findViewById(R.id.massGain);
		
		loss.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this,DifficultyActivity.class);
				user.setGoal(0);
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
				startActivity(i);
			}
		});
		gain.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this,DifficultyActivity.class);
				user.setGoal(1);
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
				startActivity(i);
			}
			
		});
	}
}

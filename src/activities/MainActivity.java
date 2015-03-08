package activities;

import android.app.Activity;
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
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button loss = (Button) findViewById(R.id.weightLoss);
		Button gain = (Button) findViewById(R.id.massGain);
		final Profile user = new Profile();
		loss.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this,DifficultyActivity.class);
				user.setGoal(0);
				startActivity(i);
				
			}
			
		});
		gain.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this,DifficultyActivity.class);
				user.setGoal(1);
				startActivity(i);
				
			}
			
		});
		
	}
	
}

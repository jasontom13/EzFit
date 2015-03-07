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
		final VerticalSeekBar bar = (VerticalSeekBar) findViewById(R.id.goalSeekBar);
		Button doneButton = (Button) findViewById(R.id.goalButton);
		final Profile user = new Profile();
		doneButton.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this,DifficultyActivity.class);
				user.setDifficulty(bar.getProgress());
				Log.i("JASON", bar.getProgress()+"");
				startActivity(i);
				
			}
			
		});
		bar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
}

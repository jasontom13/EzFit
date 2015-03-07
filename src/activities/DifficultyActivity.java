package activities;

import edu.arizona.ezfit.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class DifficultyActivity extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_difficulty);
		
		Button doneButton = (Button) findViewById(R.id.diffNext);
	}
}

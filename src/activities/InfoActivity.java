package activities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;
import bicepbuddy.Profile;
import edu.arizona.ezfit.R;

public class InfoActivity extends Activity{
	private Profile user;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_information);
		
		final EditText age = (EditText) findViewById(R.id.ageText);
		final EditText weight = (EditText) findViewById(R.id.weightText);
		final EditText ft = (EditText) findViewById(R.id.ftText);
		final EditText in = (EditText) findViewById(R.id.inText);
		Button next = (Button) findViewById(R.id.nextInfo);
		final NumberPicker nums = (NumberPicker) findViewById(R.id.numDays);
		nums.setMaxValue(5);
		nums.setMinValue(1);
		nums.setValue(3);
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
		
		next.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				if (age.getText().toString().equals("")){
					Toast.makeText(getApplicationContext(), "Please enter your age.", 
							   Toast.LENGTH_LONG).show();
				}
				else if (weight.getText().toString().equals("")){
					Toast.makeText(getApplicationContext(), "Please enter your weight.", 
							   Toast.LENGTH_LONG).show();
				}
				else if (ft.getText().toString().equals("") || in.getText().toString().equals("")){
					Toast.makeText(getApplicationContext(), "Please enter height.", 
							   Toast.LENGTH_LONG).show();
				}
				else{
					user.setAge(Integer.parseInt(age.getText().toString()));
					user.setWeight(Double.parseDouble(weight.getText().toString()));
					user.setHeight(Integer.parseInt(ft.getText().toString()), Integer.parseInt(in.getText().toString()));
					user.setWorkouts(nums.getValue());
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
					Intent i = new Intent(InfoActivity.this,WorkoutActivity.class);
					startActivity(i);
				}
				
				
			}
			
		});
		
		
	}
	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {
	View view = getCurrentFocus();
	boolean ret = super.dispatchTouchEvent(event);

	if (view instanceof EditText) {
	    View w = getCurrentFocus();
	    int scrcoords[] = new int[2];
	    w.getLocationOnScreen(scrcoords);
	    float x = event.getRawX() + w.getLeft() - scrcoords[0];
	    float y = event.getRawY() + w.getTop() - scrcoords[1];

	    if (event.getAction() == MotionEvent.ACTION_UP 
	&& (x < w.getLeft() || x >= w.getRight() 
	|| y < w.getTop() || y > w.getBottom()) ) { 
	        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
	        imm.hideSoftInputFromWindow(getWindow().getCurrentFocus().getWindowToken(), 0);
	    }
	}
	return ret;
	}
}

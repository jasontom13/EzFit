package activities;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import bicepbuddy.Exercise;
import bicepbuddy.Profile;
import bicepbuddy.Workout;
import edu.arizona.ezfit.R;
import extras.ExerciseAdapter;

public class WorkoutActivity extends Activity {

	// private Profile user;
	// private Workout wo;
	// private List<Exercise> exercises;
	// private List<String> exs;
	// @Override
	// public void onCreate(Bundle savedInstanceState){
	// super.onCreate(savedInstanceState);
	// setContentView(R.layout.activity_workout);
	// ListView lv = (ListView) findViewById(R.id.workoutList);
	// // exercises = wo.getExercises();
	// // int i=1;
	// // for (Exercise ex : exercises){
	// // exs.add(i+ ".) "+ ex.getName());
	// // }
	// exs = new ArrayList<String>();
	// exs.add("YO");
	// exs.add("HELLO");
	//
	// ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,
	// R.layout.simplerow1, exs);
	// lv.setAdapter(listAdapter);
	// }
	private Profile user;
	private NotificationManager mgr=null;
	private Notification notification;
	private ExpandableListView listView1;
	private HashMap<String, String> childData;
	private List<Exercise> exercise_data;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_workout);

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

		childData = new HashMap<String, String>();
		listView1 = (ExpandableListView) findViewById(R.id.workoutList);

		Workout workout = new Workout(user);
		exercise_data = workout.Generator();
		for (Exercise e : exercise_data) {
			childData.put(e.getName(), e.getDescription());
		}
		

		ExerciseAdapter adapter = new ExerciseAdapter(this, exercise_data,
				childData);

		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_row, null);
		
		
		listView1.addHeaderView(header);
		listView1.setAdapter(adapter);
		
		TextView head = (TextView) findViewById(R.id.txtHeader);
		head.setText("Day " + (user.getTotalWorkouts()+1));

	}
	
	public void notify(View v){
		if (mgr==null){
			mgr = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
			notification = new Notification.Builder(WorkoutActivity.this)
	         .setContentTitle(exercise_data.get(0).getName())
	         .setContentText(exercise_data.get(0).getSets() + " sets x " + exercise_data.get(0).getReps() + " reps")
	         .setSmallIcon(R.drawable.ic_launcher)
	         .build();
		}
	}
	
	protected void onNewIntent(Intent intent) { 
		
	}

}

package activities;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
	private NotificationManager mgr = null;
	private Notification notification;
	private ExpandableListView listView1;
	private HashMap<String, String> childData;
	private List<Exercise> exercise_data;
	private int k = 0;
	private ExerciseAdapter adapter;

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

		adapter = new ExerciseAdapter(this, exercise_data,
				childData);

		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_row, null);

		listView1.addHeaderView(header);
		listView1.setAdapter(adapter);

		TextView head = (TextView) findViewById(R.id.txtHeader);
		head.setText("Day " + (user.getTotalWorkouts() + 1));
	}

	public void notify(View v) {
		if (mgr == null) {
			mgr = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

			Intent myIntent = new Intent(this, WorkoutActivity.class);
			PendingIntent pendingIntent = PendingIntent.getActivity(
					WorkoutActivity.this, 0, myIntent, Intent.FILL_IN_ACTION);
			// notification.flags |= Notification.FLAG_AUTO_CANCEL;
			notification = new Notification.Builder(WorkoutActivity.this)
					.setContentTitle(exercise_data.get(k).getName())
					.setContentText(
							exercise_data.get(k).getSets() + " sets x "
									+ exercise_data.get(k).getReps() + " reps")
					.setContentIntent(pendingIntent)
					.setSmallIcon(R.drawable.ic_launcher).build();
			k++;
			mgr.notify(1, notification);

		}
	}
	@Override
	protected void onNewIntent(Intent intent) {
		if (k < exercise_data.size()) {
			Log.i("K<", k+"");
			Intent myIntent = new Intent(this, WorkoutActivity.class);
			PendingIntent pendingIntent = PendingIntent.getActivity(
					WorkoutActivity.this, 0, myIntent, Intent.FILL_IN_ACTION);
			notification = new Notification.Builder(this)
					.setContentTitle(exercise_data.get(k).getName())
					.setContentText(
							exercise_data.get(k).getSets() + " sets x "
									+ exercise_data.get(k).getReps() + " reps")
					.setContentIntent(pendingIntent)
					.setSmallIcon(R.drawable.ic_launcher).build();
			exercise_data.get(k-1).setDone(true);
			Log.i("EXERCISE",exercise_data.get(k-1).getName());
			adapter.notifyDataSetChanged();
			k++;
			mgr.notify(1, notification);
		}
		else{
			Log.i("WE", "GOT HERE");
			Intent myIntent = new Intent(this, DoneActivity.class);
			adapter.notifyDataSetChanged();
			notification = new Notification.Builder(this)
			.setContentTitle("Congratulations!")
			.setContentText("You've completed the workout!")
			.setSmallIcon(R.drawable.ic_launcher).build();
			k++;
			mgr.notify(1, notification);
			startActivity(myIntent);
		}
	}

}

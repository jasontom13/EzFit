package activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import bicepbuddy.Exercise;
import edu.arizona.ezfit.R;
import exercises.Biceps.CableCurl;
import exercises.Biceps.ConcentrationCurl;
import extras.ExerciseAdapter;

public class WorkoutActivity extends Activity{
//	private Profile user;
//	private Workout wo;
//	private List<Exercise> exercises;
//	private List<String> exs;
//	@Override
//	public void onCreate(Bundle savedInstanceState){
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_workout);
//		ListView lv = (ListView) findViewById(R.id.workoutList);
////		exercises = wo.getExercises();
////		int i=1;
////		for (Exercise ex : exercises){
////			exs.add(i+ ".) "+ ex.getName());
////		}
//		exs = new ArrayList<String>();
//		exs.add("YO");
//		exs.add("HELLO");
//		
//		ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow1, exs);
//		lv.setAdapter(listAdapter);
//	}
	

	    private ListView listView1;

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_workout);
	        
	        Exercise exercise_data[] = new Exercise[]
	        {
	        		new CableCurl(),
	        		new ConcentrationCurl()
	        
	
	        };
	        
	        ExerciseAdapter adapter = new ExerciseAdapter(this, 
	                R.layout.listview_item_row, exercise_data);
	        
	        
	        listView1 = (ListView)findViewById(R.id.workoutList);
	         
	        View header = (View)getLayoutInflater().inflate(R.layout.listview_header_row, null);
	        listView1.addHeaderView(header);
	        
	        listView1.setAdapter(adapter);
	    }
	    
	
	
	
}

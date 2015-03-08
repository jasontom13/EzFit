package extras;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bicepbuddy.Exercise;
import edu.arizona.ezfit.R;

public class ExerciseAdapter extends ArrayAdapter<Exercise>{

    Context context; 
    int layoutResourceId;    
    Exercise data[] = null;
    
    public ExerciseAdapter(Context context, int layoutResourceId, Exercise[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ExerciseHolder holder = null;
        
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            
            holder = new ExerciseHolder();
            holder.isDone = (ImageView)row.findViewById(R.id.imgDone);
            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
            
            row.setTag(holder);
        }
        else
        {
            holder = (ExerciseHolder)row.getTag();
        }
        
        Exercise ex = data[position];
        holder.txtTitle.setText(ex.getName());
        if (ex.getDone()==false){
        	//holder.isDone.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_action_important));
        	//Drawable drawable = context.getResources().getDrawable(R.drawable.checkmark);
//        	drawable.setBounds(0, 0, (int)(drawable.getIntrinsicWidth()*0.5), 
//        	                         (int)(drawable.getIntrinsicHeight()*0.5));
//        	ScaleDrawable sd = new ScaleDrawable(drawable, 0, 10, 10);
        	holder.isDone.setImageResource(R.drawable.checkmark);
        	Log.i("YO", "WAAAAAAT");
        }
        else{
        	Drawable drawable = context.getResources().getDrawable(R.drawable.checkmark);
        	drawable.setBounds(0, 0, (int)(drawable.getIntrinsicWidth()*0.5), 
        	                         (int)(drawable.getIntrinsicHeight()*0.5));
        	ScaleDrawable sd = new ScaleDrawable(drawable, 0, 10, 10);
        	holder.isDone.setImageDrawable(sd);
        }
        
        return row;
    }
    
    static class ExerciseHolder
    {
        ImageView isDone;
        TextView txtTitle;
    }
}

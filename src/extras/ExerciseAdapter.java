package extras;

import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bicepbuddy.Exercise;
import edu.arizona.ezfit.R;

public class ExerciseAdapter extends BaseExpandableListAdapter{

    private Context context; 
    private List<Exercise> data;
    private HashMap<String, String> childData;
    
    //int layoutResourceId;    
    //Exercise data[] = null;
    
    public ExerciseAdapter(Context context, List<Exercise> data, HashMap<String, String> childData) {
        this.childData = childData;
        this.context = context;
        this.data = data;
    }

    /*public View getView(int position, View convertView, ViewGroup parent) {
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
        	holder.isDone.setImageResource(R.drawable.ic_action_important);
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
    } */

	@Override
	public int getGroupCount() {
		return data.size();
	}

	@Override
	public int getChildrenCount(int groupPosition) {

		return 1;
	}

	@Override
	public Object getGroup(int groupPosition) {
		return data.get(groupPosition);
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		return childData;//.get(data.get(groupPosition)).get(childPosition);
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		String Exercise = data.get(groupPosition).getName();
		
		if(convertView == null){
			LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = infalInflater.inflate(R.layout.listview_header_row, null);
		}
				
		return null;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		
		
		return null;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return false;
	}
}

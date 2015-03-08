package extras;

import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
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
		return childData.get(data.get(groupPosition).getName());
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
	public View getGroupView(final int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		String exercise = data.get(groupPosition).getName();
		
		if(convertView == null){
			LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = infalInflater.inflate(R.layout.listview_item_row, null);
		}
		ImageView checkmark = (ImageView) convertView.findViewById(R.id.checkmark);
		final ImageView star = (ImageView) convertView.findViewById(R.id.star);
		if (data.get(groupPosition).getLiked()){
			star.setImageResource(R.drawable.star2);
		}
		else{
			star.setImageResource(R.drawable.star);
		}
		if (data.get(groupPosition).getDone()){
			checkmark.setImageResource(R.drawable.checkmark);
		}
		else{
		}
		//star.setId(1);
		star.setOnClickListener(new OnClickListener(){
			private boolean isStar1=true;

			@Override
			public void onClick(View v) {
				v.setActivated(!v.isActivated());
				if(isStar1){
					star.setImageResource(R.drawable.star2);
					isStar1=!isStar1;
					data.get(groupPosition).setLiked(true);
					
				}
				else if (!isStar1){
					isStar1=!isStar1;
					star.setImageResource(R.drawable.star);
					data.get(groupPosition).setLiked(false);
					
				}
				else{
				}
				
			}
			
		});
		
		TextView exerciseList = (TextView) convertView.findViewById(R.id.exerciseName);
		exerciseList.setTypeface(null,Typeface.BOLD);
		exerciseList.setText((groupPosition+1)+". " + exercise);
		
				
		return convertView;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
//		Exercise child = (Exercise) getChild(groupPosition,1);
//		final String childText = (String) child.getDescription();
		final String childText = (String) getChild(groupPosition,1);
		
		if (convertView==null){
			LayoutInflater infl = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView=infl.inflate(R.layout.listview_child_row, null);
		}
		
		//ImageView check = (Image)
		
		TextView desc = (TextView) convertView.findViewById(R.id.childTxt);
		desc.setText(childText);
		
		
		return convertView;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return false;
	}
}

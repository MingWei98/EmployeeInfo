package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16038911 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<InfoItem> infoList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<InfoItem> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource; // info_item.xml
        infoList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View rowView;
        // convertView == null means no cache
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(layout_id, parent, false);
        }
        else{
            rowView = convertView;
        }

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);

        // Get the position of the row using .get(position)
        InfoItem currentItem = infoList.get(position);

        // Use the get___() method defined in InfoItem Class to retrieve the name/date
        String name = currentItem.getName();
        String title = currentItem.getTitle();
        Double salary = currentItem.getSalary();

        // Set the name, title and salary to textView using setText()
        tvName.setText(name);
        tvTitle.setText(title);
        tvSalary.setText(salary + "");

        return convertView;
    }
}

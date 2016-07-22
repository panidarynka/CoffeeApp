package app.coffeeapp.daryna.coffeeapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import app.coffeeapp.daryna.coffeeapp.R;
import app.coffeeapp.daryna.coffeeapp.pojo.Sorts;

/**
 * Created by Daryna on 08.09.2015.
 */
public class ListSortsAdapter extends ArrayAdapter<Sorts> {
    private Context mContext;
    private int mLayoutResourceId;
    private List<Sorts> mSortsList;

    public ListSortsAdapter(Context context, int resource, List<Sorts> sortsList) {
        super(context, resource, sortsList);
        this.mContext = context;
        this.mLayoutResourceId = resource;
        this.mSortsList = sortsList;
    }

    public static class ViewHolder {
        public ImageView ivIcon;
        public TextView tvName;
        public TextView tvDescription;

        public ViewHolder(View view) {
            ivIcon = (ImageView) view.findViewById(R.id.picture);
            tvName = (TextView) view.findViewById(R.id.name);
            tvDescription = (TextView) view.findViewById(R.id.small_description);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(mLayoutResourceId, null, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Sorts sortsList = getItem(position);
        int id = mContext.getResources().getIdentifier(sortsList.getPic_path(), null, null);
        holder.ivIcon.setImageResource(id);
        holder.tvName.setText(sortsList.getName());
        holder.tvDescription.setText(sortsList.getSdesc());

        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Sorts getItem(int position) {
        return mSortsList.get(position);
    }
}

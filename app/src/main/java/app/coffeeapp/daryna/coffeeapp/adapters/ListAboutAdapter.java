package app.coffeeapp.daryna.coffeeapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import app.coffeeapp.daryna.coffeeapp.R;
import app.coffeeapp.daryna.coffeeapp.pojo.About;
import app.coffeeapp.daryna.coffeeapp.utils.Utils;

/**
 * Created by Daryna on 08.09.2015.
 */
public class ListAboutAdapter extends ArrayAdapter<About> {
    private Context mContext;
    private int mLayoutResourceId;
    private List<About> mAbout;

    public ListAboutAdapter(Context context, int resource, List<About> aAbout) {
        super(context, resource, aAbout);
        this.mContext = context;
        this.mLayoutResourceId = resource;
        this.mAbout = aAbout;
    }

    public static class ViewHolder {
        public ImageView ivIcon;
        public TextView tvName;
       // public TextView tvDescription;

        public ViewHolder(View view) {
            ivIcon = (ImageView) view.findViewById(R.id.picture);
            tvName = (TextView) view.findViewById(R.id.name);
           // tvDescription = (TextView) view.findViewById(R.id.small_description);
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
        About aAbout = getItem(position);

        Utils.loadImage(aAbout.getPicture(), holder.ivIcon, parent.getWidth());
        holder.tvName.setText(aAbout.getName());
       // holder.tvDescription.setText(aAbout.getDescription_small());

        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public About getItem(int position) {
        return mAbout.get(position);
    }
}

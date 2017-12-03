package app.coffeeapp.daryna.coffeeguide.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import app.coffeeapp.daryna.coffeeguide.R;
import app.coffeeapp.daryna.coffeeguide.pojo.Recipes;

/**
 * Created by Daryna on 08.09.2015.
 */
public class ListCoffeeAdapter extends ArrayAdapter<Recipes> {
    private Context mContext;
    private int mLayoutResourceId;
    private List<Recipes> mRecipesList;

    public ListCoffeeAdapter(Context context, int resource, List<Recipes> recipesList) {
        super(context, resource, recipesList);
        this.mContext = context;
        this.mLayoutResourceId = resource;
        this.mRecipesList = recipesList;
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
        Recipes recipesList = getItem(position);
        //int id = mContext.getResources().getIdentifier(recipesList.getPic_path(), null, null);
        //holder.ivIcon.setImageResource(id);
        holder.tvName.setText(recipesList.getName());
        holder.tvDescription.setText(recipesList.getSdesc());

        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Recipes getItem(int position) {
        return mRecipesList.get(position);
    }
}

//package app.coffeeapp.daryna.coffeeapp.adapters;
//
//import android.app.Activity;
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.List;
//
//import app.coffeeapp.daryna.coffeeapp.R;
//import app.coffeeapp.daryna.coffeeapp.fragments.FragmentListRecipes;
//import app.coffeeapp.daryna.coffeeapp.pojo.Recipes;
//import app.coffeeapp.daryna.coffeeapp.utils.Utils;
//
///**
// * Created by Daryna on 02.09.2015.
// */
//public class ListCoffeeAdapter extends ArrayAdapter<Recipes> {
//
//    private Context mContext;
//    private int mLayoutResourceId;
//    private List<Recipes> mRecipes;
//
//    public ListCoffeeAdapter(Context context, int resource, List<Recipes> rRecipes) {
//        super(context, resource, rRecipes);
//        this.mContext = context;
//        this.mLayoutResourceId = resource;
//        this.mRecipes = rRecipes;
//    }
//
//    public static class ViewHolder {
//        public ImageView ivIcon;
//        public TextView tvName;
//        public TextView tvDescription;
//
//        public ViewHolder(View view) {
//            ivIcon = (ImageView) view.findViewById(R.id.picture);
//            tvName = (TextView) view.findViewById(R.id.name);
//            tvDescription = (TextView) view.findViewById(R.id.small_description);
//        }
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHolder holder;
//        if (convertView == null) {
//            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
//            convertView = inflater.inflate(mLayoutResourceId, null, false);
//            holder = new ViewHolder(convertView);
//            convertView.setTag(holder);
//        } else {
//            holder = (ViewHolder) convertView.getTag();
//        }
//        Recipes rRecipes = getItem(position);
////        holder.ivIcon.setImageDrawable(mContext.getResources().getDrawable(
////                Utils.getItemResourseId(bTask.getType())));
//            Utils.loadImage(rRecipes.getPicture(),holder.ivIcon, parent.getWidth());
//            holder.tvName.setText(rRecipes.getName());
//            holder.tvDescription.setText(rRecipes.getDescription_small());
////        if (bTask.getType() == 1 || bTask.getType() == 2) {
////            holder.tvAmount.setVisibility(View.VISIBLE);
////            holder.tvAmount.setText("" + bTask.getAmount());
////        } else {
////            holder.tvAmount.setVisibility(View.GONE);
////        }
////        holder.tvStart.setText(Utils.formatTime(bTask.getStartTime()));
////        holder.tvFinish.setText(Utils.formatTime(bTask.getFinishTime()));
////
//        return convertView;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public Recipes getItem(int position) {
//        return mRecipes.get(position);
//    }
//}

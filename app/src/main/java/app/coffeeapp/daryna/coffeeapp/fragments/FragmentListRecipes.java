package app.coffeeapp.daryna.coffeeapp.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import app.coffeeapp.daryna.coffeeapp.R;
import app.coffeeapp.daryna.coffeeapp.activity.RecipesActivity;

/**
 * Created by Daryna on 24.09.2015.
 */
public class FragmentListRecipes extends Fragment implements AdapterView.OnItemClickListener {
    private ListView list_view;

    private OnFragmentInteractionListener mListener;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentlist, null);
        list_view = (ListView) view.findViewById(R.id.listView);
        list_view.setOnItemClickListener(this);
//        ParseQuery<Recipes> query = new ParseQuery<>("Recipes");
//        query.findInBackground(new FindCallback<Recipes>() {
//            @Override
//            public void done(List<Recipes> recipeses, ParseException e) {
//                if (e == null) {
//                    ListCoffeeAdapter adapter = new ListCoffeeAdapter(getActivity(), R.layout.layout_list_item, recipeses);
//                    list_view.setAdapter(adapter);
//                } else {
//                    Log.e("TAG1", e.getMessage(), e);
//                }
//            }
//        });

        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        if (mListener != null) {
//            mListener.onRecipeSelected(((ListCoffeeAdapter) parent.getAdapter()).getItem(position).getObjectId());
//        }
    }

    public interface OnFragmentInteractionListener {
        void onRecipeSelected(String recipeId);
    }
}

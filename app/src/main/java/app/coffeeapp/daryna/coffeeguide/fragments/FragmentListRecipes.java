package app.coffeeapp.daryna.coffeeguide.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import app.coffeeapp.daryna.coffeeguide.DB.DatabaseHelper;
import app.coffeeapp.daryna.coffeeguide.R;
import app.coffeeapp.daryna.coffeeguide.adapters.ListCoffeeAdapter;
import app.coffeeapp.daryna.coffeeguide.pojo.Recipes;

/**
 * Created by Daryna on 24.09.2015.
 */
public class FragmentListRecipes extends Fragment implements AdapterView.OnItemClickListener {
    private ListView list_view;
    private List<Recipes> recipesList = new ArrayList<>();
    private OnFragmentInteractionListener mListener;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentlist, null);
        list_view = (ListView) view.findViewById(R.id.listView);
        list_view.setOnItemClickListener(this);

        DatabaseHelper dbhelper = new DatabaseHelper(getActivity().getApplicationContext());
        SQLiteDatabase db = dbhelper.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM Recipes", null);
        if (cursor != null && cursor.moveToFirst()){
//            Devices devices = new Devices(cursor.getInt(0),cursor.getString(1), cursor.getString(2), cursor.getString(3));
//            cursor.close();
//            db.close();

            while (cursor.isAfterLast() == false) {
//                Recipes recipes = new Recipes(cursor.getString(0),
//                        cursor.getString(1),
//                        cursor.getString(2),
//                        cursor.getString(3));

                //recipesList.add(recipes);
                cursor.moveToNext();
            }
        }
        ListCoffeeAdapter adapter = new ListCoffeeAdapter(getActivity(), R.layout.layout_list_item, recipesList);
        list_view.setAdapter(adapter);
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
//            mListener.onRecipeSelected(((ListCoffeeAdapter) parent.getAdapter()).getItem(position).getName());
//            Log.d("Name", recipesList.get(position).getName());
//        }
//        FragmentDetails details = new FragmentDetails();
//        Bundle bundle = new Bundle();
//        bundle.putString("KEY_DETAIL", recipesList.get(position).getName());
//        bundle.putString("KEY_TABLE", "Recipes");
//        details.setArguments(bundle);
//        FragmentTransaction fTrans = getFragmentManager().beginTransaction();
//        fTrans.replace(R.id.fragment, details);
//        fTrans.addToBackStack(RecipesFragment.class.getSimpleName());
//        fTrans.commit();
        if (mListener != null) {
            mListener.onRecipeSelected(((ListCoffeeAdapter) parent.getAdapter()).getItem(position).getName());
            Log.d("Name", recipesList.get(position).getName());
        }
        RecipesFragment details = new RecipesFragment();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_DETAIL", recipesList.get(position).getName());
        bundle.putString("KEY_TABLE", "Recipes");
        details.setArguments(bundle);
        FragmentTransaction fTrans = getFragmentManager().beginTransaction();
        fTrans.replace(R.id.fragment, details);
        fTrans.addToBackStack(RecipesFragment.class.getSimpleName());
        fTrans.commit();
    }

    public interface OnFragmentInteractionListener {
        void onRecipeSelected(String recipeId);
    }
}

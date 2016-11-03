package app.coffeeapp.daryna.coffeeapp.activity;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.List;

import app.coffeeapp.daryna.coffeeapp.R;
import app.coffeeapp.daryna.coffeeapp.fragments.FragmentDetails;
import app.coffeeapp.daryna.coffeeapp.fragments.FragmentListRecipes;



public class RecipesActivity extends ActionBarActivity implements
        FragmentListRecipes.OnFragmentInteractionListener {
    FragmentDetails fragmentDetails;
    FragmentTransaction fTrans;
    FragmentListRecipes fragmentListRecipes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        fragmentListRecipes = new FragmentListRecipes();
        fTrans = getFragmentManager().beginTransaction();
        fTrans.add(R.id.fragment, fragmentListRecipes);
        fTrans.commit();
    }

    @Override
    public void onRecipeSelected(String recipeId) {
        fragmentDetails = new FragmentDetails();
        fTrans = getFragmentManager().beginTransaction();
        fTrans.replace(R.id.fragment, fragmentDetails);
        fTrans.commit();
    }
}

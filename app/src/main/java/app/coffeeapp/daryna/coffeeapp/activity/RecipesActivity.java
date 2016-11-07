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
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_recipes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onRecipeSelected(String recipeId) {

    }
}

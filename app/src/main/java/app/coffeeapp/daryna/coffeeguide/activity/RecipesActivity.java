package app.coffeeapp.daryna.coffeeguide.activity;

import android.app.FragmentTransaction;
import android.os.Bundle;
//import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;


import app.coffeeapp.daryna.coffeeguide.R;
import app.coffeeapp.daryna.coffeeguide.fragments.FragmentDetails;
import app.coffeeapp.daryna.coffeeguide.fragments.FragmentListRecipes;



public class RecipesActivity extends AppCompatActivity implements
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

    }
}

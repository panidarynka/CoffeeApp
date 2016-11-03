package app.coffeeapp.daryna.coffeeapp.activity;

import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


import java.util.List;

import app.coffeeapp.daryna.coffeeapp.R;
import app.coffeeapp.daryna.coffeeapp.fragments.SortsFragment;


public class SortsActivity extends ActionBarActivity{
    FragmentTransaction fTrans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sopts);
        setContentView(R.layout.activity_devices);
        fTrans = getFragmentManager().beginTransaction();
        fTrans.add(R.id.fragmentd, new SortsFragment());
        //fTrans.addToBackStack(SortsFragment.class.getSimpleName());
        fTrans.commit();
    }
}

package app.coffeeapp.daryna.coffeeguide.activity;

import android.app.FragmentTransaction;
//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import app.coffeeapp.daryna.coffeeguide.R;
import app.coffeeapp.daryna.coffeeguide.fragments.SortsFragment;


public class SortsActivity extends AppCompatActivity {
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

package app.coffeeapp.daryna.coffeeapp.activity;

import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import app.coffeeapp.daryna.coffeeapp.R;
import app.coffeeapp.daryna.coffeeapp.fragments.SupportFragment;


public class SupportActivity extends ActionBarActivity {
public FragmentTransaction fTrans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);
        fTrans = getFragmentManager().beginTransaction();
        fTrans.add(R.id.fragment, new SupportFragment());
        fTrans.commit();
    }
}

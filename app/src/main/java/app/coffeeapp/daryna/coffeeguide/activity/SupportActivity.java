package app.coffeeapp.daryna.coffeeguide.activity;

import android.app.FragmentTransaction;
//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import app.coffeeapp.daryna.coffeeguide.R;
import app.coffeeapp.daryna.coffeeguide.fragments.SupportFragment;


public class SupportActivity extends AppCompatActivity {
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

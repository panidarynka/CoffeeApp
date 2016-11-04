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
import app.coffeeapp.daryna.coffeeapp.fragments.DevicesFragment;
import app.coffeeapp.daryna.coffeeapp.fragments.FragmentListRecipes;


public class DevicesActivity extends ActionBarActivity implements DevicesFragment.OnFragmentInteractionListener{
    public FragmentTransaction fTrans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devices);
        fTrans = getFragmentManager().beginTransaction();
        fTrans.add(R.id.fragmentd, new DevicesFragment());
        //fTrans.addToBackStack(DevicesFragment.class.getSimpleName());
        fTrans.commit();
//        fragmentListRecipes = new FragmentListRecipes();
//        fTrans = getFragmentManager().beginTransaction();
//        fTrans.add(R.id.fragment, fragmentListRecipes);
//        fTrans.commit();
//        ParseQuery<Devices> query = new ParseQuery<>("Devices");
//        query.findInBackground(new FindCallback<Devices>() {
//            @Override
//            public void done(List<Devices> deviceses, ParseException e) {
//                if (e == null) {
//                    ListDevicesAdapter adapter = new ListDevicesAdapter(DevicesActivity.this, R.layout.layout_list_item, deviceses);
//                    list_view.setAdapter(adapter);
//                } else {
//                    Log.e("TAG1", e.getMessage(), e);
//                }
//            }
//        });
    }

    @Override
    public void onDeviceSelected(String recipeId) {

    }
}

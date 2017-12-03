package app.coffeeapp.daryna.coffeeguide.activity;

import android.app.FragmentTransaction;
//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import app.coffeeapp.daryna.coffeeguide.R;
import app.coffeeapp.daryna.coffeeguide.fragments.DevicesFragment;


public class DevicesActivity extends AppCompatActivity implements DevicesFragment.OnFragmentInteractionListener{
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

package app.coffeeapp.daryna.coffeeapp.utils;

import android.support.v7.app.AppCompatActivity;

import app.coffeeapp.daryna.coffeeapp.R;
import app.coffeeapp.daryna.coffeeapp.fragments.AboutFragment;
import app.coffeeapp.daryna.coffeeapp.fragments.CalculetorFragment;
import app.coffeeapp.daryna.coffeeapp.fragments.DevicesFragment;
import app.coffeeapp.daryna.coffeeapp.fragments.FragmentDetails;
import app.coffeeapp.daryna.coffeeapp.fragments.RecipesFragment;
import app.coffeeapp.daryna.coffeeapp.fragments.SortsFragment;
import app.coffeeapp.daryna.coffeeapp.fragments.SupportFragment;


/**
 * Created by dasha on 03.02.16.
 */
public class Navigator {

    private static Navigator mInstance = null;

    private Navigator() {

    }

    public static Navigator getInstance() {
        if (mInstance == null) {
            mInstance = new Navigator();
        }
        return mInstance;
    }
//    public void showAboutFragment(AppCompatActivity activity){
//        activity.getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.main_activity_content_frame, new AboutFragment())
//                .addToBackStack(AboutFragment.class.getSimpleName())
//                .commit();
//    }
//    public void showCalculatorFragment(AppCompatActivity activity){
//        activity.getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.main_activity_content_frame, new CalculetorFragment())
//                .addToBackStack(CalculetorFragment.class.getSimpleName())
//                .commit();
//    }
//    public void showDevicesFragment(AppCompatActivity activity){
//        activity.getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.main_activity_content_frame, new DevicesFragment())
//                .addToBackStack(DevicesFragment.class.getSimpleName())
//                .commit();
//    }
//    public void showRecipesFragment(AppCompatActivity activity){
//        activity.getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.main_activity_content_frame, new RecipesFragment())
//                .addToBackStack(RecipesFragment.class.getSimpleName())
//                .commit();
//    }
//    public void showSortsFragment(AppCompatActivity activity){
//        activity.getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.main_activity_content_frame, new SortsFragment())
//                .addToBackStack(SortsFragment.class.getSimpleName())
//                .commit();
//    }
//    public void showSupportFragment(AppCompatActivity activity){
//        activity.getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.main_activity_content_frame, new SupportFragment())
//                .addToBackStack(SupportFragment.class.getSimpleName())
//                .commit();
//    }
//    public void showDetailsFragment(AppCompatActivity activity){
//        activity.getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.main_activity_content_frame, new FragmentDetails())
//                .addToBackStack(FragmentDetails.class.getSimpleName())
//                .commit();
//    }

}

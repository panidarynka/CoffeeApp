package app.coffeeapp.daryna.coffeeapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import app.coffeeapp.daryna.coffeeapp.pojo.About;
import app.coffeeapp.daryna.coffeeapp.pojo.Devices;
import app.coffeeapp.daryna.coffeeapp.pojo.Recipes;
import app.coffeeapp.daryna.coffeeapp.pojo.Sorts;

/**
 * Created by Daryna on 07.09.2015.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Recipes.class);
        ParseObject.registerSubclass(Devices.class);
        ParseObject.registerSubclass(About.class);
        ParseObject.registerSubclass(Sorts.class);
        Parse.initialize(this, "PWIhrkeh5JVPgdwr7tC3vuqSLiaFcRZlFixd1iC7", "FftsSFyDxhVxdgXvjOSjRa74r6nkbnIxnVZKPSJa");
    }



}

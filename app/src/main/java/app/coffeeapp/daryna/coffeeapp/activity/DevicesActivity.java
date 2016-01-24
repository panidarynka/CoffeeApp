package app.coffeeapp.daryna.coffeeapp.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;

import java.util.List;

import app.coffeeapp.daryna.coffeeapp.R;

import app.coffeeapp.daryna.coffeeapp.adapters.ListDevicesAdapter;
import app.coffeeapp.daryna.coffeeapp.pojo.Devices;


public class DevicesActivity extends ActionBarActivity {

    private ListView list_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devices);
        list_view = (ListView) findViewById(R.id.listView);
        ParseQuery<Devices> query = new ParseQuery<>("Devices");
        query.findInBackground(new FindCallback<Devices>() {
            @Override
            public void done(List<Devices> deviceses, ParseException e) {
                if (e == null) {
                    ListDevicesAdapter adapter = new ListDevicesAdapter(DevicesActivity.this, R.layout.layout_list_item, deviceses);
                    list_view.setAdapter(adapter);
                } else {
                    Log.e("TAG1", e.getMessage(), e);
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_devices, menu);
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
}

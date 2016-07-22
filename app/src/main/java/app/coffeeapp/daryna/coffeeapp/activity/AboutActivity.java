package app.coffeeapp.daryna.coffeeapp.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.List;

import app.coffeeapp.daryna.coffeeapp.R;



public class AboutActivity extends ActionBarActivity {

    private ListView list_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        list_view = (ListView) findViewById(R.id.listView);
//        ParseQuery<About> query = new ParseQuery<>("About");
//        query.findInBackground(new FindCallback<About>() {
//            @Override
//            public void done(List<About> abouts, ParseException e) {
//                if (e == null) {
//                    ListAboutAdapter adapter = new ListAboutAdapter(AboutActivity.this, R.layout.layout_list_item, abouts);
//                    list_view.setAdapter(adapter);
//                } else {
//                    Log.e("TAG1", e.getMessage(), e);
//                }
//            }
//        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about, menu);
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

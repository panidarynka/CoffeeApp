package app.coffeeapp.daryna.coffeeapp.activity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import app.coffeeapp.daryna.coffeeapp.DB.DatabaseHelper;
import app.coffeeapp.daryna.coffeeapp.R;
import app.coffeeapp.daryna.coffeeapp.pojo.About;


public class AboutActivity extends ActionBarActivity {
    private String about;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        textView = (TextView)findViewById(R.id.description);
        DatabaseHelper databaseHelper = new DatabaseHelper(getApplicationContext());
        SQLiteDatabase db = databaseHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM About", null);
        if (cursor!=null && cursor.moveToFirst()){
            about = cursor.getString(1);
        }
        textView.setText(about);

    }
}

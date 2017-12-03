package app.coffeeapp.daryna.coffeeguide.activity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import app.coffeeapp.daryna.coffeeguide.DB.DatabaseHelper;
import app.coffeeapp.daryna.coffeeguide.R;


public class AboutActivity extends AppCompatActivity {
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

package app.coffeeapp.daryna.coffeeapp.fragments;

import android.app.Fragment;
import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import app.coffeeapp.daryna.coffeeapp.DB.DatabaseHelper;
import app.coffeeapp.daryna.coffeeapp.R;
import app.coffeeapp.daryna.coffeeapp.pojo.Devices;
import app.coffeeapp.daryna.coffeeapp.pojo.Recipes;

/**
 * Created by Daryna on 21.09.2015.
 */
public class RecipesFragment extends Fragment {
    TextView name, desc;
    ImageView picture;
    String detail, table;
    Recipes recipes;
    ArrayList<String> elements;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recipes, null);
        name = (TextView)view.findViewById(R.id.name);
        desc = (TextView)view.findViewById(R.id.description);
        picture = (ImageView)view.findViewById(R.id.picture);
        Bundle bundle = getArguments();
        Log.d("bundle", bundle.getString("KEY_TABLE", "no table"));
        if(bundle != null) {
            detail = bundle.getString("KEY_DETAIL", "no argument pass");
            table = bundle.getString("KEY_TABLE", "no table");
            Log.d("table", table);
            name.setText(detail);
        }
        DatabaseHelper dbhelper = new DatabaseHelper(getActivity().getApplicationContext());
        SQLiteDatabase db = dbhelper.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM " +table+ " WHERE name='" + detail + "'", null);
        if (cursor != null && cursor.moveToFirst()){
            recipes = new Recipes(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(4), cursor.getInt(3));
            desc.setText(recipes.getDesc());
            // int id = getResources().getIdentifier(devices.getPic_path(), null, null);
            //picture.setImageResource(id);
        }
        Cursor cursor1 = db.rawQuery("SELECT * FROM Recipes WHERE id_recipes="+recipes.getId()+"'", null);
        if(cursor1!=null&& cursor.moveToFirst()){



            //elements.add()
        }
        return view;

    }

}

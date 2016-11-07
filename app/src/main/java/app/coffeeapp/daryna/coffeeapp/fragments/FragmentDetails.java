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

import app.coffeeapp.daryna.coffeeapp.DB.DatabaseHelper;
import app.coffeeapp.daryna.coffeeapp.R;
import app.coffeeapp.daryna.coffeeapp.pojo.Devices;

/**
 * Created by Daryna on 21.09.2015.
 */
public class FragmentDetails extends Fragment {
    TextView name, desc;
    ImageView picture;
    String detail, table;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentdetails, null);
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
                    Devices devices = new Devices(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3));
                    desc.setText(devices.getDesc());
                    int id = getResources().getIdentifier(devices.getPic_path(), null, null);
                    picture.setImageResource(id);
        }

        return view;

    }

}

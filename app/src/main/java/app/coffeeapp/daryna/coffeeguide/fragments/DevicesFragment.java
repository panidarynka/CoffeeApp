package app.coffeeapp.daryna.coffeeguide.fragments;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import app.coffeeapp.daryna.coffeeguide.DB.DatabaseHelper;
import app.coffeeapp.daryna.coffeeguide.R;
import app.coffeeapp.daryna.coffeeguide.adapters.ListDevicesAdapter;
import app.coffeeapp.daryna.coffeeguide.pojo.Devices;

/**
 * Created by dasha on 03.02.16.
 */
public class DevicesFragment extends Fragment implements AdapterView.OnItemClickListener {
    private ListView list_view;
    private List<Devices> devicesList = new ArrayList<>();
    private OnFragmentInteractionListener mListener;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentlist, null);
        list_view = (ListView) view.findViewById(R.id.listView);
        list_view.setOnItemClickListener(this);
        DatabaseHelper dbhelper = new DatabaseHelper(getActivity().getApplicationContext());
        SQLiteDatabase db = dbhelper.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM Devices", null);
        if (cursor != null && cursor.moveToFirst()){
//            Devices devices = new Devices(cursor.getInt(0),cursor.getString(1), cursor.getString(2), cursor.getString(3));
//            cursor.close();
//            db.close();

            while (cursor.isAfterLast() == false) {
                Devices devices = new Devices(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3));

                devicesList.add(devices);
                cursor.moveToNext();
            }
        }
        ListDevicesAdapter adapter = new ListDevicesAdapter(getActivity(), R.layout.layout_list_item, devicesList);
        list_view.setAdapter(adapter);

        return view;
    }



//        return null;
//    }
//        ParseQuery<Recipes> query = new ParseQuery<>("Recipes");
//        query.findInBackground(new FindCallback<Recipes>() {
//            @Override
//            public void done(List<Recipes> recipeses, ParseException e) {
//                if (e == null) {
//                    ListCoffeeAdapter adapter = new ListCoffeeAdapter(getActivity(), R.layout.layout_list_item, recipeses);
//                    list_view.setAdapter(adapter);
//                } else {
//                    Log.e("TAG1", e.getMessage(), e);
//                }
//            }
//        });

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (mListener != null) {
            mListener.onDeviceSelected(((ListDevicesAdapter) parent.getAdapter()).getItem(position).getName());
            Log.d("Name", devicesList.get(position).getName());
        }
        FragmentDetails details = new FragmentDetails();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_DETAIL", devicesList.get(position).getName());
        bundle.putString("KEY_TABLE", "Devices");
        details.setArguments(bundle);
        FragmentTransaction fTrans = getFragmentManager().beginTransaction();
        fTrans.replace(R.id.fragmentd, details);
        fTrans.addToBackStack(DevicesFragment.class.getSimpleName());
        fTrans.commit();
    }

    public interface OnFragmentInteractionListener {
        void onDeviceSelected(String recipeId);
    }
}
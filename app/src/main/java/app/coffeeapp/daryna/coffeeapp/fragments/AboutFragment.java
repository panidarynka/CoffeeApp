//package app.coffeeapp.daryna.coffeeapp.fragments;
//
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ListView;
//
//import java.util.List;
//
//import app.coffeeapp.daryna.coffeeapp.R;
//
///**
// * Created by dasha on 03.02.16.
// */
//public class AboutFragment extends Fragment {
//    private ListView list_view;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.about_fragment, container, false);
//        list_view = (ListView) view.findViewById(R.id.listView);
////        ParseQuery<About> query = new ParseQuery<>("About");
////        query.findInBackground(new FindCallback<About>() {
////            @Override
////            public void done(List<About> abouts, ParseException e) {
////                if (e == null) {
////                    ListAboutAdapter adapter = new ListAboutAdapter(getActivity(), R.layout.layout_list_item, abouts);
////                    list_view.setAdapter(adapter);
////                } else {
////                    Log.e("TAG1", e.getMessage(), e);
////                }
////            }
////        });
//        return view;
//    }
//}

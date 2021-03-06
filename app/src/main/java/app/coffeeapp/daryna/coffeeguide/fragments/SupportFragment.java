package app.coffeeapp.daryna.coffeeguide.fragments;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import app.coffeeapp.daryna.coffeeguide.R;

/**
 * Created by dasha on 03.02.16.
 */
public class SupportFragment extends Fragment {
    TextView tv1,tv2,tv3;
    Typeface myTypeface;
    ImageView bug, feedback, like;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_support, null);
        myTypeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Frenchpress.otf");

        tv1 = (TextView)view.findViewById(R.id.textView1);
        tv2 = (TextView)view.findViewById(R.id.textView2);
        tv3 = (TextView)view.findViewById(R.id.textView3);
        bug = (ImageView)view.findViewById(R.id.bug);
        feedback = (ImageView)view.findViewById(R.id.feedback);
        like = (ImageView)view.findViewById(R.id.star);

        tv1.setTypeface(myTypeface);
        tv2.setTypeface(myTypeface);
        tv3.setTypeface(myTypeface);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.bug:
                        Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
                        intent.setType("text/plain");
                        intent.putExtra(Intent.EXTRA_SUBJECT, "Report bug from CoffeeApplication");
                        //intent.putExtra(Intent.EXTRA_TEXT, "Body of email");
                        intent.setData(Uri.parse("mailto:panidarynka@gmail.com")); // or just "mailto:" for blank
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
                        startActivity(intent);
                        break;
//                        Toast.makeText(getActivity().getApplicationContext(), "button was pressed", Toast.LENGTH_SHORT).show();
                    case R.id.feedback:
                        Toast.makeText(getActivity().getApplicationContext(), "feedback was pressed", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.star:
                        Toast.makeText(getActivity().getApplicationContext(), "star was pressed", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        };

        bug.setOnClickListener(onClickListener);
        feedback.setOnClickListener(onClickListener);
        like.setOnClickListener(onClickListener);

        return view;
    }
}

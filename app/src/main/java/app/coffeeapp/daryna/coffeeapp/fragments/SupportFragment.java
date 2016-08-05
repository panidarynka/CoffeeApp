package app.coffeeapp.daryna.coffeeapp.fragments;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import app.coffeeapp.daryna.coffeeapp.R;

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
        like = (ImageView)view.findViewById(R.id.like);

        tv1.setTypeface(myTypeface);
        tv2.setTypeface(myTypeface);
        tv3.setTypeface(myTypeface);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.bug:
                        Intent emailIntent = new Intent(Intent.ACTION_SEND);
                        emailIntent.setData(Uri.parse("mailto:"));
                        emailIntent.setType("message/rfc822");
                        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { "panidarynka@gmail.com" });
                        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Report bug in Coffee App");
                        try {
                            startActivity(Intent.createChooser(emailIntent, "Choose an email client from..."));
                        } catch (android.content.ActivityNotFoundException ex) {
                            Toast.makeText(getActivity().getApplicationContext(), "No email client installed.",
                                    Toast.LENGTH_LONG).show();
                        }


                        Toast.makeText(getActivity().getApplicationContext(), "button was pressed", Toast.LENGTH_SHORT).show();
                    case R.id.feedback:
                        Toast.makeText(getActivity().getApplicationContext(), "feedback was pressed", Toast.LENGTH_SHORT).show();
                }

            }
        };

        bug.setOnClickListener(onClickListener);
        feedback.setOnClickListener(onClickListener);
        like.setOnClickListener(onClickListener);

        return view;
    }
}

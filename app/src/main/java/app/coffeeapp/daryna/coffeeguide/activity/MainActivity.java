package app.coffeeapp.daryna.coffeeguide.activity;

import android.content.Intent;
import android.graphics.Typeface;
//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import app.coffeeapp.daryna.coffeeguide.DB.DatabaseHelper;
import app.coffeeapp.daryna.coffeeguide.R;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Toolbar mToolbar;
 ;
    ImageView calc, devices, sopts, about, support, recipes;
    Typeface myTypeface;
    TextView tv, tv1, tv2, tv3, tv4, tv5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
        }
        initViews();
        setupViews();
        DatabaseHelper dbhelper = new DatabaseHelper(getApplicationContext());
            dbhelper.openDataBase();
        /*ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#A13A22")));*/
    }

    private void initViews() {
        recipes = (ImageView) findViewById(R.id.recipes_button);
        calc = (ImageView) findViewById(R.id.calculator_button);
        devices = (ImageView) findViewById(R.id.types_of_devices_button);
        sopts = (ImageView) findViewById(R.id.sort_button);
        about = (ImageView) findViewById(R.id.about_button);
        support = (ImageView) findViewById(R.id.support_button);
        myTypeface = Typeface.createFromAsset(getAssets(), "fonts/Frenchpress.otf");

        tv = (TextView) findViewById(R.id.textView);
        tv1 = (TextView) findViewById(R.id.textView2);
        tv2 = (TextView) findViewById(R.id.textView3);
        tv3 = (TextView) findViewById(R.id.textView4);
        tv4 = (TextView) findViewById(R.id.textView5);
        tv5 = (TextView) findViewById(R.id.textView6);

    }

    private void setupViews() {
        recipes.setOnClickListener(this);
        calc.setOnClickListener(this);
        devices.setOnClickListener(this);
        sopts.setOnClickListener(this);
        about.setOnClickListener(this);
        support.setOnClickListener(this);

        tv.setTypeface(myTypeface);
        tv1.setTypeface(myTypeface);
        tv2.setTypeface(myTypeface);
        tv3.setTypeface(myTypeface);
        tv4.setTypeface(myTypeface);
        tv5.setTypeface(myTypeface);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.about_button:
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
                break;
            case R.id.calculator_button:
                startActivity(new Intent(MainActivity.this, CalculatorActivity.class));
                break;
            case R.id.types_of_devices_button:
                startActivity(new Intent(MainActivity.this, DevicesActivity.class));
                break;
            case R.id.recipes_button:
                startActivity(new Intent(MainActivity.this, RecipesActivity.class));
                break;
            case R.id.sort_button:
                startActivity(new Intent(MainActivity.this, SortsActivity.class));
                break;
            case R.id.support_button:
                startActivity(new Intent(MainActivity.this, SupportActivity.class));
                break;
        }
    }
}

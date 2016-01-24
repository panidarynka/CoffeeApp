package app.coffeeapp.daryna.coffeeapp.utils;

import android.widget.ImageView;

import com.androidquery.AQuery;

import java.io.File;

import app.coffeeapp.daryna.coffeeapp.R;

/**
 * Created by Daryna on 07.09.2015.
 */
public class Utils {

    public static void loadImage(String url, ImageView imageView, int width) {
        AQuery aq = new AQuery(imageView);
        if (url != null && url.length() > 0) {
            File file = aq.getCachedFile(url);
            if (file != null) {
                aq.id(imageView).image(file, width);
            } else {
                aq.id(imageView).image(url, false, true, width, 0);
            }
        } else {
            aq.id(imageView).image(R.mipmap.ic_launcher);
        }
    }

}

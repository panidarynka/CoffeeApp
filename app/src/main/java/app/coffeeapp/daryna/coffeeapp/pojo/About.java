package app.coffeeapp.daryna.coffeeapp.pojo;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by Daryna on 23.08.2015.
 */
@ParseClassName("About")
public class About extends ParseObject {

    public String getPicture() {
        return getString("picture_url");
    }

    public void setPicture(String picture_about) {
        put("picture_about", picture_about);
    }

    public String getName() {
        return getString("name_about");
    }

    public void setName(String name_about) {
        put("name_about", name_about);
    }

    public String getDescription() {
        return getString("description_about");
    }

    public void setDescription(String description_about) {
        put("description_about", description_about);
    }
}


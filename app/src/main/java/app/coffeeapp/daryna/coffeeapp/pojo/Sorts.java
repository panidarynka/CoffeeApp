package app.coffeeapp.daryna.coffeeapp.pojo;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by Daryna on 23.08.2015.
 */
@ParseClassName("Sorts")
public class Sorts extends ParseObject {

    public String getPicture() {
        return getString("picture_url");
    }

    public void setPicture_sorts(String picture_sorts) {
        put("picture_sorts", picture_sorts);
    }

    public String getName() {
        return getString("name_sopts");
    }

    public void setName_sorts(String name_sorts) {
        put("name_sopts", name_sorts);
    }

    public String getDescription_small_sorts() {
        return getString("description_small_sopts");
    }

    public void setDescription_small_sorts(String description_small_sorts) {
        put("description_small_sorts", description_small_sorts);
    }

    public String getDescription() {
        return getString("description_sorts");
    }

    public void setDescription_sorts(String description_sorts) {
        put("description_sorts", description_sorts);
    }
}

package app.coffeeapp.daryna.coffeeapp.pojo;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by Daryna on 23.08.2015.
 */
@ParseClassName("Devices")
public class Devices extends ParseObject {

    public String getPicture() {
        return getString("picture_string");
    }

    public void setPicture(String picture_devices) {
        put("picture_devices", picture_devices);
    }

    public String getName() {
        return getString("name_devices");
    }

    public void setName(String name_devices) {
        put("name_devices", name_devices);
    }

    public String getDescription_small() {
        return getString("description_small_devices");
    }

    public void setDescription_small(String description_small_devices) {
        put("description_small_devices", description_small_devices);
    }

    public String getDescription() {
        return getString("description_devices");
    }

    public void setDescription(String description_devices) {
        put("description_devices", description_devices);
    }
}

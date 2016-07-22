package app.coffeeapp.daryna.coffeeapp.pojo;

/**
// * Created by Daryna on 23.08.2015.
 */

public class About{
    public int _id;
    public String name = "";
    public String desc = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


//
//    public String getPicture() {
//        return getString("picture_url");
//    }
//
//    public void setPicture(String picture_about) {
//        put("picture_about", picture_about);
//    }
//
//    public String getName() {
//        return getString("name_about");
//    }
//
//    public void setName(String name_about) {
//        put("name_about", name_about);
//    }
//
//    public String getDescription() {
//        return getString("description_about");
//    }
//
//    public void setDescription(String description_about) {
//        put("description_about", description_about);
//    }
}


package app.coffeeapp.daryna.coffeeapp.pojo;

/**
// * Created by Daryna on 23.08.2015.
 */

public class Sorts {
   // public int _id;
    public String name = "";
    public String sdesc ="";
    public String desc = "";
    public String pic_path = "";

    public Sorts(String name, String sdesc, String desc, String pic_path) {
        //this._id=_id;
        this.name=name;
        this.sdesc=sdesc;
        this.desc=desc;
        this.pic_path=pic_path;
    }
//
//    public int get_id() {
//        return _id;
//    }
//
//    public void set_id(int _id) {
//        this._id = _id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdesc() {
        return sdesc;
    }

    public void setSdesc(String sdesc) {
        this.sdesc = sdesc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPic_path() {
        return pic_path;
    }

    public void setPic_path(String pic_path) {
        this.pic_path = pic_path;
    }
//
//    public String getPicture() {
//        return getString("picture_url");
//    }
//
//    public void setPicture_sorts(String picture_sorts) {
//        put("picture_sorts", picture_sorts);
//    }
//
//    public String getName() {
//        return getString("name_sopts");
//    }
//
//    public void setName_sorts(String name_sorts) {
//        put("name_sopts", name_sorts);
//    }
//
//    public String getDescription_small_sorts() {
//        return getString("description_small_sopts");
//    }
//
//    public void setDescription_small_sorts(String description_small_sorts) {
//        put("description_small_sorts", description_small_sorts);
//    }
//
//    public String getDescription() {
//        return getString("description_sorts");
//    }
//
//    public void setDescription_sorts(String description_sorts) {
//        put("description_sorts", description_sorts);
//    }
}

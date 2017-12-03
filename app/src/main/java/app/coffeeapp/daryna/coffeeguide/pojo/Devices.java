package app.coffeeapp.daryna.coffeeguide.pojo;

/**
// * Created by Daryna on 23.08.2015.
 */

public class Devices  {
    public int _id;
    public String name = "";
    public String sdesc ="";
    public String desc = "";



    public String  pic_path = "";

    public Devices(String name, String sdesc, String desc, String pic_path) {
        //this._id=_id;
        this.name=name;
        this.sdesc=sdesc;
        this.desc=desc;
        this.pic_path=pic_path;
    }

    public Devices (){

    }
    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

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

}

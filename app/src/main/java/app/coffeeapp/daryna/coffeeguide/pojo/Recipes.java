package app.coffeeapp.daryna.coffeeguide.pojo;

/**
 // * Created by Daryna on 23.08.2015.
 */

public class Recipes  {
    public int id;
    public String name = "";
    public String sdesc ="";
    public String desc = "";



    public String  pic_path = "";

    public Recipes(String name, String sdesc, String desc, String pic_path, int id) {
        this.id=id;
        this.name=name;
        this.sdesc=sdesc;
        this.desc=desc;
        this.pic_path=pic_path;
    }

    public Recipes (){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

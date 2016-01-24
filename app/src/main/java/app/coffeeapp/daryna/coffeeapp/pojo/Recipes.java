package app.coffeeapp.daryna.coffeeapp.pojo;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by Daryna on 23.08.2015.
 */
@ParseClassName("Recipes")
public class Recipes extends ParseObject {

    public String getPicture() {
        return getString("picture_url");
    }

    public void setPicture_recipes(String picture_recipes) {
        put("picture_url", picture_recipes);
    }

    public String getName() {
        return getString("name_coffee");
    }

    public void setName_recipes(String name_recipes) {
        put("name_coffee", name_recipes);
    }

    public String getDescription_small() {
        return getString("description_small_recipes");
    }

    public void setDescription_small_recipes(String description_small_recipes) {
        put("description_small_recipes", description_small_recipes);
    }

    public String getElements() {
        return getString("elements_recipes");
    }

    public void setElements_recipes(String elements_recipes) {
        put("elements_recipes", elements_recipes);
    }

    public String getSteps_todo() {
        return getString("steps_todo_recipes");
    }

    public void setSteps_todo_recipes(String steps_todo_recipes) {
        put("steps_todo_recipes", steps_todo_recipes);
    }
}

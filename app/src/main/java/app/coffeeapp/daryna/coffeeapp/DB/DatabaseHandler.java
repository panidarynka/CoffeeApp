package app.coffeeapp.daryna.coffeeapp.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Daryna on 22.08.2015.
 */
public class DatabaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "coffee";

    private static final String TABLE_RECIPES = "recipes";
    private static final String TABLE_DEVICES = "devices";
    private static final String TABLE_SORTS = "sorts";
    private static final String TABLE_ABOUT = "about";


    private static final String ID_RECIPES = "id";
    private static final String PICTURE_RECIPES = "picture_coffee";
    private static final String NAME_RECIPES = "name_coffee";
    private static final String DESCRIPTION_SMALL_RECIPES = "decryption";
    private static final String ELEMENTS_RECIPES = "elements";
    private static final String STEPS_TODO_RECIPES = "steps";

    private static final String ID_DEVICES = "id";
    private static final String PICTURE_DEVICES = "picture_coffee";
    private static final String NAME_DEVICES = "name_coffee";
    private static final String DESCRIPTION_SMALL_DEVICES = "decryption";
    private static final String DESCRIPTION_DEVICES = "steps";

    private static final String ID_SORTS = "id";
    private static final String PICTURE_SORTS = "picture_coffee";
    private static final String NAME_SORTS = "name_coffee";
    private static final String DESCRIPTION_SMALL_SORTS = "decryption";
    private static final String DESCRIPTION_SORTS = "steps";

    private static final String ID_ABOUT = "id";
    private static final String PICTURE_ABOUT = "picture_coffee";
    private static final String NAME_ABOUT = "name_coffee";
    private static final String DESCRIPTION_ABOUT = "decryption";

    public DatabaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    private static final String CREATE_TABLE_RECIPES = "CREATE TABLE"+ TABLE_RECIPES + "(" + ID_RECIPES + "INTEGER PRIMARY KEY,"
            + PICTURE_RECIPES + "TEXT," + NAME_RECIPES + "TEXT," + DESCRIPTION_SMALL_RECIPES + "TEXT," +ELEMENTS_RECIPES+ "TEXT," + STEPS_TODO_RECIPES + "TEXT," + ")";

    private static final String CREATE_TABLE_DEVICES = "CREATE TABLE"+ TABLE_DEVICES + "(" + ID_DEVICES + "INTEGER PRIMARY KEY,"
            + PICTURE_DEVICES + "TEXT," + NAME_DEVICES + "TEXT," + DESCRIPTION_SMALL_DEVICES + "TEXT," + DESCRIPTION_DEVICES + "TEXT," + ")";

    private static final String CREATE_TABLE_SORTS = "CREATE TABLE"+ TABLE_SORTS + "(" + ID_SORTS + "INTEGER PRIMARY KEY,"
            + PICTURE_SORTS + "TEXT," + NAME_SORTS + "TEXT," + DESCRIPTION_SMALL_SORTS + "TEXT," + DESCRIPTION_SORTS + "TEXT," + ")";

    private static final String CREATE_TABLE_ABOUT = "CREATE TABLE"+ TABLE_ABOUT + "(" + ID_ABOUT + "INTEGER PRIMARY KEY,"
            + PICTURE_ABOUT + "TEXT," + NAME_ABOUT + "TEXT," + DESCRIPTION_ABOUT + "TEXT," + ")";

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_RECIPES);
        db.execSQL(CREATE_TABLE_DEVICES);
        db.execSQL(CREATE_TABLE_SORTS);
        db.execSQL(CREATE_TABLE_ABOUT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

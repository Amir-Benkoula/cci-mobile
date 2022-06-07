package com.example.ecole2.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseOpenHelper extends SQLiteOpenHelper {

    public final static String TABLE_NAME = "favoris";
    public final static String FORMATION_NAME = "formation_name";
    public final static String _ID = "_id";
    public final static String[] columns = { _ID, FORMATION_NAME };

    final private static String CREATE_CMD =

            "CREATE TABLE favoris (" + _ID
                    + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + FORMATION_NAME + " TEXT NOT NULL)";

    final private static String NAME = "favoris_db";
    final private static Integer VERSION = 1;
    final private Context mContext;

    public DatabaseOpenHelper(Context context) {
        super(context, NAME, null, VERSION);
        this.mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_CMD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // N/A
    }

    public void deleteDatabase() {
        mContext.deleteDatabase(NAME);
    }
}

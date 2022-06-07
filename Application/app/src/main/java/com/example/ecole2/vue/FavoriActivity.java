package com.example.ecole2.vue;

import android.app.ListActivity;
import com.example.ecole2.R;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;


import com.example.ecole2.controleur.ControleurFavoris;
import com.example.ecole2.controleur.ControleurFormation;
import com.example.ecole2.entite.Formation;
import com.example.ecole2.model.DatabaseOpenHelper;

import java.util.List;


public class FavoriActivity extends ListActivity{
    private static String TAG = "FavoriActivity";
    private DatabaseOpenHelper mDbHelper;
    private SimpleCursorAdapter mAdapter;
    private ControleurFormation controleurFormation;
    private List<Formation> formations;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favori);
        Log.i(TAG, "onCreate");
        // Create a new DatabaseHelper
        mDbHelper = new DatabaseOpenHelper(this);
        controleurFormation = ControleurFormation.getInstance();

        // Create a cursor
        Cursor c = readFormations();
        mAdapter = new SimpleCursorAdapter(this, R.layout.list_layout, c,
                DatabaseOpenHelper.columns, new int[] { R.id._id, R.id.name },
                0);

        setListAdapter(mAdapter);

        Button clearButton = (Button) findViewById(R.id.clear_button);
        clearButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            // execute database operations
            clearAll();

            // Redisplay data
            mAdapter.getCursor();
            mAdapter.notifyDataSetChanged();
        }
        });

        // Requête avec rawQuery
        Cursor cursor = mDbHelper.getReadableDatabase().rawQuery("SELECT * FROM favoris", null);
        if (cursor != null) {
            //acronymeFavoriList = new ArrayList<>();
            // move cursor to first row
            if (cursor.moveToFirst()) {
                do {
                    // Get version from Cursor
                    try {
                        int n = cursor.getColumnIndex(mDbHelper._ID);
                        Long id = cursor.getLong(n);
                        //Log.i(TAG, "acronyme=" + accronymeStr);
                        n = cursor.getColumnIndex(mDbHelper.FORMATION_NAME);
                        String formation = cursor.getString(n);
                        Log.i(TAG, "rawQuery - id=" + id + " formation=" + formation);
                        //acronymeFavoriList.add(accronymeStr);
                        //noteFormationList.add(new NoteFormation(id, accronymeStr, note, date));
                    } catch (SQLException e) {
                        Log.i(TAG, "Erreur lecture formations");
                        //Toast.makeText(getApplicationContext(), "Error creating the database", Toast.LENGTH_LONG).show();
                    }

                } while (cursor.moveToNext());

            }
        }
        // Fin requête rawQuery

        //
        cursor = mDbHelper.getReadableDatabase().query(DatabaseOpenHelper.TABLE_NAME,
                DatabaseOpenHelper.columns, null, new String[]{}, null, null, null);
        if (cursor != null) {
            //acronymeFavoriList = new ArrayList<>();
            // move cursor to first row
            if (cursor.moveToFirst()) {
                do {
                    // Get version from Cursor
                    try {
                        int n = cursor.getColumnIndex(mDbHelper._ID);
                        Long id = cursor.getLong(n);
                        //Log.i(TAG, "acronyme=" + accronymeStr);
                        n = cursor.getColumnIndex(mDbHelper.FORMATION_NAME);
                        String formation = cursor.getString(n);
                        Log.i(TAG, "query - id=" + id + " formation=" + formation);
                        //acronymeFavoriList.add(accronymeStr);
                        //noteFormationList.add(new NoteFormation(id, accronymeStr, note, date));
                    } catch (SQLException e) {
                        Log.i(TAG, "Erreur lecture formations");
                        Toast.makeText(getApplicationContext(), "Error creating the database", Toast.LENGTH_LONG).show();
                    }

                } while (cursor.moveToNext());

            }
            cursor.close();
        }
    }

    private Cursor readFormations() {
        return mDbHelper.getReadableDatabase().query(DatabaseOpenHelper.TABLE_NAME,
                DatabaseOpenHelper.columns, null, new String[] {}, null, null,
                null);
    }

    // Delete all records
    private void clearAll() {
        mDbHelper.getWritableDatabase().delete(DatabaseOpenHelper.TABLE_NAME, null, null);
    }

    // Close database
   /** @Override
    protected void onDestroy() {

        mDbHelper.getWritableDatabase().close();
        mDbHelper.deleteDatabase();

        super.onDestroy();

    }
   **/
}
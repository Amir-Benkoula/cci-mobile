package com.example.ecole2.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class RacineActivity extends AppCompatActivity {
    private static String TAG = "RacineActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        menu.add(0, 1, Menu.NONE, "Accueil");
        menu.add(0, 2, Menu.NONE, "Les formations");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        Log.i(TAG, "onOptionsItemSelected - itemId=" + itemId);
        if(itemId == 1){
            Log.i(TAG, "Accueil");
            Intent intent = new Intent(RacineActivity.this, AccueilActivity.class);
            startActivity(intent);
        }
        else if(itemId == 2) {
            Log.i(TAG, "Les formations");
        }
        return true;
    }
}
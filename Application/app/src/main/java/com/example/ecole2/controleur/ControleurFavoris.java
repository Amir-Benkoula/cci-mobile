package com.example.ecole2.controleur;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Log;

import com.example.ecole2.entite.Formation;
import com.example.ecole2.model.DatabaseOpenHelper;
import com.example.ecole2.model.RequeteAsynchrone;

import java.util.ArrayList;
import java.util.List;

public class ControleurFavoris {
    private static String TAG = "ControleurFavoris";
    private static ControleurFavoris instance = null ;
    private List<Formation> formations = new ArrayList<>();
    private Formation formation = null;


    private ControleurFavoris(){
        super();
    }

    public static ControleurFavoris getInstance(){
        if(instance == null){
            instance = new ControleurFavoris();
            Log.i(TAG, "constructeur");
        }
        return ControleurFavoris.instance;
    }

    public List<Formation> getFavoris() {
        return formations;
    }

    public void setFavoris(List<Formation> formations) {
        Log.i(TAG, "setFormations");
        this.formations = formations;
    }

    public Formation getFavori() { return formation; }

    public void setFavori(Formation formation) { this.formation = formation; }

    public void addFavori(DatabaseOpenHelper mDbHelper, Formation formation) {

    }
}

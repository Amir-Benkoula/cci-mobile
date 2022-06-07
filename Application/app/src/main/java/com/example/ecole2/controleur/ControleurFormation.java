package com.example.ecole2.controleur;

import android.util.Log;


import com.example.ecole2.entite.Formation;
import com.example.ecole2.model.RequeteAsynchrone;

import java.util.ArrayList;
import java.util.List;

public class ControleurFormation {
    private static String TAG = "ControleurFormation";
    private static ControleurFormation instance = null ;
    private List<Formation> formations = new ArrayList<>();
    private Formation formation = null;
    private static RequeteAsynchrone requeteAsynchrone;

    private ControleurFormation(){
        super();
    }

    public static ControleurFormation getInstance(){
        if(instance == null){
            instance = new ControleurFormation();
            requeteAsynchrone = RequeteAsynchrone.getInstance();
            Log.i(TAG, "constructeur");
        }
        return ControleurFormation.instance;
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        Log.i(TAG, "setFormations");
        this.formations = formations;
    }

    public Formation getFormation() { return formation; }

    public void setFormation(Formation formation) { this.formation = formation; }
}

package com.example.ecole2.controleur;

import android.util.Log;


import com.example.ecole2.entite.Etudiant;
import com.example.ecole2.entite.Formation;
import com.example.ecole2.entite.Message;
import com.example.ecole2.model.RequeteAsynchrone;

import java.util.ArrayList;
import java.util.List;

public class ControleEtudiant {
    private static String TAG = "ControleEtudiant";
    private static ControleEtudiant instance = null ;
    private List<Etudiant> etudiants = new ArrayList<>();
    private Etudiant etudiant = null;
    private static RequeteAsynchrone requeteAsynchrone;

    private ControleEtudiant(){
        super();
    }

    public static ControleEtudiant getInstance(){
        if(instance == null){
            instance = new ControleEtudiant();
            requeteAsynchrone = RequeteAsynchrone.getInstance();
            Log.i(TAG, "constructeur");
        }
        return ControleEtudiant.instance;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        Log.i(TAG, "setEtudiants");
        this.etudiants = etudiants;
    }

}

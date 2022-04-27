package com.example.ecole2.model;

import android.util.Log;

import com.example.ecole2.controleur.ControleEtudiant;
import com.example.ecole2.entite.Etudiant;
import com.example.ecole2.entite.Formation;
import com.example.ecole2.entite.Message;
import com.example.ecole2.model.rest.ServiceRest;
import com.example.ecole2.model.rest.ServiceRestItf;

import java.util.List;

public class RequeteAsynchrone implements IResponseRestCallback {
    private static String TAG = "RequeteAsynchrone";
    private ControleEtudiant controleEtudiant;
    private ServiceRestItf serviceRest;
    private static RequeteAsynchrone instance;

    public static RequeteAsynchrone getInstance(){
        if(instance == null){
            instance = new RequeteAsynchrone();
        }
        return instance;
    }
    private RequeteAsynchrone(){
        controleEtudiant = ControleEtudiant.getInstance();
        serviceRest = ServiceRest.getInstance();
        serviceRest.lireEtudiants(this);
        Log.i(TAG,"constructeur");
    }

    @Override
    public void responseRestCallback(Object reponse, int identifiantRequete) {
        if(identifiantRequete == 1){
            Log.i(TAG,"réponse etudiants");
            List<Etudiant> etudiants = (List<Etudiant>) reponse;
            Log.i(TAG,"réponse etudiants=" + etudiants);
            controleEtudiant.setEtudiants(etudiants);
        }
    }
}

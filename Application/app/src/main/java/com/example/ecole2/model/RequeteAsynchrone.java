package com.example.ecole2.model;

import android.util.Log;

import com.example.ecole2.controleur.ControleurFormation;
import com.example.ecole2.entite.Formation;
import com.example.ecole2.entite.Message;
import com.example.ecole2.model.rest.ServiceRest;
import com.example.ecole2.model.rest.ServiceRestItf;

import java.util.List;

public class RequeteAsynchrone implements IResponseRestCallback {
    private static String TAG = "RequeteAsynchrone";
    private ControleurFormation controleurFormation;
    private ServiceRestItf serviceRest;
    private static RequeteAsynchrone instance;

    public static RequeteAsynchrone getInstance(){
        if(instance == null){
            instance = new RequeteAsynchrone();
        }
        return instance;
    }
    private RequeteAsynchrone(){
        controleurFormation = ControleurFormation.getInstance();
        serviceRest = ServiceRest.getInstance();
        serviceRest.lireFormations(this);
        Log.i(TAG,"constructeur");
    }

    @Override
    public void RequeteAsynchroneMessage(Message message){
        serviceRest = ServiceRest.getInstance();
        serviceRest.postMessage(message, this);
        Log.i(TAG, "requete message");
    }

    @Override
    public void responseRestCallback(Object reponse, int identifiantRequete) {
        if(identifiantRequete == 1){
            Log.i(TAG,"réponse formations");
            List<Formation> formations = (List<Formation>) reponse;
            Log.i(TAG,"réponse formations=" + formations);
            controleurFormation.setFormations(formations);
        } else if (identifiantRequete == 2){
            Log.i(TAG, "reponse message");
        }
    }
}

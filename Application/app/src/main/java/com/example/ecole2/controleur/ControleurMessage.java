package com.example.ecole2.controleur;

import android.util.Log;
import android.widget.Toast;

import com.example.ecole2.entite.Message;
import com.example.ecole2.model.RequeteAsynchrone;
import com.example.ecole2.util.VerificationMessage;
import com.example.ecole2.vue.MessageActivity;


public class ControleurMessage {
    private static String TAG = "ControleurFormation";
    private static ControleurMessage instance = null ;
    private static VerificationMessage verificationMessage;
    private Message messageObj = null;
    private static RequeteAsynchrone requeteAsynchrone;

    public static ControleurMessage getInstance(){
        if(instance == null){
            verificationMessage = new VerificationMessage();
            instance = new ControleurMessage();
            requeteAsynchrone = RequeteAsynchrone.getInstance();
            Log.i(TAG, "constructeur");
        }
        return ControleurMessage.instance;
    }

    public void postMessage(String email, String message, String nom, String prenom, MessageActivity messageActivity) {
        Log.i(TAG, "Controleur Message");
        Toast toast;
        boolean isEmail = verificationMessage.isEmailValid(email);
        boolean isNomPrenom = verificationMessage.isNomPrenomValid(nom, prenom);
        if(!isEmail && !isNomPrenom){
            toast = Toast.makeText(messageActivity,"Email et nom ou prenom non valides", Toast.LENGTH_SHORT);
            toast.show();
        } else if(!isEmail && isNomPrenom){
            toast = Toast.makeText(messageActivity,"Email non valide", Toast.LENGTH_SHORT);
            toast.show();
        } else if(isEmail && !isNomPrenom){
            toast = Toast.makeText(messageActivity,"Nom ou prenom non valides", Toast.LENGTH_SHORT);
            toast.show();
        } else if(isEmail && isNomPrenom){
            messageObj = new Message(email, message, nom, prenom);
            requeteAsynchrone.RequeteAsynchroneMessage(messageObj);
        }
    }
}

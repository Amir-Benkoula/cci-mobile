package com.example.ecole2.util;

import android.widget.Toast;

import com.example.ecole2.vue.MessageActivity;

public class VerificationMessage {
    private boolean isValid;
    Toast toast;

    public VerificationMessage(){}

    public boolean isEmailValid(String email){
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    public boolean isNomPrenomValid(String nom, String prenom){
        return nom.matches("^[A-Za-z\\é\\è\\ê\\ë\\ï\\-]+$") && prenom.matches("^[A-Za-z\\é\\è\\ê\\ë\\ï\\-]+$");
    }
}

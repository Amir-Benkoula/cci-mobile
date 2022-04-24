package com.example.ecole2.model.rest;

import com.example.ecole2.entite.Formation;
import com.example.ecole2.entite.Message;
import com.example.ecole2.model.IResponseRestCallback;

public interface ServiceRestItf {
    void lireEtudiants(IResponseRestCallback objetReponse);
}

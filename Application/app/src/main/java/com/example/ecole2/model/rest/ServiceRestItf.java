package com.example.ecole2.model.rest;

import com.example.ecole2.entite.Message;
import com.example.ecole2.model.IResponseRestCallback;
import com.example.ecole2.vue.MessageActivity;

public interface ServiceRestItf {
    void lireFormations(IResponseRestCallback objetReponse);
    void postMessage(Message messageObj, IResponseRestCallback objetReponse);
}

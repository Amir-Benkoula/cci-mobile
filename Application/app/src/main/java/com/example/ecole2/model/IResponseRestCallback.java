package com.example.ecole2.model;

import com.example.ecole2.entite.Message;

public interface IResponseRestCallback {
    void responseRestCallback(Object reponse, int identifiantRequete);
    void RequeteAsynchroneMessage(Message message);
}

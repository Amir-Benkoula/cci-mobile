package com.example.ecole2.model.rest;

import com.example.ecole2.entite.Formation;
import com.example.ecole2.entite.Message;

import java.util.List;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

public interface IServiceRest {
    // émulateur android studio
    //public static final String ENDPOINT = "http://82.65.254.14:8089/ecole";
    public static final String ENDPOINT = "http://10.0.2.2:8089/ecole";
    // émulateur genymotion
    //public static final String ENDPOINT = "http://10.0.2.2:8089/5EtudiantPromotion1vuePresentationRestWs/rest";
    @GET("/formation")
    public void getFormations(Callback<List<Formation>> formatons);
    @POST("/message")
    public void postMessage(@Body Message message, Callback<Void> callback);
}
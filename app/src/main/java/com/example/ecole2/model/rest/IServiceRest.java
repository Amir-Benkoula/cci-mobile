package com.example.ecole2.model.rest;

import com.example.ecole2.entite.Etudiant;
import com.example.ecole2.entite.Formation;
import com.example.ecole2.entite.Message;

import java.util.List;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

public interface IServiceRest {
    // émulateur android studio
    public static final String ENDPOINT = "http://10.0.2.2:90/ecole";
    // émulateur genymotion
    //public static final String ENDPOINT = "http://10.0.2.2:90/5EtudiantPromotion1vuePresentationRestWs/rest";
    @GET("/etudiant")
    public void getEtudiants(Callback<List<Etudiant>> etudiants);

}
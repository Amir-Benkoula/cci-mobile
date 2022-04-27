package com.example.ecole2.model.rest;

import android.util.Log;
import com.example.ecole2.entite.Etudiant;
import com.example.ecole2.model.IResponseRestCallback;
import java.util.List;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.android.AndroidLog;
import retrofit.client.Response;

public class ServiceRest implements ServiceRestItf {
    private static final String TAG = "ServiceRest";
    private static IServiceRest serviceRest;
    private static IResponseRestCallback reponse;
    private static ServiceRest instance;

    public static ServiceRest getInstance(){
        if(instance == null){
            instance = new ServiceRest();
        }
        return instance;
    }
    private ServiceRest(){
        Log.i(TAG, "========= initServiceRest ========");

        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint(IServiceRest.ENDPOINT)
                .setLog(new AndroidLog("retrofit"))
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();

        serviceRest = adapter.create(IServiceRest.class);
    }
    @Override
    public void lireEtudiants(IResponseRestCallback objetReponse){
        ServiceRest.reponse = objetReponse;
        serviceRest.getEtudiants(new Callback<List<Etudiant>>() {
            @Override
            public void success(List<Etudiant> etudiants, Response response) {
                Log.i(TAG, "========= lireEtudiants etudiants = "+ etudiants);
                reponse.responseRestCallback(etudiants, 1);
            }
            @Override
            public void failure(RetrofitError error) {
                Log.i(TAG, "========= lireEtudiants ERROR ======= error="+error);
            }
        });
    }
}

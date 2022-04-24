package com.example.ecole2.model.rest;

import android.util.Log;

import com.example.ecole2.entite.Formation;
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
    public void lireFormations(IResponseRestCallback objetReponse){
        ServiceRest.reponse = objetReponse;
        serviceRest.getFormations(new Callback<List<Formation>>() {
            @Override
            public void success(List<Formation> formations, Response response) {
                Log.i(TAG, "========= lireFormations formations = "+ formations);
                reponse.responseRestCallback(formations, 1);
            }
            @Override
            public void failure(RetrofitError error) {
                Log.i(TAG, "========= lireFormations ERROR ======= error="+error);
            }
        });
    }
}

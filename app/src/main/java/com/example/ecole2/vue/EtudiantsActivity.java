package com.example.ecole2.vue;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ecole2.R;
import com.example.ecole2.controleur.ControleEtudiant;
import com.example.ecole2.entite.Etudiant;
import com.example.ecole2.entite.Formation;

import java.util.List;

public class EtudiantsActivity extends RacineActivity implements AdapterView.OnItemClickListener {

    private static String TAG = "EtudiantsActivity";
    private ControleEtudiant controleEtudiant;
    private List<Etudiant> etudiants;
    private ListView liste;
    private EtudiantAdapter adapterEtudiant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etudiants);
        Log.i(TAG, "onCreate");
        controleEtudiant = ControleEtudiant.getInstance();
        creerListeEtudiants();
    }

    private void creerListeEtudiants(){
        etudiants = controleEtudiant.getEtudiants();
        Log.i(TAG, "creerListeEtudiants etudiants=" + etudiants);
        adapterEtudiant = new EtudiantAdapter(this, etudiants);
        liste = (ListView)findViewById(R.id.listView);
        liste.setAdapter(adapterEtudiant);
        liste.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i(TAG,"onItemClick = " + position);
        Log.i(TAG,"etudiants = " + etudiants.get(position));
    }
}
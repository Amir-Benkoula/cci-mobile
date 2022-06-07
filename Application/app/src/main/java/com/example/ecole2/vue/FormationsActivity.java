package com.example.ecole2.vue;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ecole2.R;
import com.example.ecole2.controleur.ControleurFormation;
import com.example.ecole2.entite.Formation;

import java.util.List;

public class FormationsActivity extends RacineActivity implements AdapterView.OnItemClickListener{
    private static String TAG = "FormationActivity";
    private ControleurFormation controleurFormation;
    private List<Formation> formations;
    private ListView liste;
    private FormationsAdapter adapterFormation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formations);
        Log.i(TAG, "onCreate");
        controleurFormation = ControleurFormation.getInstance();
        creerListeFormations();
    }

    private void creerListeFormations(){
        formations = controleurFormation.getFormations();
        Log.i(TAG, "creerListeFormations formations=" + formations);
        adapterFormation = new FormationsAdapter(this, formations);
        liste = (ListView)findViewById(R.id.listView);
        liste.setAdapter(adapterFormation);
        liste.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i(TAG,"onItemClick = " + position);
        controleurFormation.setFormation(formations.get(position));
        Intent intent = new Intent(FormationsActivity.this, FormationActivity.class);
        startActivity(intent);
        Log.i(TAG,"formations = " + formations.get(position));
    }
}

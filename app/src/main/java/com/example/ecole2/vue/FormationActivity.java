package com.example.ecole2.vue;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ecole2.R;
import com.example.ecole2.controleur.ControleurFormation;
import com.example.ecole2.entite.Formation;
import com.example.ecole2.model.rest.ServiceRest;
import com.example.ecole2.model.rest.ServiceRestItf;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class FormationActivity extends RacineActivity {
    TextView textIntitule;
    TextView textDateDebut;
    TextView textDuree;
    ImageView imageView;
    TextView textDescription;
    ControleurFormation controleurFormation;
    Formation formation;

    private static String TAG = "FormationActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        controleurFormation = ControleurFormation.getInstance();
        formation = controleurFormation.getFormation();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formation);
        Log.i(TAG, "onCreate");

        textIntitule = (TextView) findViewById(R.id.detailFormationIntitule);
        textIntitule.setText(formation.getIntitule());
        textDateDebut = (TextView) findViewById(R.id.detailFormationDateDebut);
        textDateDebut.setText("Début: " + formation.getDateDebut());
        textDuree = (TextView) findViewById(R.id.detailFormationDuree);
        textDuree.setText("Durée: " + formation.getDureeMois() + " mois");
        textDescription = (TextView) findViewById(R.id.formationDescription);
        textDescription.setText(formation.getDescription());

        imageView = (ImageView) findViewById(R.id.formationImgId);
        loadImageView(imageView,"https://i.imgur.com/"+ formation.getAdresseImage() +".jpg");

        Button btnVideo=(Button)findViewById(R.id.formationBoutonVideoId);
        btnVideo.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.i(TAG,"Bouton video");
                Intent intent = new Intent(FormationActivity.this, VideoActivity.class);
                intent.putExtra("urlVideo", formation.getVideoUrl());
                startActivity(intent);
            }
        });
    }

    public void enventListenerLink(View view) {
        Log.i(TAG, "enventListenerLink");
        formation = controleurFormation.getFormation();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(formation.getLink()));
        startActivity(browserIntent);
    }

    public void loadImageView (ImageView img, String url) {
        //start a background thread for networking
        Log.i("loadImageView",url);
        new Thread(new Runnable() {
            public void run(){
                try {
                    //download the drawable
                    final Drawable drawable = Drawable.createFromStream((InputStream) new URL(url).getContent(), "src");
                    //edit the view in the UI thread
                    img.post(new Runnable() {
                        public void run() {
                            img.setImageDrawable(drawable);
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
package com.example.ecole2.vue;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.example.ecole2.R;
import com.example.ecole2.controleur.ControleurFormation;


public class AccueilActivity extends RacineActivity {
    private static String TAG = "AccueilActivity";
    private ImageView imageView;
    private ControleurFormation controleurFormation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        controleurFormation = ControleurFormation.getInstance();
        Log.i(TAG, "onCreate");
        Button btnVideo=(Button)findViewById(R.id.boutonVideoId);
        btnVideo.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.i(TAG,"Bouton video");
                Intent intent = new Intent(AccueilActivity.this, VideoActivity.class);
                intent.putExtra("urlVideo", "tt0DFNMJEzI");
                startActivity(intent);
            }
        });
    }
    public void enventListenerLink(View view) {
        Log.i(TAG,"myMethod");
        Log.i(TAG,"Bouton link");
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cci.fr/"));
        startActivity(browserIntent);
    }
}
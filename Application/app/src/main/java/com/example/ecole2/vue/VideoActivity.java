package com.example.ecole2.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.ecole2.R;
import com.example.ecole2.util.Constante;

public class VideoActivity extends AppCompatActivity {
    private static String TAG = "VideoActivity";
    WebView wvVideo;
    private String urlVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        urlVideo =  getIntent().getStringExtra("urlVideo");
        Log.i(TAG,"urlVideo="+urlVideo);
        init(urlVideo);
    }

    private void init(String urlVideo){
        if(urlVideo!=null) {
            wvVideo = findViewById(R.id.wvVideo);
            wvVideo.getSettings().setJavaScriptEnabled(true);
            wvVideo.setWebViewClient(new WebViewClient());
            wvVideo.loadUrl(Constante.urlVideoBase + urlVideo);
        }
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
        wvVideo.destroy();
    }

}
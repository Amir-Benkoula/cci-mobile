package com.example.ecole2.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.ecole2.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ImageActivity extends RacineActivity {
    private static String TAG = "ImageActivity";
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        imageView = (ImageView) findViewById(R.id.imgId);
        loadImageView(imageView,"https://i.imgur.com/qKurKAT.jpg");
        Log.i(TAG, "onCreate");
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
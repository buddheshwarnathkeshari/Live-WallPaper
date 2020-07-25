package com.buddheshwar.livewallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import co.gofynd.gravityview.GravityView;

public class Image360 extends AppCompatActivity {

    ImageView img;
    GravityView gravityView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image360);

        img=findViewById(R.id.bg);
       // img.setImageResource(R.drawable.img);



        gravityView = GravityView.getInstance(getBaseContext());


        if(gravityView.deviceSupported()){

            this.gravityView.setImage(img,R.drawable.img).center();

        }
        else{
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.img);
            img.setImageBitmap(bitmap);
        }

    }


    @Override
    protected void onResume() {
        super.onResume();
        gravityView.registerListener();
    }
    @Override
    protected void onStop() {
        super.onStop();
        gravityView.unRegisterListener();
    }
}
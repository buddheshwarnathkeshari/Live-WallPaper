package com.buddheshwar.livewallpaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String[] images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images=new String[]{"https://images.pexels.com/photos/207353/pexels-photo-207353.jpeg?cs=srgb&dl=fire-wallpaper-207353.jpg&fm=jpg",
        "https://images.pexels.com/photos/1002714/pexels-photo-1002714.jpeg?cs=srgb&dl=stock-photography-of-bonfire-1002714.jpg&fm=jpg",
                "https://images.pexels.com/photos/216635/pexels-photo-216635.jpeg?cs=srgb&dl=blaze-blazing-bonfire-burning-216635.jpg&fm=jpg",
                "https://images.pexels.com/photos/266388/pexels-photo-266388.jpeg?cs=srgb&dl=ash-blaze-bonfire-burn-266388.jpg&fm=jpg",
                "https://images.pexels.com/photos/1910236/pexels-photo-1910236.jpeg?cs=srgb&dl=red-pink-and-blue-wallpaper-1910236.jpg&fm=jpg",
                "https://images.pexels.com/photos/216635/pexels-photo-216635.jpeg?cs=srgb&dl=blaze-blazing-bonfire-burning-216635.jpg&fm=jpg",
                "https://images.pexels.com/photos/266388/pexels-photo-266388.jpeg?cs=srgb&dl=ash-blaze-bonfire-burn-266388.jpg&fm=jpg",
                "https://images.pexels.com/photos/1910236/pexels-photo-1910236.jpeg?cs=srgb&dl=red-pink-and-blue-wallpaper-1910236.jpg&fm=jpg",
                "https://images.pexels.com/photos/216635/pexels-photo-216635.jpeg?cs=srgb&dl=blaze-blazing-bonfire-burning-216635.jpg&fm=jpg",
                "https://images.pexels.com/photos/266388/pexels-photo-266388.jpeg?cs=srgb&dl=ash-blaze-bonfire-burn-266388.jpg&fm=jpg",
                "https://images.pexels.com/photos/1910236/pexels-photo-1910236.jpeg?cs=srgb&dl=red-pink-and-blue-wallpaper-1910236.jpg&fm=jpg",
                "https://images.pexels.com/photos/216635/pexels-photo-216635.jpeg?cs=srgb&dl=blaze-blazing-bonfire-burning-216635.jpg&fm=jpg",
                "https://images.pexels.com/photos/266388/pexels-photo-266388.jpeg?cs=srgb&dl=ash-blaze-bonfire-burn-266388.jpg&fm=jpg",
                "https://images.pexels.com/photos/1910236/pexels-photo-1910236.jpeg?cs=srgb&dl=red-pink-and-blue-wallpaper-1910236.jpg&fm=jpg",
        "https://images.pexels.com/photos/2157884/pexels-photo-2157884.jpeg?cs=srgb&dl=artwork-2157884.jpg&fm=jpg",
        "https://images.pexels.com/photos/3610275/pexels-photo-3610275.jpeg?cs=srgb&dl=modern-art-3610275.jpg&fm=jpg",
        "https://images.pexels.com/photos/3560728/pexels-photo-3560728.jpeg?cs=srgb&dl=abstract-painting-3560728.jpg&fm=jpg"};

        RecyclerView recyclerView=findViewById(R.id.rv);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2,RecyclerView.VERTICAL,false));

        recyclerView.setAdapter(new MyAdapter(images,getApplicationContext()));




    }
}
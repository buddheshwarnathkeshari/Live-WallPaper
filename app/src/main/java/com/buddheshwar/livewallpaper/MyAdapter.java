package com.buddheshwar.livewallpaper;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.io.IOException;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String[] images;
    Context context;

    public MyAdapter(String[] images, Context context) {
        this.images = images;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View v=inflater.inflate(R.layout.image_list_item,parent,false);
        return  new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        Glide.with(context).load(images[position]).placeholder(context.getResources().getDrawable(R.drawable.ic_launcher_background)).centerCrop().into(holder.img);

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Bitmap bitmap = ((BitmapDrawable)holder.img.getDrawable()).getBitmap();
                WallpaperManager manager =  WallpaperManager.getInstance(context);
                try {
                    manager.setBitmap(bitmap);
                    Toast.makeText(context, "Set Wallpaper Successfully ", Toast.LENGTH_SHORT).show();
                }
                catch (IOException e)
                {
                    Toast.makeText(context, "Wallpaper not load yet!", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder  {

        ImageView img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);

        }


    }
}

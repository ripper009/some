package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.recyclerview.Adapter.RVAdapter;
import com.example.recyclerview.App.Playlist_1;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;
    private RVAdapter rvAdapter;
    private ArrayList<String> imagesName = new ArrayList<>();
    private ArrayList<String> imagesURL = new ArrayList<>();
private final String imUR="V4OgA4O,yB3d2qH,9jMbaX2,rYndmdq,sypYnSP,HBeK1ot,YCqbt8r,eLk31XX,4ZHp7FO,XzffKgy,DJabk5C";
private final String imName="Playlist 1,Playlist 2,Playlist 3,Playlist 4,Playlist 5,Playlist 6,Playlist 7,Playlist 8,Playlist 9,Playlist 10,Playlist 11";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitMaps();
        initRecyclerView();




    }

    public void initImageBitMaps()
    {

imagesURL.addAll(Arrays.asList(imUR.split(",")));
        imagesName.addAll(Arrays.asList(imName.split(",")));
    }

    public void initRecyclerView()
    {
        recyclerView = findViewById(R.id.rvContainer);
        rvAdapter = new RVAdapter(this, imagesName, imagesURL);
        recyclerView.setAdapter(rvAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }





}
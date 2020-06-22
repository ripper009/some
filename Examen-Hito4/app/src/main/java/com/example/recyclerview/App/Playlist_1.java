package com.example.recyclerview.App;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.recyclerview.Adapter.RVAdapter2;
import com.example.recyclerview.R;

import java.util.ArrayList;
import java.util.Arrays;

public class Playlist_1 extends AppCompatActivity {
    private RecyclerView recyclerView2;
    private RVAdapter2 rvAdapter2;
    private ArrayList<String> imagesName1 = new ArrayList<>();
    private ArrayList<String> imagesURL1 = new ArrayList<>();
    private ArrayList<String> imagesURL2 = new ArrayList<>();
    private ArrayList<String> imagesURL3 = new ArrayList<>();
    private final String imUR1="59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq";
    private final String imUR2="2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ";
    private final String imUR3="LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe";
    private final String imName1="Music 1,Music 2,Music 3,Music 4,Music 5,Music 6,Music 7,Music 8,Music 9,Music 10,Music 11";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist_1);
        initImageBitMaps();
        initRecyclerView();
    }
    public void initImageBitMaps()
    {

        imagesURL1.addAll(Arrays.asList(imUR1.split(",")));
        imagesURL2.addAll(Arrays.asList(imUR2.split(",")));
        imagesURL3.addAll(Arrays.asList(imUR3.split(",")));
        imagesName1.addAll(Arrays.asList(imName1.split(",")));
    }

    public void initRecyclerView()
    {
        recyclerView2 = findViewById(R.id.rvContainer2);
        rvAdapter2 = new RVAdapter2(this, imagesName1, imagesURL1,imagesURL2,imagesURL3);
        recyclerView2.setAdapter(rvAdapter2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
    }


}

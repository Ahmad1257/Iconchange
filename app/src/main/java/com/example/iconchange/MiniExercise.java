package com.example.iconchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;

import com.example.iconchange.Adapter.MiniExercise_Adapter;

import java.util.ArrayList;
import java.util.List;

public class MiniExercise extends AppCompatActivity
{
    GridView grid;

    RecyclerView recyclerView;
    MiniExercise_Adapter adapter;
    List<MiniExe_Model> models;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_exercise);

        recyclerView = findViewById(R.id.miniexe_rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        adapter = new MiniExercise_Adapter(this);

        models = new ArrayList<>();

        models.add(new MiniExe_Model(R.drawable.miniex1, "Chapter#1"));
        models.add(new MiniExe_Model(R.drawable.miniex2, "Chapter#2"));
        models.add(new MiniExe_Model(R.drawable.miniex3, "Chapter#3"));
        models.add(new MiniExe_Model(R.drawable.miniex4, "Chapter#4"));
        models.add(new MiniExe_Model(R.drawable.miniex5, "Chapter#5"));
        models.add(new MiniExe_Model(R.drawable.miniex6, "Chapter#6"));
        models.add(new MiniExe_Model(R.drawable.miniex7, "Chapter#7"));
        models.add(new MiniExe_Model(R.drawable.miniex8, "Chapter#8"));
        models.add(new MiniExe_Model(R.drawable.miniex9, "Chapter#9"));

        adapter.setMiniExe_Model(models);
        recyclerView.setAdapter(adapter);
    }
}

package com.example.iconchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;

import com.example.iconchange.Adapter.Numberical_Adapter;

import java.util.ArrayList;
import java.util.List;

public class ExerciseNumericals extends AppCompatActivity
{
    GridView grid;

    RecyclerView recyclerView;
    Numberical_Adapter adapter;
    List<Numberical> models;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_numericals);

        recyclerView = findViewById(R.id.num_rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        adapter = new Numberical_Adapter(this);

        models = new ArrayList<>();

        models.add(new Numberical(R.drawable.grid1, "Chapter#1"));
        models.add(new Numberical(R.drawable.grid2, "Chapter#2"));
        models.add(new Numberical(R.drawable.grid3, "Chapter#3"));
        models.add(new Numberical(R.drawable.grid4, "Chapter#4"));
        models.add(new Numberical(R.drawable.grid5, "Chapter#5"));
        models.add(new Numberical(R.drawable.grid6, "Chapter#6"));
        models.add(new Numberical(R.drawable.grid7, "Chapter#7"));
        models.add(new Numberical(R.drawable.grid8, "Chapter#8"));
        models.add(new Numberical(R.drawable.grid9, "Chapter#9"));

        adapter.setNumbericals(models);
        recyclerView.setAdapter(adapter);


    }
}



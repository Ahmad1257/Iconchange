package com.example.iconchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;

import com.example.iconchange.Adapter.LongQuestions_Adapter;

import java.util.ArrayList;
import java.util.List;

public class LongQuestions extends AppCompatActivity
{
    GridView grid;

    RecyclerView recyclerView;
    LongQuestions_Adapter adapter;
    List<LongQues_Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_questions);

        recyclerView = findViewById(R.id.longques_rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        adapter = new LongQuestions_Adapter(this);

        models = new ArrayList<>();
//some changes
        models.add(new LongQues_Model(R.drawable.longques1, "Chapter#1"));
        models.add(new LongQues_Model(R.drawable.longques2, "Chapter#2"));
        models.add(new LongQues_Model(R.drawable.longques3, "Chapter#3"));
        models.add(new LongQues_Model(R.drawable.longques4, "Chapter#4"));
        models.add(new LongQues_Model(R.drawable.longques5, "Chapter#5"));
        models.add(new LongQues_Model(R.drawable.longques6, "Chapter#6"));
        models.add(new LongQues_Model(R.drawable.longques7, "Chapter#7"));
        models.add(new LongQues_Model(R.drawable.longques8, "Chapter#8"));
        models.add(new LongQues_Model(R.drawable.longques9, "Chapter#9"));

        adapter.setLongQues_Model(models);
        recyclerView.setAdapter(adapter);

    }
}

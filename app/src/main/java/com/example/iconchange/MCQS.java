package com.example.iconchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import com.example.iconchange.Adapter.MCQs_Adapter;

import java.util.ArrayList;
import java.util.List;

public class MCQS extends AppCompatActivity
{
    ListView lv;

    RecyclerView recyclerView;
    MCQs_Adapter adapter;
    List<MCQS_Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcqs);

        recyclerView = findViewById(R.id.mcqs_rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MCQs_Adapter(this);
        models = new ArrayList<>();


        models.add(new MCQS_Model(R.drawable.mcq1, "Chapter No 1","Physical Quantities and Measurement"));
        models.add(new MCQS_Model(R.drawable.mcq2, "Chapter No 2","Kinematics"));
        models.add(new MCQS_Model(R.drawable.mcq3, "Chapter No 3","Dynamics"));
        models.add(new MCQS_Model(R.drawable.mcq4, "Chapter No 4","Turning Effect Of Forces"));
        models.add(new MCQS_Model(R.drawable.mcq5, "Chapter No 5","Gravitation"));
        models.add(new MCQS_Model(R.drawable.mcq6, "Chapter No 6","Work and Energy"));
        models.add(new MCQS_Model(R.drawable.mcq7, "Chapter No 7","Properties Of Matter"));
        models.add(new MCQS_Model(R.drawable.mcq8, "Chapter No 8","Thermal Properties Of Matter"));
        models.add(new MCQS_Model(R.drawable.mcq9, "Chapter No 9","Transfer Of Heat"));

        adapter.setMCQS_Model(models);
        recyclerView.setAdapter(adapter);
    }
}

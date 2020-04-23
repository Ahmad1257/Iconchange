package com.example.iconchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.iconchange.Adapter.Home_Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    private RecyclerView recyclerView;
    private Home_Adapter adapter;
    private List<Home_Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        models.add(new Home_Model(R.drawable.home1, "Text Book"));
        models.add(new Home_Model(R.drawable.home2, "Exercise Numericals"));
        models.add(new Home_Model(R.drawable.home3, "Short Questions"));
        models.add(new Home_Model(R.drawable.home4, "Long Questions"));
        models.add(new Home_Model(R.drawable.home5, "MCQ'S"));
        models.add(new Home_Model(R.drawable.home6, "Mini Exercise"));
        models.add(new Home_Model(R.drawable.home7, "Test Yourself"));

        adapter = new Home_Adapter(this, models);

        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new Home_Adapter.HomeListener()
        {
            @Override
            public void setPos(int pos)
            {
                if (pos == 0)
                {
                    Toast.makeText(MainActivity.this, "You Clicked Text Book", Toast.LENGTH_SHORT).show();
                    openTextBookChapters();
                }
                else if(pos == 1)
                {
                    Toast.makeText(MainActivity.this, "You Clicked Exercise Numericals", Toast.LENGTH_SHORT).show();
                    openExerciseNumericals();
                }
                else if(pos == 2)
                {
                    Toast.makeText(MainActivity.this, "You Clicked Short Questions", Toast.LENGTH_SHORT).show();
                    openShortQuestions();
                }
                else if(pos == 3)
                {
                    Toast.makeText(MainActivity.this, "You Clicked Long Questions", Toast.LENGTH_SHORT).show();
                    openLongQuestions();
                }
                else if(pos == 4)
                {
                    Toast.makeText(MainActivity.this, "You Clicked MCQS", Toast.LENGTH_SHORT).show();
                    openMCQS();
                }
                else if(pos == 5)
                {
                    Toast.makeText(MainActivity.this, "You Clicked Mini Exercise", Toast.LENGTH_SHORT).show();
                    openMiniExercise();
                }
                else if(pos == 6)
                {
                    Toast.makeText(MainActivity.this, "You Clicked Test Yourself", Toast.LENGTH_SHORT).show();
                    openTestYourself();
                }


         }   });


    }

    private void init()
    {

        recyclerView = findViewById(R.id.home_rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        models = new ArrayList<>();

    }

    public void openTextBookChapters() {
        Intent intent = new Intent(this, TextBookChapters.class);
        startActivity(intent);
    }

    public void openExerciseNumericals()
    {
        Intent intent = new Intent(MainActivity.this, ExerciseNumericals.class);
        startActivity(intent);
    }
    public void openShortQuestions()
    {
        Intent intent = new Intent(MainActivity.this,ShortQuestions.class);
        startActivity(intent);
    }
    public void openLongQuestions()
    {
        Intent intent = new Intent(MainActivity.this,LongQuestions.class);
        startActivity(intent);
    }
    public void openMCQS()
    {
        Intent intent = new Intent(MainActivity.this,MCQS.class);
        startActivity(intent);
    }
    public void openMiniExercise()
    {
        Intent intent = new Intent(MainActivity.this,MiniExercise.class);
        startActivity(intent);
    }
    public void openTestYourself()
    {
        Intent intent = new Intent(MainActivity.this,TestYourself.class);
        startActivity(intent);
    }
}

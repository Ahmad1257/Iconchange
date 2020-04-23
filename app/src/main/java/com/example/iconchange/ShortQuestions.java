package com.example.iconchange;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.iconchange.Adapter.ShortQuestions_Adapter;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class ShortQuestions extends AppCompatActivity {
    ListView lv;

    RecyclerView recyclerView;
    ShortQuestions_Adapter adapter;
    List<ShortQues_Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_questions);

        recyclerView = findViewById(R.id.shortques_rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ShortQuestions_Adapter(this);

        models = new ArrayList<>();

        models.add(new ShortQues_Model(R.drawable.home6, "Chapter No 1","Physical Quantities and Measurement"));
        models.add(new ShortQues_Model(R.drawable.shortques1, "Chapter No 2","Kinematics"));
        models.add(new ShortQues_Model(R.drawable.home4, "Chapter No 3","Dynamics"));
        models.add(new ShortQues_Model(R.drawable.shortques3, "Chapter No 4","Turning Effect Of Forces"));
        models.add(new ShortQues_Model(R.drawable.shortques2, "Chapter No 5","Gravitation"));
        models.add(new ShortQues_Model(R.drawable.shortques4, "Chapter No 6","Work and Energy"));
        models.add(new ShortQues_Model(R.drawable.shortques5, "Chapter No 7","Properties Of Matter"));
        models.add(new ShortQues_Model(R.drawable.shortques7, "Chapter No 8","Thermal Properties Of Matter"));
        models.add(new ShortQues_Model(R.drawable.shortques6, "Chapter No 9","Transfer Of Heat"));

        adapter.setShortQues_Model(models);
        recyclerView.setAdapter(adapter);
    }
}

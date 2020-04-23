package com.example.iconchange;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class TextBookChapters extends AppCompatActivity
{
    private ListView lv;
    private String titles[] = {"Chapter No 1", "Chapter No 2", "Chapter No 3", "Chapter No 4","Chapter No 5","Chapter No 6","Chapter No 7",
            "Chapter No 8","Chapter No 9"};
    private String descriptions[] = {"Physical Quantities and Measurement.","Kinematics","Dynamics","Turning Effect Of Forces","Gravitation","Work and Energy",
    "Properties of Matter","Thermal Properties Of Matter","Transfer of Heat"};
    private int imgid[] = {R.drawable.textbook1,R.drawable.textbook2,R.drawable.textbook3,R.drawable.textbook4,R.drawable.textbook6,R.drawable.textbook5,R.drawable.textbook7,
    R.drawable.textbook8,R.drawable.textbook9};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_book_chapters);

        lv = (ListView) findViewById(R.id.textbookchapters);
        MyAdapter adapter = new MyAdapter(this, titles, imgid, descriptions);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                int index=position;
                Toast.makeText(TextBookChapters.this, "You Selected Physics "+titles[index], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(TextBookChapters.this, PDFOpener.class);
                intent.putExtra("chap_pos", position + 1);
                startActivity(intent);
            }

        });
    }
    class MyAdapter extends ArrayAdapter<String>
    {
        Context context;
        String myTitles[];
        String myDescriptions[];
        int imgid[];
        MyAdapter(Context c, String titles[], int imgid[], String descriptions[])
        {
            super(c, R.layout.customrow, R.id.text1, titles);
            this.context = c;
            this.imgid = imgid;
            this.myTitles = titles;
            this.myDescriptions = descriptions;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
        {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View customrow = layoutInflater.inflate(R.layout.customrow, parent, false);
            ImageView images = customrow.findViewById(R.id.logo);
            TextView myTitle = customrow.findViewById(R.id.text1);
            TextView myDscription = customrow.findViewById(R.id.text2);
            images.setImageResource(imgid[position]);
            myTitle.setText(titles[position]);
            myDscription.setText(descriptions[position]);
            return customrow;
        }
    }
}
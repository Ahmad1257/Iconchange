package com.example.iconchange.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iconchange.HTMLShortQuesOpener;
import com.example.iconchange.R;
import com.example.iconchange.ShortQues_Model;

import java.util.List;

public class ShortQuestions_Adapter extends RecyclerView.Adapter<ShortQuestions_Adapter.MyViewHolder>
{

    List<ShortQues_Model> shortQues_model;

    private Context context;

    public ShortQuestions_Adapter(Context context)
    {
        this.context = context;
    }

    public void setShortQues_Model(List<ShortQues_Model> shortques_model)
    {
        this.shortQues_model = shortques_model;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cust_shortques_row, viewGroup, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        ShortQues_Model shortques = shortQues_model.get(position);

        holder.imageView.setImageResource(shortques.getImg());
        holder.title1.setText(shortques.getTitle1());
        holder.title2.setText(shortques.getTitle2());

    }


    @Override
    public int getItemCount()
    {
        return shortQues_model.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView title1;
        TextView title2;


        MyViewHolder(@NonNull final View itemView)
        {
            super(itemView);


            imageView = itemView.findViewById(R.id.shortQuestion_iv);
            title1 = itemView.findViewById(R.id.shortques_tv1);
            title2 = itemView.findViewById(R.id.shortques_tv2);

            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Toast.makeText(context, "You Selected Physics Chapter " + (getAdapterPosition() + 1), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, HTMLShortQuesOpener.class);
                    intent.putExtra("pos", (getAdapterPosition() + 1));
                    context.startActivity(intent);
                }
            });
        }
    }
}

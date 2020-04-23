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

import com.example.iconchange.MCQSOpener;
import com.example.iconchange.MCQS_Model;
import com.example.iconchange.R;


import java.util.List;

public class MCQs_Adapter extends RecyclerView.Adapter<MCQs_Adapter.MyViewHolder>
{
    List<MCQS_Model> mcqs_model;

    private Context context;

    public MCQs_Adapter(Context context)
    {
        this.context = context;
    }
    public void setMCQS_Model(List<MCQS_Model> mCQs_model)
    {
        this.mcqs_model = mCQs_model;
        notifyDataSetChanged();
    }
      @NonNull
      @Override
      public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
      {

        View view = LayoutInflater.from(viewGroup.getContext())
                 .inflate(R.layout.cust_mcqs_row, viewGroup, false);

        return new MyViewHolder(view);
      }
      @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        MCQS_Model mcqs = mcqs_model.get(position);

        holder.imageView.setImageResource(mcqs.getImg());
        holder.title1.setText(mcqs.getTitle1());
        holder.title2.setText(mcqs.getTitle2());

    }
    @Override
    public int getItemCount()
    {
        return mcqs_model.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder
    {

            ImageView imageView;
            TextView title1;
            TextView title2;


            MyViewHolder(@NonNull final View itemView)
            {
                super(itemView);


                imageView = itemView.findViewById(R.id.mcqs_iv);
                title1 = itemView.findViewById(R.id.mcqs_tv1);
                title2 = itemView.findViewById(R.id.mcqs_tv2);

                itemView.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Toast.makeText(context, "You Selected Physics Chapter " + (getAdapterPosition() + 1), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, MCQSOpener.class);
                        intent.putExtra("pos", (getAdapterPosition() + 1));
                        context.startActivity(intent);
                    }
                });
            }
        }

    }

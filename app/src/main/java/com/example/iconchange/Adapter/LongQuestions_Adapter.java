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

import com.example.iconchange.LongQuesSolutionOpener;
import com.example.iconchange.LongQues_Model;

import com.example.iconchange.R;

import java.util.List;

public class LongQuestions_Adapter extends RecyclerView.Adapter<LongQuestions_Adapter.MyViewHolder>
{

    List<LongQues_Model> longques;

    private Context context;

    public LongQuestions_Adapter(Context context)
    {
        this.context = context;
    }

    public void setLongQues_Model(List<LongQues_Model> longques)
    {
        this.longques = longques;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public LongQuestions_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cust_longques_row, viewGroup, false);

        return new LongQuestions_Adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        LongQues_Model longQ = longques.get(position);

        holder.imageView.setImageResource(longQ.getImg());
        holder.title.setText(longQ.getTitle());
    }


    @Override
    public int getItemCount()
    {
        return longques.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView title;


        MyViewHolder(@NonNull final View itemView)
        {
            super(itemView);


            imageView = itemView.findViewById(R.id.lonqques_img_iv);
            title = itemView.findViewById(R.id.longques_tv);

            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "You Selected Physics Chapter " + (getAdapterPosition() + 1), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, LongQuesSolutionOpener.class);
                    intent.putExtra("pos", (getAdapterPosition() + 1));
                    context.startActivity(intent);
                }
            });
        }
    }
}

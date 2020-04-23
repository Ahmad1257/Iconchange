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

import com.example.iconchange.Numberical;
import com.example.iconchange.NumericalsSolutionOpener;
import com.example.iconchange.R;

import java.util.List;

public class Numberical_Adapter extends RecyclerView.Adapter<Numberical_Adapter.MyViewHolder> {


    List<Numberical> numbericals;

    private Context context;

    public Numberical_Adapter(Context context)
    {
        this.context = context;
    }

    public void setNumbericals(List<Numberical> numbericals)
    {
        this.numbericals = numbericals;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cust_numerical, viewGroup, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Numberical_Adapter.MyViewHolder holder, int position) {

        Numberical numberical = numbericals.get(position);

        holder.imageView.setImageResource(numberical.getImg());
        holder.title.setText(numberical.getTitle());
    }

    @Override
    public int getItemCount()
    {
        return numbericals.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView title;


        MyViewHolder(@NonNull final View itemView)
        {
            super(itemView);


            imageView = itemView.findViewById(R.id.num_img_iv);
            title = itemView.findViewById(R.id.num_name_tv);

            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Toast.makeText(context, "You Selected Physics Chapter " +( getAdapterPosition() + 1), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, NumericalsSolutionOpener.class);
                    intent.putExtra("pos", (getAdapterPosition() + 1));
                    context.startActivity(intent);
                }
            });
        }
    }
}

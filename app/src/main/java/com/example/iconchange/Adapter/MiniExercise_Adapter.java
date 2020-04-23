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

import com.example.iconchange.MiniExe_Model;
import com.example.iconchange.MiniExerciseOpener;
import com.example.iconchange.R;

import java.util.List;

public class MiniExercise_Adapter extends RecyclerView.Adapter<MiniExercise_Adapter.MyViewHolder> {
    List<MiniExe_Model> miniexe;

    private Context context;

    public MiniExercise_Adapter(Context context) {
        this.context = context;
    }

    public void setMiniExe_Model(List<MiniExe_Model> miniexe) {
        this.miniexe = miniexe;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cust_miniexe_row, viewGroup, false);

        return new MiniExercise_Adapter.MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        MiniExe_Model miniEx = miniexe.get(position);

        holder.imageView.setImageResource(miniEx.getImg());
        holder.title.setText(miniEx.getTitle());
    }

    @Override
    public int getItemCount()
    {
        return miniexe.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title;


        MyViewHolder(@NonNull final View itemView) {
            super(itemView);


            imageView = itemView.findViewById(R.id.miniexe_iv);
            title = itemView.findViewById(R.id.miniexe_tv);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "You Selected Physics Chapter " + (getAdapterPosition() + 1), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, MiniExerciseOpener.class);
                    intent.putExtra("pos", (getAdapterPosition() + 1));
                    context.startActivity(intent);
                }
            });
        }
    }

}

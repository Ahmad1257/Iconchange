package com.example.iconchange.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.iconchange.Home_Model;
import com.example.iconchange.R;
import java.util.List;

public class Home_Adapter extends RecyclerView.Adapter<Home_Adapter.MyViewHolder>
{

    private List<Home_Model> mModels;
    private HomeListener listener;

    private Context mContext;

    public Home_Adapter(Context context, List<Home_Model> mModels)
    {
        this.mModels = mModels;
        this.mContext = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cust_home, viewGroup, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, int i)
    {

        Home_Model model = mModels.get(i);

        myViewHolder.name.setText(model.getTitle());
        myViewHolder.image.setImageResource(model.getImage());

    }

    /*Count total items*/
    @Override
    public int getItemCount()
    {
        return mModels.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        ImageView image;
        TextView name;

        MyViewHolder(@NonNull final View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.cust_home_title_tv);
            image = itemView.findViewById(R.id.cust_home_iv);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (listener != null && position != RecyclerView.NO_POSITION)
                        listener.setPos(position);

                }
            });
        }
    }


    public interface HomeListener
    {
        void setPos(int pos);
    }

    public void setOnItemClickListener(HomeListener listener)
    {
        this.listener = listener;
    }
}

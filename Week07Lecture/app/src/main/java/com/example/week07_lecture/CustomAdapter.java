package com.example.week07_lecture;

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

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{
    private ArrayList<MathTopic> mDataset;
    private Context mContext;

    public CustomAdapter(Context mContext, ArrayList<MathTopic> mDataset){
        this.mDataset = mDataset;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View listItem = layoutInflater.inflate(R.layout.math_list_item,parent,false);

        CustomAdapter.ViewHolder viewHolder = new CustomAdapter.ViewHolder(mContext,listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(mDataset.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        public TextView textView;
        public ImageView imageView;

        public ViewHolder(Context mContext, View itemView){
            super(itemView);
            this.mContext = mContext;
            this.textView = (TextView) itemView.findViewById(R.id.textViewListItem);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageViewListItem);
        }

        public void bind(MathTopic item){
            this.textView.setText(item.getName());

            Glide
                    .with(mContext)
                    .load(item.getUrl())
                    .into(this.imageView);
            this.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext,item.getName(),Toast.LENGTH_SHORT).show();

                    Intent sendIntent = new Intent(mContext, CourseActivity.class);
                    sendIntent.putExtra(MathTopic.EXTRA_MATHTOPIC, item);
                    mContext.startActivity(sendIntent);
                }
            });
        }
    }
}

package com.example.borgerkong;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private ArrayList<Food> foodToAdapt;

    public void setData(ArrayList<Food> foodToAdapt) {
        // This is setter to give data to adapter
        this.foodToAdapt = foodToAdapt;
    }
    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //defining the individual food items as view
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.fooditemlayout, parent, false);

        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        //getting position of item clicked
        final Food foodAtPosition = foodToAdapt.get(position);
        //placing the foods from the fakedatabase into the foodNameTextViews
        holder.foodNameTextView.setText(foodAtPosition.getFoodName());

        //allowing press on image to lead to details page
        holder.itemImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, foodDetailActivity.class);
                intent.putExtra("foodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
            }
        });

        //allowing 'seemoreButton' to lead to details page
        holder.seemoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, foodDetailActivity.class);
                intent.putExtra("foodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
            }
        });


        //puts relevant image into the imageView of the food detail
        holder.itemImageView.setImageResource(foodAtPosition.getImageDrawableId());
    }

    @Override
    public int getItemCount() {
        return foodToAdapt.size();
    }
    public static class FoodViewHolder extends RecyclerView.ViewHolder {

        //definining different elements and placing them into their respective positions.
        public View view;
        public TextView foodNameTextView;
        public ImageView itemImageView;
        public Button seemoreButton;

        // This constructor is used in onCreateViewHolder
        public FoodViewHolder(View v) {
            super(v);
            view = v;
            foodNameTextView = v.findViewById(R.id.foodNameTextView);
            itemImageView = v.findViewById(R.id.foodImageView);
            seemoreButton = v.findViewById(R.id.seemoreButton);
        }
    }
}
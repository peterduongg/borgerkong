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

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {

    private ArrayList<Food> foodToAdapt;

    public void setData(ArrayList<Food> foodToAdapt) {
        this.foodToAdapt = foodToAdapt;
    }
    @NonNull
    @Override
    public OrderAdapter.OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.order_layout, parent, false);

        OrderAdapter.OrderViewHolder orderViewHolder = new OrderAdapter.OrderViewHolder(view);
        return orderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderAdapter.OrderViewHolder holder, int position) {

        final Food foodAtPosition = foodToAdapt.get(position);

        holder.foodNameTextView.setText(foodAtPosition.getFoodName());

        holder.numberOrderedTextView.setText(Integer.toString(foodAtPosition.getNumberOrdered()));


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, foodDetailActivity.class);
                intent.putExtra("foodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
            }
        });

        holder.itemImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, foodDetailActivity.class);
                intent.putExtra("foodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
            }
        });

        holder.editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, foodDetailActivity.class);
                intent.putExtra("foodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
            }
        });



        holder.itemImageView.setImageResource(foodAtPosition.getImageDrawableId());
    }

    @Override
    public int getItemCount() {
        return foodToAdapt.size();
    }
    public static class OrderViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView foodNameTextView;
        public ImageView itemImageView;
        public TextView numberOrderedTextView;
        public Button editButton;

        // This constructor is used in onCreateViewHolder
        public OrderViewHolder(View v) {
            super(v);
            view = v;

            foodNameTextView = v.findViewById(R.id.orderFoodName);
            itemImageView = v.findViewById(R.id.orderFoodImage);
            numberOrderedTextView = v.findViewById(R.id.numberOrderedTextView);
            editButton = v.findViewById(R.id.editButton);


        }
    }
}

package com.example.borgerkong;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;



public class foodDetailActivity extends AppCompatActivity {
    private TextView foodNameTextView;
    private TextView foodPriceTextView;
    private TextView foodSummaryTextView;
    private TextView numberOrderedTextView;
    private ImageView foodImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fooddetails);

        // Get the intent that was used to travel to this activity
        Intent intent = getIntent();

        // Get the extra identified by "foodID" that was put into the intent.
        int foodID = intent.getIntExtra("foodID", 0);


        Food food = fakeDatabase.getFoodById(foodID);

        foodNameTextView = findViewById(R.id.detailFoodName);
        foodPriceTextView = findViewById(R.id.detailFoodPrice);
        foodSummaryTextView = findViewById(R.id.detailFoodSummary);
        numberOrderedTextView = findViewById(R.id.detailNumberOrdered);
        foodImageView = findViewById(R.id.detailFoodImage);


        foodNameTextView.setText(food.getFoodName());
        //adding a $ sign in front of the integer so it can be displayed
        foodPriceTextView.setText("$" + Integer.toString(food.getFoodPrice()));
        foodSummaryTextView.setText(food.getFoodSummary());
        numberOrderedTextView.setText(Integer.toString(food.getNumberOrdered()));

        foodImageView.setImageResource(food.getImageDrawableId());

        //add cart button that increases the amount of specific item ordered. increases the 'numberOrdered' element within fakeDatabase
        Button addToCart = findViewById(R.id.addCartButton);
        addToCart.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {

                Intent intent = getIntent();
                int foodID = intent.getIntExtra("foodID", 0);

                Food food = fakeDatabase.getFoodById(foodID);
                food.setNumberOrdered(food.getNumberOrdered()+1);
                numberOrderedTextView.setText(Integer.toString(food.getNumberOrdered()));
            }
        });

        //minusToCart reduces the amount of specific item in the cart decreasing 'numberOrdered' element within fakeDatabase
        Button minusToCart = findViewById(R.id.minusCartButton);
        minusToCart.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {

                Intent intent = getIntent();
                int foodID = intent.getIntExtra("foodID", 0);

                Food food = fakeDatabase.getFoodById(foodID);

                //amount is only allowed to be 0 or above.
                if(food.getNumberOrdered() > 0 ){
                    food.setNumberOrdered(food.getNumberOrdered()-1);
                    numberOrderedTextView.setText(Integer.toString(food.getNumberOrdered()));
                }

            }
        });

        //order viewable from food detail page
        Button viewOrderButton = findViewById(R.id.viewOrderButton);
        viewOrderButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OrderListActivity.class);
                startActivity(intent);
            }
        });
    }


}

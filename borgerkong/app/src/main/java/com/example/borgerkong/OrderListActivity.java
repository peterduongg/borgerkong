package com.example.borgerkong;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class OrderListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_list);

        Intent intent = getIntent();

        recyclerView = findViewById(R.id.rv_order);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        OrderAdapter orderAdapter = new OrderAdapter();

        // FakeDatabase to the Adapter.
        orderAdapter.setData(fakeDatabase.getAllFood());
        recyclerView.setAdapter(orderAdapter);

        //linking orderCost element to the orderCostTextView within the order_list.xml
        TextView orderCost = findViewById(R.id.orderCostTextView);
        //defining variable to contain cost calculation
        int costMoney = 0;

        //searching through food array to calculate EACH ordered items by multiplying number ordered by price of food
        ArrayList<Food> order = new ArrayList<>();
        for(Food item : fakeDatabase.getAllFood()){
            if(item.getNumberOrdered() > 0){
                order.add(item);
                costMoney+= (item.getNumberOrdered()*item.getFoodPrice());
            }
        }

        //turning the calculated integer into a legible string to be displayed
        orderCost.setText("Total Cost $" + costMoney);


        //returns the user back to the original menu
        Button menuButton = findViewById(R.id.menuButton);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });


    }
}

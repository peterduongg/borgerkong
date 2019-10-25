package com.example.borgerkong;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //defining RecyclerView and layout manager
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting recyclerView with corresponding element in xml file and linking to recyclerview
        recyclerView = findViewById(R.id.rv_main);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        FoodAdapter foodAdapter = new FoodAdapter();

        // getting all element from fake database and placing
        foodAdapter.setData(fakeDatabase.getAllFood());
        recyclerView.setAdapter(foodAdapter);

        //defining button and linking to the button in order_list.xml
        Button viewOrder = findViewById(R.id.viewOrderButton);

        //onClickListener that leads to the order_list.xml
        viewOrder.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OrderListActivity.class);
                startActivity(intent);

            }
        });


    }
}

package com.example.food1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class order extends AppCompatActivity {

    private Button latte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        latte = findViewById(R.id.latte);
        latte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(order.this,drink.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
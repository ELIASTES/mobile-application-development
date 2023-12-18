package com.example.food1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class drink extends AppCompatActivity {

    private Button x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        x= findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(drink.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
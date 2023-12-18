package com.example.imo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class explore extends AppCompatActivity {

    private Button people,manage1,message1,profile;
    private TextView room;
    private LinearLayout message,manage,room1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        room1= findViewById(R.id.room1);
        room1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(explore.this,room.class);
                startActivity(intent);
                finish();
            }
        });

        manage = findViewById(R.id.manage);
        manage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(explore.this, contacts.class);
                startActivity(intent);
                finish();
            }
        });
        manage1 = findViewById(R.id.manage1);
        manage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(explore.this, contacts.class);
                startActivity(intent);
                finish();
            }
        });
        message = findViewById(R.id.message);
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(explore.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        message1 = findViewById(R.id.message1);
        message1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(explore.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        profile= findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(explore.this,profile.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
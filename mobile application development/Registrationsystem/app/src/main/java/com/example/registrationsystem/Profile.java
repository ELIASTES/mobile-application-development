package com.example.registrationsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    private Button button;
    private Button schedule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"You're LOGOUT",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        schedule = findViewById(R.id.schedule);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, schedule.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
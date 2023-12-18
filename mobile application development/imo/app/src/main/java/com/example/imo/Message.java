package com.example.imo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Message extends AppCompatActivity {

    private Button arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        arrow = findViewById(R.id.arrowback);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Message.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
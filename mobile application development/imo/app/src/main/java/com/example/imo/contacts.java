package com.example.imo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class contacts extends AppCompatActivity {

    private Button chatroom1,message1,profile;
    private LinearLayout chatroom,message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        message = findViewById(R.id.message);
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(contacts.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        message1 = findViewById(R.id.message1);
        message1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(contacts.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        chatroom = findViewById(R.id.chatroom);
        chatroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(contacts.this, room.class);
                startActivity(intent);
                finish();
            }
        });
        chatroom1 = findViewById(R.id.chatroom1);
        chatroom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(contacts.this, room.class);
                startActivity(intent);
                finish();
            }
        });
        profile= findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(contacts.this,profile.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
package com.example.imo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button people,chatroom,manage,profile;
    private TextView m1,m3;
    private LinearLayout chatroom1,manage1,m,m2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manage = findViewById(R.id.manage);
        manage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, contacts.class);
                startActivity(intent);
                finish();
            }
        });
        chatroom = findViewById(R.id.chatroom);
        chatroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, room.class);
                startActivity(intent);
                finish();
            }
        });
         profile= findViewById(R.id.profile);
         profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,profile.class);
                startActivity(intent);
                finish();
            }
        });
        manage1 = findViewById(R.id.manage1);
        manage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, contacts.class);
                startActivity(intent);
                finish();
            }
        });
        chatroom1 = findViewById(R.id.chatroom1);
        chatroom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, room.class);
                startActivity(intent);
                finish();
            }
        });
        m= findViewById(R.id.message);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Message.class);
                startActivity(intent);
                finish();
            }
        });
        m1= findViewById(R.id.message1);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Message.class);
                startActivity(intent);
                finish();
            }
        });
        m2= findViewById(R.id.message2);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Message.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
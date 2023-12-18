package com.example.registrationsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity2 extends AppCompatActivity {

    private Button button;

    private TextView web;
    private TextView textregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginActivity2.this, Profile.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Successfully Logged in",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        textregister = findViewById(R.id.textregister);
        textregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginActivity2.this, more.class);
                startActivity(intent);
                finish();
            }
        });

        web = findViewById(R.id.web);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://uu.edu.et/");

            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
package com.example.senddata;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class senddata2 extends AppCompatActivity {

    TextView fname1,lname1;
    Button arrowback;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senddata2);

        fname1=findViewById(R.id.fname1);
        lname1=findViewById(R.id.lname1);
        String F1=getIntent().getStringExtra("k");
        String M1=getIntent().getStringExtra("k1");

        fname1.setText(F1);
        lname1.setText(M1);




        arrowback= findViewById(R.id.arrowback);
        arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(senddata2.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
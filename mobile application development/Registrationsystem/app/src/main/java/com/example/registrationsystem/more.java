package com.example.registrationsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class more extends AppCompatActivity {
private Button buttonregister;
    private Button buttoncancle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        buttonregister = findViewById(R.id.buttonregister);
        buttonregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(more.this,loginActivity2.class);
                Toast.makeText(getApplicationContext(),"Registered",Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            }
        });

        buttoncancle = findViewById(R.id.buttoncancle);
        buttoncancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(more.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
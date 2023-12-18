package com.example.senddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button s1;
    EditText fname,lname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1=findViewById(R.id.s1);
        fname=findViewById(R.id.fname);
        lname=findViewById(R.id.lname);


        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String F=fname.getText().toString();
                String M=lname.getText().toString();

                Intent intent = new Intent(MainActivity.this,senddata2.class);

                intent.putExtra("k",F);
                intent.putExtra("k1",M);

                startActivity(intent);
                finish();
            }
        });

    }
}
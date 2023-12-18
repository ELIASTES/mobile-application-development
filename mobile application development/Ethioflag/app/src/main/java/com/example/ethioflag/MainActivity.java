package com.example.ethioflag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button amhara;
    private Button tigray;
    private Button sidama;
    private Button oromiya;
    private Button harari;
    private Button benshangul;
    private Button afar;
    private Button gambela;
    private Button southnation;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amhara = findViewById(R.id.amhara);
        amhara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Amhara.class);
                startActivity(intent);
                finish();
            }
        });
        tigray = findViewById(R.id.tigray);
        tigray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tigray.class);
                startActivity(intent);
                finish();
            }
        });
        sidama = findViewById(R.id.sidama);
        sidama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sidama.class);
                startActivity(intent);
                finish();
            }
        });
        oromiya = findViewById(R.id.oromiya);
        oromiya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Oromiya.class);
                startActivity(intent);
                finish();
            }
        });
        harari = findViewById(R.id.harari);
        harari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Harari.class);
                startActivity(intent);
                finish();
            }
        });
       benshangul = findViewById(R.id.benshangul);
        benshangul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Benshangul.class);
                startActivity(intent);
                finish();
            }
        });
        afar = findViewById(R.id.afar);
        afar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Afar.class);
                startActivity(intent);
                finish();
            }
        });
        gambela = findViewById(R.id.gambela);
        gambela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Gambela.class);
                startActivity(intent);
                finish();
            }
        });
        southnation = findViewById(R.id.southnation);
        southnation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Southnation.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
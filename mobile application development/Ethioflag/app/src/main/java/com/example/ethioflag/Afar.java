package com.example.ethioflag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Afar extends AppCompatActivity {

    private Button x;
    private Button more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afar);
        x = findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Afar.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        more = findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://en.wikipedia.org/wiki/Afar_people");

            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
    }
}
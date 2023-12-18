package com.example.ethioflag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Oromiya extends AppCompatActivity {

    private Button x;
    private Button more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oromiya);

        x = findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Oromiya.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        more = findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://www.everyculture.com/wc/Costa-Rica-to-Georgia/Oromos.html#ixzz8JADqQZbp");

            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
    }
}
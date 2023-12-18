package com.example.display;

import static androidx.core.content.SharedPreferencesKt.edit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private   Button button,button2;
  private   TextView textView;
 private EditText editTextText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        {

            button.findViewById(R.id.button);
            button2.findViewById(R.id.button2);
            textView.findViewById(R.id.textView);
            editTextText.findViewById(R.id.editTextText);
            button.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    int mode;
                    getSharedPreferences sp=getSharedPreferences(mode:1);
                    String in = null;
                    SharedPreferences.Editor editor= getSharedPreferences(in, mode:1).edit();
                    editor.putString(in,);
                    editor.apply();
                }

            });

}
    }
}
package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button buttonL,buttonR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        buttonL = findViewById(R.id.button);
        buttonR = findViewById(R.id.button2);

        textView.setText("hello world");

        buttonL.setOnClickListener(v->{
            textView.setText("←");
        });

        buttonR.setOnClickListener(v -> {
            textView.setText("→");
        });
    }


}
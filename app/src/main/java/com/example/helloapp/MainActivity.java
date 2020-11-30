package com.example.helloapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button buttonL,buttonR;

    private static String LOG_TAG="mylog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG,"onCreate...");
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        buttonL = findViewById(R.id.button);
        buttonR = findViewById(R.id.button2);

        if (savedInstanceState!=null){
            String butStr = savedInstanceState.getString("butStr");
            if (butStr!=null){
                textView.setText(butStr);
            }
        }else{
            textView.setText("hello world");
        }

        buttonL.setOnClickListener(v->{
            textView.setText("←");
        });

        buttonR.setOnClickListener(v -> {
            textView.setText("→");
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("butStr",textView.getText().toString());

    }
}
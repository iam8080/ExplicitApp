package com.example.explicitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView   result   =   (TextView) findViewById(R.id.result);
        Intent  intent  =   getIntent();
       String  add =   (String) intent.getSerializableExtra("Sum");
        result.setText("ANSWER"+add);
    }
}
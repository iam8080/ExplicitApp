package com.example.explicitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button bt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.first);
        e2 = (EditText) findViewById(R.id.second);
        bt = (Button) findViewById(R.id.btn);
      // Intent intent =getIntent();
    }

    public void addBtn(View view) {
        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());
        Intent intent = new Intent(MainActivity.this, Result.class);
       // intent.
        intent.putExtra("Sum","" +n1+"+"+n2 +"="+(n1+n2));
        startActivity(intent);
    }
}
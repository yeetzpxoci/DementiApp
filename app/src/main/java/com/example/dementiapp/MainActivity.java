package com.example.dementiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but1 = (Button)findViewById(R.id.button_helper);
        Button but2 = (Button)findViewById(R.id.button_patient);
        Button but3 = (Button)findViewById(R.id.button_start_quiz);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(int1);
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(int2);
            }
        });
    }

    public void helper(View v){
        startActivity(new Intent(MainActivity.this, MainActivity2.class));
    }
}
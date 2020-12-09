package com.example.doulingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity6Q1 extends AppCompatActivity {

    Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6_q1);
        button6 = findViewById(R.id.button6);
        button6.setTextColor(Color.parseColor("#ffffff"));
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             openStartScreen();
            }
        });

    }
    public void openStartScreen(){
        Intent intent = new Intent(this, StartScreen.class);
        startActivity(intent);
    }
}

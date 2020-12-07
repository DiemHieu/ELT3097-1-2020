package com.example.doulingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);
        Button buttonquiz1 = findViewById(R.id.buttonquiz1);
        Button buttonquiz2 = findViewById(R.id.buttonquiz2);
        buttonquiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivityQ1();
            }
        });
        buttonquiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivityQ2();
            }
        });
    }

    public void openMainActivityQ1(){
        Intent intent = new Intent(this, MainActivityQ1.class);
        startActivity(intent);
    }

    public void openMainActivityQ2(){
        Intent intent = new Intent(this, MainActivity2Q2.class);
        startActivity(intent);
    }
}




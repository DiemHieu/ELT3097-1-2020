package com.example.doulingo;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2Q2 extends AppCompatActivity {
    EditText editText;
    Button btCheck;
    Button btContinue;
    ProgressBar pbNext;
    ImageButton btExit;
    TextView textView2;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_q2);

        editText = findViewById(R.id.Edittext);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        pbNext = (ProgressBar) findViewById(R.id.ProgressBar);
        btContinue = (Button) findViewById(R.id.buttonTiepTuc);
        btExit = (ImageButton) findViewById(R.id.Exit_Button);
        btCheck = (Button) findViewById(R.id.ButtonKiemtra);

        Intent intent = getIntent();
        final int ketqua = intent.getIntExtra("prb", 111);
        pbNext.setProgress(ketqua);

        btCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String noiDung = editText.getText().toString();
                if(noiDung.equals("ice")) {
                    textView2.setVisibility(View.VISIBLE);
                    textView3.setVisibility(View.INVISIBLE);
                    btCheck.setVisibility(View.INVISIBLE);
                    btContinue.setVisibility(View.VISIBLE);
                    pbNext.setProgress(pbNext.getProgress() + 10);
                }
                else {
                    textView3.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.INVISIBLE);
                    btCheck.setVisibility(View.INVISIBLE);
                    btContinue.setVisibility(View.VISIBLE);
                }
            }
        });
        btContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2Q2.this, MainActivity3Q2.class);
                intent.putExtra("prb",pbNext.getProgress());
                startActivity(intent);
            }
        });

        btExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2Q2.this,StartScreen.class);
                startActivity(intent);
            }
        });

    }
}
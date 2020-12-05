package com.example.doulingo;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    Button btCheck;
    Button btContinue;
    ProgressBar pbNext;
    int choose =0;
    TextView textView2;
    TextView textView3;
    ImageButton btExit;
    ImageButton button;
    ImageButton button2;
    ImageButton button3;
    ImageButton button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btCheck = (Button) findViewById(R.id.ButtonKiemtra);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        pbNext = (ProgressBar) findViewById(R.id.ProgressBar);
        btContinue = (Button) findViewById(R.id.ButtonTiepTuc);
        btExit = (ImageButton) findViewById(R.id.exit_imageButton);
        button = (ImageButton) findViewById(R.id.imageButton);
        button2 = (ImageButton) findViewById(R.id.imageButton2);
        button3 = (ImageButton) findViewById(R.id.imageButton3);
        button4 = (ImageButton) findViewById(R.id.imageButton4);

        Intent intent = getIntent();
        final int ketqua = intent.getIntExtra("prb", 111);
        pbNext.setProgress(ketqua);

        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btCheck.setBackgroundResource(R.drawable.blue);
                choose=1;
                textView2.setVisibility(View.INVISIBLE);
                textView3.setVisibility(View.INVISIBLE);
            }
        }));

        button2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btCheck.setBackgroundResource(R.drawable.blue);
                choose=2;
                textView2.setVisibility(View.INVISIBLE);
                textView3.setVisibility(View.INVISIBLE);
            }
        }));

        button3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btCheck.setBackgroundResource(R.drawable.blue);
                choose=3;
                textView2.setVisibility(View.INVISIBLE);
                textView3.setVisibility(View.INVISIBLE);
            }
        }));

        button4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btCheck.setBackgroundResource(R.drawable.blue);
                choose=4;
                textView2.setVisibility(View.INVISIBLE);
                textView3.setVisibility(View.INVISIBLE);
            }
        }));

        btCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                btCheck.setBackgroundResource(R.drawable.blue);
                if (choose==2){
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

        btExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                intent.putExtra("prb",pbNext.getProgress());
                startActivity(intent);
            }
        });

    }
}
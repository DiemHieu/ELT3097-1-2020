package com.example.doulingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity3Q1 extends AppCompatActivity {

    Button button4;
    Button button;
    Button button1;
    Button button2;
    TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_q1);
        button4 = findViewById(R.id.button4);
        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        textView3 = findViewById(R.id.textView3);
        button4.setTextColor(Color.parseColor("#a9a9a9"));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setBackgroundResource(R.drawable.button_click_design);
                button.setTextColor(Color.parseColor("#1e90ff"));
                button1.setBackgroundResource(R.drawable.button_answer_design);
                button1.setTextColor(Color.parseColor("#000000"));
                button2.setBackgroundResource(R.drawable.button_answer_design);
                button2.setTextColor(Color.parseColor("#000000"));
                button4.setBackgroundResource(R.drawable.button_question_click_design);
                button4.setTextColor(Color.parseColor("#ffffff"));
                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String Button4Text = button4.getText().toString();
                        textView3.setText("\t\t\n Sai rồi.Đáp án đúng là:\n\t  She is drinking water");
                        textView3.setBackgroundResource(R.drawable.text_design_false);
                        button4.setBackgroundResource(R.drawable.button_qs_click_false);
                        button4.setText("Tiếp tục");
                        if(Button4Text.equals("Tiếp tục")){
                            openActivity4();
                        }
                    }
                });

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setBackgroundResource(R.drawable.button_click_design);
                button1.setTextColor(Color.parseColor("#1e90ff"));
                button.setBackgroundResource(R.drawable.button_answer_design);
                button.setTextColor(Color.parseColor("#000000"));
                button2.setBackgroundResource(R.drawable.button_answer_design);
                button2.setTextColor(Color.parseColor("#000000"));
                button4.setBackgroundResource(R.drawable.button_question_click_design);
                button4.setTextColor(Color.parseColor("#ffffff"));
                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String Button4Text = button4.getText().toString();
                        textView3.setText("\t\t\n Sai rồi.Đáp án đúng là:\n\t  She is drinking water");
                        textView3.setBackgroundResource(R.drawable.text_design_false);
                        button4.setBackgroundResource(R.drawable.button_qs_click_false);
                        button4.setText("Tiếp tục");
                        if(Button4Text.equals("Tiếp tục")){
                            openActivity4();
                        }
                    }
                });
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2.setBackgroundResource(R.drawable.button_click_design);
                button2.setTextColor(Color.parseColor("#1e90ff"));
                button.setBackgroundResource(R.drawable.button_answer_design);
                button.setTextColor(Color.parseColor("#000000"));
                button1.setBackgroundResource(R.drawable.button_answer_design);
                button1.setTextColor(Color.parseColor("#000000"));
                button4.setBackgroundResource(R.drawable.button_question_click_design);
                button4.setTextColor(Color.parseColor("#ffffff"));
                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String Button4Text = button4.getText().toString();
                        textView3.setText("\t\t\n Chính xác!");
                        textView3.setBackgroundResource(R.drawable.text_design_true);
                        button4.setText("Tiếp tục");
                        if(Button4Text.equals("Tiếp tục")){
                            openActivity4();
                        }
                    }
                });
            }
        });
    }
    public void clickexit(View v){
        // moveTaskToBack(true);
        //android.os.Process.killProcess(android.os.Process.myPid());
        // System.exit(1);
        openStartScreen();
    }
    public void openActivity4(){
        Intent intent = new Intent(this, MainActivity4Q1.class);
        startActivity(intent);
    }

    public void openStartScreen(){
        Intent intent = new Intent(this, StartScreen.class);
        startActivity(intent);
    }
}

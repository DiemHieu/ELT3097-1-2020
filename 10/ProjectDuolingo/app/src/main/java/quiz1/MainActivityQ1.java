package quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.doulingo.R;
import com.example.doulingo.StartScreen;


public class MainActivityQ1 extends AppCompatActivity {

    Button button4;
    Button button;
    Button button1;
    Button button2;
    TextView textView3;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_q1);
        button4 = findViewById(R.id.button4);
        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        textView3 = findViewById(R.id.textView3);
        progressBar = findViewById(R.id.progressBar);
        button4.setTextColor(Color.parseColor("#a9a9a9"));
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivityQ1.this, "Chọn đáp án!", Toast.LENGTH_SHORT).show();
            }
        });
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
                        textView3.setText("\t\t\n Chính xác!");
                        textView3.setBackgroundResource(R.drawable.text_design_true);
                        button4.setText("Tiếp tục");
                        if(Button4Text.equals("Tiếp tục")){
                            openActivity2();
                        }
                    }
                });

                markUp();
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
                        textView3.setText("\t\t\n Sai rồi.Đáp án đúng là:\n\t  They drink juice ");
                        textView3.setBackgroundResource(R.drawable.text_design_false);
                        button4.setBackgroundResource(R.drawable.button_qs_click_false);
                        button4.setText("Tiếp tục");
                        if(Button4Text.equals("Tiếp tục")){
                            openActivity2();
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
                        textView3.setText("\t\t\n Sai rồi.Đáp án đúng là:\n\t  They drink juice ");
                        textView3.setBackgroundResource(R.drawable.text_design_false);
                        button4.setBackgroundResource(R.drawable.button_qs_click_false);
                        button4.setText("Tiếp tục");
                        if(Button4Text.equals("Tiếp tục")){
                            openActivity2();
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
    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity2Q1.class);
        startActivity(intent);
    }

    public void openStartScreen(){
        Intent intent = new Intent(this, StartScreen.class);
        startActivity(intent);
    }

    public void markUp(){
        progressBar.setProgress(0);
        final int totalMark = 5;
        final Thread thread = new Thread(){
            @Override
            public void run(){
                int jummark = 1;

                progressBar.setProgress(jummark);
            }

        };
        thread.start();
    }
}

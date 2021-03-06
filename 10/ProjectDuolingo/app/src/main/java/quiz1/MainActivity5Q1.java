package quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.doulingo.R;
import com.example.doulingo.StartScreen;


public class MainActivity5Q1 extends AppCompatActivity {

    Button button4;
    Button button;
    Button button1;
    Button button2;
    TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5_q1);
        button4 = findViewById(R.id.button4);
        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        textView3 = findViewById(R.id.textView3);
        button4.setTextColor(Color.parseColor("#a9a9a9"));
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity5Q1.this, "Chọn đáp án!", Toast.LENGTH_SHORT).show();
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
                        textView3.setText("\t\t\n Sai rồi.Đáp án đúng là:\n\t  I like tea ");
                        textView3.setBackgroundResource(R.drawable.text_design_false);
                        button4.setBackgroundResource(R.drawable.button_qs_click_false);
                        button4.setText("Tiếp tục");
                        if(Button4Text.equals("Tiếp tục")){
                            openActivity6();
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
                        textView3.setText("\t\t\n Sai rồi.Đáp án đúng là:\n\t  I like tea ");
                        textView3.setBackgroundResource(R.drawable.text_design_false);
                        button4.setBackgroundResource(R.drawable.button_qs_click_false);
                        button4.setText("Tiếp tục");
                        if(Button4Text.equals("Tiếp tục")){
                            openActivity6();
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
                            openActivity6();
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
    public void openActivity6(){
        Intent intent = new Intent(this, MainActivity6Q1.class);
        startActivity(intent);
    }

    public void openStartScreen(){
        Intent intent = new Intent(this, StartScreen.class);
        startActivity(intent);
    }
}

package com.example.doulingo.question;

import android.content.Context;

public class QuestionControler {

    private DBHelper dbHelper;

    public QuestionControler(Context context){
        dbHelper = new DBHelper(context);
    }
}

package com.example.doulingo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



import androidx.annotation.Nullable;

public class QuizDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "MyAwesomeQuiz.db";
    private static final String DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTION_TABLE = "CREATE_TABLE, " +
                QuizContract.QuestionsTable.TABLE_NAME + "(" +
                QuizContract.QuestionsTable._ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + "TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + "TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + "TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + "TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + "INTEGER" + ")";
        db.execSQL(SQL_CREATE_QUESTION_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + QuizContract.QuestionsTable.TABLE_NAME);
        onCreate(db);
    }


    private void fillQuestionsTable(){
        Question q1 = new Question("A is correct","A","B","C",1);
        addQuestion(q1);
        Question q2 = new Question("B is correct","A","B","C",2);
        addQuestion(q2);
        Question q3 = new Question("C is correct","A","B","C",3);
        addQuestion(q3);
        Question q4 = new Question("A is correct again","A","B","C",1);
        addQuestion(q4);
        Question q5 = new Question("B is correct again","A","B","C",2);
        addQuestion(q5);
    }

    private void addQuestion(Question question){
        ContentValues cv = new ContentValues();
        cv.put(QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuizContract.QuestionsTable.TABLE_NAME,null,cv);

    }
}

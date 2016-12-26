package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class QuizActivity extends AppCompatActivity {

    private Toolbar mQuizToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mQuizToolbar = (Toolbar) findViewById(R.id.quizToolBar);
        setSupportActionBar(mQuizToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


}

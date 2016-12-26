package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    private Toolbar mQuizToolbar;
    boolean q1A =false;
    boolean q1B =false;
    boolean q1C =false;
    boolean q1D =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mQuizToolbar = (Toolbar) findViewById(R.id.quizToolBar);
        setSupportActionBar(mQuizToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void question1Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question1_a:
                if (checked)
                    q1A = true;
                    q1B = false;
                    q1C = false;
                    q1D = false;
                    break;
            case R.id.question1_b:
                if (checked)
                    q1A = false;
                    q1B = true;
                    q1C = false;
                    q1D = false;
                    break;
            case R.id.question1_c:
                if (checked)
                    q1A = false;
                    q1B = false;
                    q1C = true;
                    q1D = false;
                    break;
            case R.id.question1_d:
                if (checked)
                    q1A = false;
                    q1B = false;
                    q1C = false;
                    q1D = true;
                    break;
        }
    }


    public void questionSubmit(View view){

        TextView showResult = (TextView) findViewById(R.id.resultText);
        showResult.setText(checkAnswer());

    }

    private String checkAnswer() {
        if (q1A || q1B || q1C) {
            return "Unfortunately that is the incorrect answer, please try again";
        }
        return "Congratulations, that is the correct answer!";
    }
}

package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import org.w3c.dom.Text;

public class QuizActivity extends AppCompatActivity {

    boolean qA =false;
    boolean qB =false;
    boolean qC =false;
    boolean qD =false;
    public int quizQuestionNumber = 0;
    public int quizQuestionAnswers = 0;
    public String[] quizQuestions  = {
            "Q1) What is the big-O running time of Mergesort?",
            "Q2) What is the big-O running time of Insertion Sort"
    };
    public String[] quizAnswers = {
            "a.) O(n)", "b.) O(n^2)",
            "c.) O(logn)", "d.) O(n logn)",
            "a.) O(n)", "b.) O(n^2)",
            "c.) O(logn)", "d.) O(n logn)"
    };
    public String[] correctAnswers = {
            "qD", "qB"
    };
    public int numberAnswersCorrect = 0;
    public int numberOfQuestions = quizQuestions.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Toolbar mQuizToolbar;
        mQuizToolbar = (Toolbar) findViewById(R.id.quizToolBar);
        setSupportActionBar(mQuizToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setQuestionText();
        setAnswerText();
        setAmountCorrect();
    }

    public void question1Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_a:
                if (checked)
                    qA = true;
                    qB = false;
                    qC = false;
                    qD = false;
                    break;
            case R.id.question_b:
                if (checked)
                    qA = false;
                    qB = true;
                    qC = false;
                    qD = false;
                    break;
            case R.id.question_c:
                if (checked)
                    qA = false;
                    qB = false;
                    qC = true;
                    qD = false;
                    break;
            case R.id.question_d:
                if (checked)
                    qA = false;
                    qB = false;
                    qC = false;
                    qD = true;
                    break;
        }
    }

    public void questionSubmit(View view) {
        String mShowText;
        TextView showResult = (TextView) findViewById(R.id.result_text);

        if ( correctAnswers[quizQuestionNumber-1] == "qA" && qA) {
            mShowText = "Congratulations, that is the correct answer!";
            showResult.setTextColor(getColor(R.color.correct));
            numberAnswersCorrect += 1;
        }
        if ( correctAnswers[quizQuestionNumber-1] == "qB" && qB) {
            mShowText = "Congratulations, that is the correct answer!";
            showResult.setTextColor(getColor(R.color.correct));
            numberAnswersCorrect += 1;
        }
        if ( correctAnswers[quizQuestionNumber-1] == "qC" && qC) {
            mShowText = "Congratulations, that is the correct answer!";
            showResult.setTextColor(getColor(R.color.correct));
            numberAnswersCorrect += 1;
        }
        if ( correctAnswers[quizQuestionNumber-1] == "qD" && qD) {
            mShowText = "Congratulations, that is the correct answer!";
            showResult.setTextColor(getColor(R.color.correct));
            numberAnswersCorrect += 1;
        }
        else {
            mShowText = "Unfortunately that is the incorrect answer, please try again";
            showResult.setTextColor(getColor(R.color.error));
        }
        showResult.setText(mShowText);
        setAmountCorrect();
    }

    public void setQuestionText(){
        TextView putQuestion = (TextView) findViewById(R.id.question_text);
        putQuestion.setText(quizQuestions[quizQuestionNumber]);
        quizQuestionNumber++;
    }

    public void setAnswerText(){
        TextView putAnswerA = (TextView) findViewById(R.id.question_a);
        TextView putAnswerB = (TextView) findViewById(R.id.question_b);
        TextView putAnswerC = (TextView) findViewById(R.id.question_c);
        TextView putAnswerD = (TextView) findViewById(R.id.question_d);

        putAnswerA.setText(quizAnswers[quizQuestionAnswers]);
        quizQuestionAnswers++;
        putAnswerB.setText(quizAnswers[quizQuestionAnswers]);
        quizQuestionAnswers++;
        putAnswerC.setText(quizAnswers[quizQuestionAnswers]);
        quizQuestionAnswers++;
        putAnswerD.setText(quizAnswers[quizQuestionAnswers]);
        quizQuestionAnswers++;
    }

    public void setAmountCorrect(){
        TextView amountCorrect = (TextView) findViewById(R.id.amount_correct);
        amountCorrect.setText(numberAnswersCorrect + "/" + numberOfQuestions + " Correct");

    }
}

package com.emmacyril.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(submitAns);

    }


    private void Q1Check(){
        RadioButton Q1Ans = (RadioButton) findViewById(R.id.radio_q1Ans4);
        boolean isQ1AnsChecked = Q1Ans.isChecked();
        if (isQ1AnsChecked){
            correctAnswers += 1;
        }
    }
    private void Q2Check(){
        RadioButton Q2Ans = (RadioButton) findViewById(R.id.radio_q2Ans1);
        boolean isQ2AnsChecked = Q2Ans.isChecked();
        if (isQ2AnsChecked){
            correctAnswers += 1;
        }
    }
    private void Q3Check(){
        RadioButton Q3Ans = (RadioButton) findViewById(R.id.radio_q3Ans2);
        boolean isQ3AnsChecked = Q3Ans.isChecked();
        if (isQ3AnsChecked){
            correctAnswers += 1;
        }
    }
    private void Q4Check(){
        RadioButton Q4Ans = (RadioButton) findViewById(R.id.radio_q4Ans2);
        boolean isQ4AnsChecked = Q4Ans.isChecked();
        if (isQ4AnsChecked){
            correctAnswers += 1;
        }
    }
    private void Q5Check(){
        RadioButton Q5Ans = (RadioButton) findViewById(R.id.radio_q5Ans4);
        boolean isQ5AnsChecked = Q5Ans.isChecked();
        if (isQ5AnsChecked){
            correctAnswers += 1;
        }
    }


    private void checkAllQuestions(){
        Q1Check();
        Q2Check();
        Q3Check();
        Q4Check();
        Q5Check();
    }

    private void resetQAns(){
        correctAnswers = 0;
    }

    final View.OnClickListener submitAns = new View.OnClickListener() {
        public void onClick(final View v){
            checkAllQuestions();
            Toast.makeText(MainActivity.this, "You Answered: " + correctAnswers + "/5 correctly",
                    Toast.LENGTH_LONG).show();
            resetQAns();
        }
    };
}

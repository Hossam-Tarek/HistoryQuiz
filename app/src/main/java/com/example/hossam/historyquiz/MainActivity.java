package com.example.hossam.historyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view)
    {
        calculateScore();
        Toast.makeText(this, getString(R.string.toast_message, score), Toast.LENGTH_SHORT).show();
    }

    private void calculateScore()
    {
        score = 0;
        checkQuestionOne();
        checkQuestionTwo();
        checkQuestionThree();
        checkQuestionFour();
        checkQuestionFive();
        checkQuestionSix();
    }

    private void checkQuestionOne()
    {
        EditText editText = findViewById(R.id.question_one_answer);
        int year = Integer.parseInt(editText.getText().toString());

        if (year == 1914)
            score++;
    }

    private void checkQuestionTwo()
    {
        RadioGroup radioGroup = findViewById(R.id.radio_group_question_two);
        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if (radioButtonId == R.id.radio_group_question_two_third_answer)
            score++;
    }

    private void checkQuestionThree()
    {
        RadioGroup radioGroup = findViewById(R.id.radio_group_question_three);
        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if (radioButtonId == R.id.radio_group_question_three_third_answer)
            score++;
    }

    private void checkQuestionFour()
    {
        RadioGroup radioGroup = findViewById(R.id.radio_group_question_four);
        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if (radioButtonId == R.id.radio_group_question_four_second_answer)
            score++;
    }

    private void checkQuestionFive()
    {
        CheckBox firstAnswer = findViewById(R.id.checkbox_question_five_first_answer);
        CheckBox secondAnswer = findViewById(R.id.checkbox_question_five_second_answer);
        CheckBox thirdAnswer = findViewById(R.id.checkbox_question_five_third_answer);
        CheckBox fourthAnswer = findViewById(R.id.checkbox_question_five_fourth_answer);

        if (!firstAnswer.isChecked() && !secondAnswer.isChecked() && thirdAnswer.isChecked()
                && fourthAnswer.isChecked())
            score++;
    }

    private void checkQuestionSix()
    {
        RadioGroup radioGroup = findViewById(R.id.radio_group_question_six);
        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if (radioButtonId == R.id.radio_group_question_six_third_answer)
            score++;
    }

}

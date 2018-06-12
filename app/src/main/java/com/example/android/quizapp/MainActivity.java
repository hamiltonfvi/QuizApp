package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.TextView;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {
    EditText quizPlayer;
    TextView questionOne, questionTwo, questionThree, questionFour, questionFive, questionSix;
    TextView questionSeven, questionEight, questionNine, questionTen;
    CheckBox responseOneA, responseOneB, responseOneC, responseTwoA, responseTwoB, responseTwoC;
    CheckBox responseFourA, responseFourB, responseFourC;
    CheckBox responseFiveA, responseFiveB, responseFiveC, responseSixA, responseSixB, responseSixC;
    CheckBox responseSevenA, responseSevenB, responseSevenC, responseEightA, responseEightB;
    CheckBox responseEightC, responseEightD, responseEightE, responseEightF;
    CheckBox responseNineA, responseNineB, responseNineC;
    RadioButton responseThreeA, responseThreeB, responseThreeC;
    Switch responseTen;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quizPlayer = (EditText) findViewById(R.id.quiz_name);

        //initiate TextViews
        questionOne = (TextView) findViewById(R.id.question_one);
        questionTwo = (TextView) findViewById(R.id.question_two);
        questionThree = (TextView) findViewById(R.id.question_three);
        questionFour = (TextView) findViewById(R.id.question_four);
        questionFive = (TextView) findViewById(R.id.question_five);
        questionSix = (TextView) findViewById(R.id.question_six);
        questionSeven = (TextView) findViewById(R.id.question_seven);
        questionEight = (TextView) findViewById(R.id.question_eight);
        questionNine = (TextView) findViewById(R.id.question_nine);
        questionTen = (TextView) findViewById(R.id.question_ten);

        //initiate Checkboxes
        responseOneA = (CheckBox) findViewById(R.id.question_one_response_a);
        responseOneB = (CheckBox) findViewById(R.id.question_one_response_b);
        responseOneC = (CheckBox) findViewById(R.id.question_one_response_c);

        responseTwoA = (CheckBox) findViewById(R.id.question_two_response_a);
        responseTwoB = (CheckBox) findViewById(R.id.question_two_response_b);
        responseTwoC = (CheckBox) findViewById(R.id.question_two_response_c);

        responseThreeA = (RadioButton) findViewById(R.id.question_three_response_a);
        responseThreeB = (RadioButton) findViewById(R.id.question_three_response_b);
        responseThreeC = (RadioButton) findViewById(R.id.question_three_response_c);

        responseFourA = (CheckBox) findViewById(R.id.question_four_response_a);
        responseFourB = (CheckBox) findViewById(R.id.question_four_response_b);
        responseFourC = (CheckBox) findViewById(R.id.question_four_response_c);

        responseFiveA = (CheckBox) findViewById(R.id.question_five_response_a);
        responseFiveB = (CheckBox) findViewById(R.id.question_five_response_b);
        responseFiveC = (CheckBox) findViewById(R.id.question_five_response_c);

        responseSixA = (CheckBox) findViewById(R.id.question_six_response_a);
        responseSixB = (CheckBox) findViewById(R.id.question_six_response_b);
        responseSixC = (CheckBox) findViewById(R.id.question_six_response_c);

        responseSevenA = (CheckBox) findViewById(R.id.question_seven_response_a);
        responseSevenB = (CheckBox) findViewById(R.id.question_seven_response_b);
        responseSevenC = (CheckBox) findViewById(R.id.question_seven_response_c);

        responseEightA = (CheckBox) findViewById(R.id.question_eight_response_a);
        responseEightB = (CheckBox) findViewById(R.id.question_eight_response_b);
        responseEightC = (CheckBox) findViewById(R.id.question_eight_response_c);
        responseEightD = (CheckBox) findViewById(R.id.question_eight_response_d);
        responseEightE = (CheckBox) findViewById(R.id.question_eight_response_e);
        responseEightF = (CheckBox) findViewById(R.id.question_eight_response_f);

        responseNineA = (CheckBox) findViewById(R.id.question_nine_response_a);
        responseNineB = (CheckBox) findViewById(R.id.question_nine_response_b);
        responseNineC = (CheckBox) findViewById(R.id.question_nine_response_c);

        responseTen = (Switch) findViewById(R.id.question_ten_switch);

    }

    public void quizResults(View view) {

        String name = quizPlayer.getText().toString();

        //One point for a corrected answer in question one
        if (responseOneA.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question two
        if (responseTwoA.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question three
        if (responseThreeA.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question four
        if (responseFourA.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question five
        if (responseFiveA.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question six
        if (responseSixA.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question seven
        if (responseSevenA.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question eight
        if (responseEightA.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question nine
        if (responseNineA.isChecked()) {
            score = score + 1;
        }

        //One point for a corrected answer in question ten
        if (responseTen.isChecked()) {
            score = score + 1;
        }

        //Display the winner or the loser
        if (score >= 5) {
            String scoreMessage = getString(R.string.winner) + "\n" + name + "\n" + getString(R.string.score) + " " + score;
            Toast.makeText(this, scoreMessage, Toast.LENGTH_LONG).show();
            final MediaPlayer ring = MediaPlayer.create(this, R.raw.tada);
            ring.start();

        } else {
            String scoreMessage = getString(R.string.loser) + "\n" + name + "\n" + getString(R.string.score) + " " + score;
            Toast.makeText(this, scoreMessage , Toast.LENGTH_LONG).show();
            final MediaPlayer ring = MediaPlayer.create(this, R.raw.lost);
            ring.start();
        }

        score = 0;
    }

    public void onReset(View view) {
        if (responseOneA.isChecked())
            responseOneA.toggle();
        if (responseOneB.isChecked())
            responseOneB.toggle();
        if (responseOneC.isChecked())
            responseOneC.toggle();
        if (responseTwoA.isChecked())
            responseTwoA.toggle();
        if (responseTwoB.isChecked())
            responseTwoB.toggle();
        if (responseTwoC.isChecked())
            responseTwoC.toggle();
        if (responseThreeA.isChecked())
            responseThreeA.setChecked(false);
        if (responseThreeB.isChecked())
            responseThreeB.setChecked(false);
        if (responseThreeC.isChecked())
            responseThreeC.setChecked(false);
        if (responseFourA.isChecked())
            responseFourA.toggle();
        if (responseFourB.isChecked())
            responseFourB.toggle();
        if (responseFourC.isChecked())
            responseFourC.toggle();
        if (responseFiveA.isChecked())
            responseFiveA.toggle();
        if (responseFiveB.isChecked())
            responseFiveB.toggle();
        if (responseFiveC.isChecked())
            responseFiveC.toggle();
        if (responseSixA.isChecked())
            responseSixA.toggle();
        if (responseSixB.isChecked())
            responseSixB.toggle();
        if (responseSixC.isChecked())
            responseSixC.toggle();
        if (responseSevenA.isChecked())
            responseSevenA.toggle();
        if (responseSevenB.isChecked())
            responseSevenB.toggle();
        if (responseSevenC.isChecked())
            responseSevenC.toggle();
        if (responseEightA.isChecked())
            responseEightA.toggle();
        if (responseEightB.isChecked())
            responseEightB.toggle();
        if (responseEightC.isChecked())
            responseEightC.toggle();
        if (responseEightD.isChecked())
            responseEightD.toggle();
        if (responseEightE.isChecked())
            responseEightE.toggle();
        if (responseEightF.isChecked())
            responseEightF.toggle();
        if (responseNineA.isChecked())
            responseNineA.toggle();
        if (responseNineB.isChecked())
            responseNineB.toggle();
        if (responseNineC.isChecked())
            responseNineC.toggle();
        if (responseTen.isChecked())
            responseTen.toggle();
        recreate();
        final MediaPlayer ring = MediaPlayer.create(this, R.raw.reset);
        ring.start();
    }
}
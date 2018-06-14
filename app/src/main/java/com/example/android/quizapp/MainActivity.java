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
    CheckBox responseOneA, responseOneB, responseOneC, responseOneD, responseOneE, responseOneF;
    CheckBox responseTwoA, responseTwoB, responseTwoC, responseTwoD, responseTwoE, responseTwoF;
    CheckBox responseFourA, responseFourB, responseFourC, responseFourD, responseFourE, responseFourF;
    CheckBox responseFiveA, responseFiveB, responseFiveC, responseFiveD, responseFiveE, responseFiveF;
    CheckBox responseSixA, responseSixB, responseSixC, responseSixD, responseSixE, responseSixF;
    CheckBox responseSevenA, responseSevenB, responseSevenC, responseSevenD, responseEightA;
    CheckBox responseEightB, responseEightC, responseEightD, responseEightE, responseEightF;
    CheckBox responseNineA, responseNineB, responseNineC, responseNineD;
    RadioButton responseThreeA, responseThreeB, responseThreeC, responseThreeD;
    Switch responseTen;
    int score = 0;

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
        responseOneD = (CheckBox) findViewById(R.id.question_one_response_d);
        responseOneE = (CheckBox) findViewById(R.id.question_one_response_e);
        responseOneF = (CheckBox) findViewById(R.id.question_one_response_f);

        responseTwoA = (CheckBox) findViewById(R.id.question_two_response_a);
        responseTwoB = (CheckBox) findViewById(R.id.question_two_response_b);
        responseTwoC = (CheckBox) findViewById(R.id.question_two_response_c);
        responseTwoD = (CheckBox) findViewById(R.id.question_two_response_d);
        responseTwoE = (CheckBox) findViewById(R.id.question_two_response_e);
        responseTwoF = (CheckBox) findViewById(R.id.question_two_response_f);

        responseThreeA = (RadioButton) findViewById(R.id.question_three_response_a);
        responseThreeB = (RadioButton) findViewById(R.id.question_three_response_b);
        responseThreeC = (RadioButton) findViewById(R.id.question_three_response_c);
        responseThreeD = (RadioButton) findViewById(R.id.question_three_response_d);

        responseFourA = (CheckBox) findViewById(R.id.question_four_response_a);
        responseFourB = (CheckBox) findViewById(R.id.question_four_response_b);
        responseFourC = (CheckBox) findViewById(R.id.question_four_response_c);
        responseFourD = (CheckBox) findViewById(R.id.question_four_response_d);
        responseFourE = (CheckBox) findViewById(R.id.question_four_response_e);
        responseFourF = (CheckBox) findViewById(R.id.question_four_response_f);

        responseFiveA = (CheckBox) findViewById(R.id.question_five_response_a);
        responseFiveB = (CheckBox) findViewById(R.id.question_five_response_b);
        responseFiveC = (CheckBox) findViewById(R.id.question_five_response_c);
        responseFiveD = (CheckBox) findViewById(R.id.question_five_response_d);
        responseFiveE = (CheckBox) findViewById(R.id.question_five_response_e);
        responseFiveF = (CheckBox) findViewById(R.id.question_five_response_f);

        responseSixA = (CheckBox) findViewById(R.id.question_six_response_a);
        responseSixB = (CheckBox) findViewById(R.id.question_six_response_b);
        responseSixC = (CheckBox) findViewById(R.id.question_six_response_c);
        responseSixD = (CheckBox) findViewById(R.id.question_six_response_d);
        responseSixE = (CheckBox) findViewById(R.id.question_six_response_e);
        responseSixF = (CheckBox) findViewById(R.id.question_six_response_f);

        responseSevenA = (CheckBox) findViewById(R.id.question_seven_response_a);
        responseSevenB = (CheckBox) findViewById(R.id.question_seven_response_b);
        responseSevenC = (CheckBox) findViewById(R.id.question_seven_response_c);
        responseSevenD = (CheckBox) findViewById(R.id.question_seven_response_d);

        responseEightA = (CheckBox) findViewById(R.id.question_eight_response_a);
        responseEightB = (CheckBox) findViewById(R.id.question_eight_response_b);
        responseEightC = (CheckBox) findViewById(R.id.question_eight_response_c);
        responseEightD = (CheckBox) findViewById(R.id.question_eight_response_d);
        responseEightE = (CheckBox) findViewById(R.id.question_eight_response_e);
        responseEightF = (CheckBox) findViewById(R.id.question_eight_response_f);

        responseNineA = (CheckBox) findViewById(R.id.question_nine_response_a);
        responseNineB = (CheckBox) findViewById(R.id.question_nine_response_b);
        responseNineC = (CheckBox) findViewById(R.id.question_nine_response_c);
        responseNineD = (CheckBox) findViewById(R.id.question_nine_response_d);

        //initiate Switch
        responseTen = (Switch) findViewById(R.id.question_ten_switch);

    }

    public void quizResults(View view) {

        String name = quizPlayer.getText().toString();

        //One point for a corrected answer in question one
        if (responseOneA.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question two
        if (responseTwoB.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question three
        if (responseThreeD.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question four
        if (responseFourB.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question five
        if (responseFiveA.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question six
        if (responseSixD.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question seven
        if (responseSevenC.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question eight
        if (responseEightC.isChecked()) {
            score = score + 1;
        }
        //One point for a corrected answer in question nine
        if (responseNineC.isChecked()) {
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
            Toast.makeText(this, scoreMessage, Toast.LENGTH_LONG).show();
            final MediaPlayer ring = MediaPlayer.create(this, R.raw.lost);
            ring.start();
        }

        //Prevents adding points to score if the user keep pressing Results button
        score = 0;
    }

    public void onReset(View view) {

        //Resets score
        score = 0;

        //Resets Name of the user
        quizPlayer.setText("");

        //Unchecked everything on this view
        if (responseOneA.isChecked())
            responseOneA.toggle();
        if (responseOneB.isChecked())
            responseOneB.toggle();
        if (responseOneC.isChecked())
            responseOneC.toggle();
        if (responseOneD.isChecked())
            responseOneD.toggle();
        if (responseOneE.isChecked())
            responseOneE.toggle();
        if (responseOneF.isChecked())
            responseOneF.toggle();
        if (responseTwoA.isChecked())
            responseTwoA.toggle();
        if (responseTwoB.isChecked())
            responseTwoB.toggle();
        if (responseTwoC.isChecked())
            responseTwoC.toggle();
        if (responseTwoD.isChecked())
            responseTwoD.toggle();
        if (responseTwoE.isChecked())
            responseTwoE.toggle();
        if (responseTwoF.isChecked())
            responseTwoF.toggle();
        if (responseThreeA.isChecked())
            responseThreeA.setChecked(false);
        if (responseThreeB.isChecked())
            responseThreeB.setChecked(false);
        if (responseThreeC.isChecked())
            responseThreeC.setChecked(false);
        if (responseThreeD.isChecked())
            responseThreeD.setChecked(false);
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
        if (responseFiveD.isChecked())
            responseFiveD.toggle();
        if (responseFiveE.isChecked())
            responseFiveE.toggle();
        if (responseFiveF.isChecked())
            responseFiveF.toggle();
        if (responseSixA.isChecked())
            responseSixA.toggle();
        if (responseSixB.isChecked())
            responseSixB.toggle();
        if (responseSixC.isChecked())
            responseSixC.toggle();
        if (responseSixD.isChecked())
            responseSixD.toggle();
        if (responseSixE.isChecked())
            responseSixE.toggle();
        if (responseSixF.isChecked())
            responseSixF.toggle();
        if (responseSevenA.isChecked())
            responseSevenA.toggle();
        if (responseSevenB.isChecked())
            responseSevenB.toggle();
        if (responseSevenC.isChecked())
            responseSevenC.toggle();
        if (responseSevenD.isChecked())
            responseSevenD.toggle();
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
        if (responseNineD.isChecked())
            responseNineD.toggle();
        if (responseTen.isChecked())
            responseTen.toggle();

        //Start Over and go to the username field
        recreate();

        //Play reset tone
        final MediaPlayer ring = MediaPlayer.create(this, R.raw.reset);
        ring.start();
    }
}
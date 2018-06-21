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
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText quizPlayer, questionThreeResponse;
    TextView questionOne, questionTwo, questionThree, questionFour, questionFive, questionSix;
    TextView questionSeven, questionEight, questionNine, questionTen;
    RadioButton responseOneA, responseOneB, responseOneC, responseOneD, responseOneE, responseOneF;
    RadioButton responseTwoA, responseTwoB, responseTwoC, responseTwoD, responseTwoE, responseTwoF;
    CheckBox responseFourA, responseFourB, responseFourC, responseFourD, responseFourE, responseFourF;
    CheckBox responseFiveA, responseFiveB, responseFiveC, responseFiveD, responseFiveE, responseFiveF;
    RadioButton responseSixA, responseSixB, responseSixC, responseSixD, responseSixE, responseSixF;
    RadioButton responseSevenA, responseSevenB, responseSevenC, responseSevenD;
    CheckBox responseEightA, responseEightB, responseEightC, responseEightD, responseEightE, responseEightF;
    RadioButton responseNineA, responseNineB, responseNineC, responseNineD;
    Switch responseTen;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a handle to all user interface elements
        final Button button = (Button) findViewById(R.id.button_results);
        final Button button2 = (Button) findViewById(R.id.button_reset);
        quizPlayer = (EditText) findViewById(R.id.quiz_name);
        questionThreeResponse = (EditText) findViewById((R.id.question_three_response));
        
        //Check for null prior to retrieving the value, set value == 0 if this field is empty
        if (questionThreeResponse.getText() != null) {
            questionThreeResponse.setText("0");
        }

        // Setup event handlers (result button)
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name = quizPlayer.getText().toString();

                //Converting EditText to Int
                String response = questionThreeResponse.getText().toString();
                int finalResponse = Integer.parseInt(response);

                //One point for a corrected answer in question one
                if (responseOneA.isChecked()) {
                    score = score + 1;
                }
                //One point for a corrected answer in question two
                if (responseTwoB.isChecked()) {
                    score = score + 1;
                }
                //One point for a corrected answer in question three
                if (finalResponse == 3) {
                    score = score + 1;
                }
                //One point for a corrected answer in question four
                if (responseFourB.isChecked() && responseFourE.isChecked() && !responseFourA.isChecked()
                        && !responseFourC.isChecked() && !responseFourD.isChecked() && !responseFourF.isChecked()) {
                    score = score + 1;
                }
                //One point for a corrected answer in question five
                if (responseFiveA.isChecked() && responseFiveF.isChecked()&& !responseFiveB.isChecked()
                        && !responseFiveC.isChecked() && !responseFiveD.isChecked() && !responseFiveE.isChecked()) {
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
                if (responseEightC.isChecked() && responseEightE.isChecked()&& !responseEightA.isChecked()
                        && !responseEightB.isChecked() && !responseEightD.isChecked() && !responseEightF.isChecked()) {
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
                String msg="";
                if (score >= 5) {
                    msg = getString(R.string.winner);
                } else {
                    msg = getString(R.string.loser);
                }
                String scoreMessage = msg + "\n" + name + "\n" + getString(R.string.score) + " " + score;
                Toast.makeText(getApplicationContext() , scoreMessage, Toast.LENGTH_LONG).show();
                final MediaPlayer ring = MediaPlayer.create(getApplicationContext(), R.raw.tada);
                ring.start();

                //Prevents adding points to score if the user keep pressing Results button
                score = 0;
            }
        });

        // Setup event handlers (reset button)
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //Resets score
                score = 0;

                //Resets Name of the user
                quizPlayer.setText("");

                //Resets response number three
                questionThreeResponse.setText("0");

                //Unchecked everything on this view
                if (responseOneA.isChecked())
                    responseOneA.setChecked(false);
                if (responseOneB.isChecked())
                    responseOneB.setChecked(false);
                if (responseOneC.isChecked())
                    responseOneC.setChecked(false);
                if (responseOneD.isChecked())
                    responseOneD.setChecked(false);
                if (responseOneE.isChecked())
                    responseOneE.setChecked(false);
                if (responseOneF.isChecked())
                    responseOneF.setChecked(false);
                if (responseTwoA.isChecked())
                    responseTwoA.setChecked(false);
                if (responseTwoB.isChecked())
                    responseTwoB.setChecked(false);
                if (responseTwoC.isChecked())
                    responseTwoC.setChecked(false);
                if (responseTwoD.isChecked())
                    responseTwoD.setChecked(false);
                if (responseTwoE.isChecked())
                    responseTwoE.setChecked(false);
                if (responseTwoF.isChecked())
                    responseTwoF.setChecked(false);
                if (responseFourA.isChecked())
                    responseFourA.toggle();
                if (responseFourB.isChecked())
                    responseFourB.toggle();
                if (responseFourC.isChecked())
                    responseFourC.toggle();
                if (responseFourD.isChecked())
                    responseFourD.toggle();
                if (responseFourE.isChecked())
                    responseFourE.toggle();
                if (responseFourF.isChecked())
                    responseFourF.toggle();
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
                    responseSixA.setChecked(false);
                if (responseSixB.isChecked())
                    responseSixB.setChecked(false);
                if (responseSixC.isChecked())
                    responseSixC.setChecked(false);
                if (responseSixD.isChecked())
                    responseSixD.setChecked(false);
                if (responseSixE.isChecked())
                    responseSixE.setChecked(false);
                if (responseSixF.isChecked())
                    responseSixF.setChecked(false);
                if (responseSevenA.isChecked())
                    responseSevenA.setChecked(false);
                if (responseSevenB.isChecked())
                    responseSevenB.setChecked(false);
                if (responseSevenC.isChecked())
                    responseSevenC.setChecked(false);
                if (responseSevenD.isChecked())
                    responseSevenD.setChecked(false);
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
                    responseNineA.setChecked(false);
                if (responseNineB.isChecked())
                    responseNineB.setChecked(false);
                if (responseNineC.isChecked())
                    responseNineC.setChecked(false);
                if (responseNineD.isChecked())
                    responseNineD.setChecked(false);
                if (responseTen.isChecked())
                    responseTen.toggle();

                //Start Over and go to the username field
                recreate();

                //Play reset tone
                final MediaPlayer ring = MediaPlayer.create(getApplicationContext(), R.raw.reset);
                ring.start();
            }
        });

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
        responseOneA = (RadioButton) findViewById(R.id.question_one_response_a);
        responseOneB = (RadioButton) findViewById(R.id.question_one_response_b);
        responseOneC = (RadioButton) findViewById(R.id.question_one_response_c);
        responseOneD = (RadioButton) findViewById(R.id.question_one_response_d);
        responseOneE = (RadioButton) findViewById(R.id.question_one_response_e);
        responseOneF = (RadioButton) findViewById(R.id.question_one_response_f);

        responseTwoA = (RadioButton) findViewById(R.id.question_two_response_a);
        responseTwoB = (RadioButton) findViewById(R.id.question_two_response_b);
        responseTwoC = (RadioButton) findViewById(R.id.question_two_response_c);
        responseTwoD = (RadioButton) findViewById(R.id.question_two_response_d);
        responseTwoE = (RadioButton) findViewById(R.id.question_two_response_e);
        responseTwoF = (RadioButton) findViewById(R.id.question_two_response_f);

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

        responseSixA = (RadioButton) findViewById(R.id.question_six_response_a);
        responseSixB = (RadioButton) findViewById(R.id.question_six_response_b);
        responseSixC = (RadioButton) findViewById(R.id.question_six_response_c);
        responseSixD = (RadioButton) findViewById(R.id.question_six_response_d);
        responseSixE = (RadioButton) findViewById(R.id.question_six_response_e);
        responseSixF = (RadioButton) findViewById(R.id.question_six_response_f);

        responseSevenA = (RadioButton) findViewById(R.id.question_seven_response_a);
        responseSevenB = (RadioButton) findViewById(R.id.question_seven_response_b);
        responseSevenC = (RadioButton) findViewById(R.id.question_seven_response_c);
        responseSevenD = (RadioButton) findViewById(R.id.question_seven_response_d);

        responseEightA = (CheckBox) findViewById(R.id.question_eight_response_a);
        responseEightB = (CheckBox) findViewById(R.id.question_eight_response_b);
        responseEightC = (CheckBox) findViewById(R.id.question_eight_response_c);
        responseEightD = (CheckBox) findViewById(R.id.question_eight_response_d);
        responseEightE = (CheckBox) findViewById(R.id.question_eight_response_e);
        responseEightF = (CheckBox) findViewById(R.id.question_eight_response_f);

        responseNineA = (RadioButton) findViewById(R.id.question_nine_response_a);
        responseNineB = (RadioButton) findViewById(R.id.question_nine_response_b);
        responseNineC = (RadioButton) findViewById(R.id.question_nine_response_c);
        responseNineD = (RadioButton) findViewById(R.id.question_nine_response_d);

        //initiate Switch
        responseTen = (Switch) findViewById(R.id.question_ten_switch);
    }
}

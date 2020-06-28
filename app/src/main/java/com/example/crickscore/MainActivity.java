package com.example.crickscore;

import androidx.appcompat.app.AppCompatActivity;


//import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public int scoreTeamA=0;
    public int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DisplayForTeamA(scoreTeamA);
        DisplayForTeamB(scoreTeamB);
    }

    
    // score update
    public void DisplayForTeamA(int score){
        TextView scoreview=(TextView) findViewById(R.id.adding_score);
        scoreview.setText(String.valueOf(score)+" For A");
    }

    public void DisplayForTeamB(int score){
        TextView scoreview=(TextView) findViewById(R.id.adding_score);
        scoreview.setText(String.valueOf(score)+" For B");
    }

    public void Add_score(View v){
        TextView scoreview=(TextView) findViewById(R.id.adding_score);
        String text= (String) scoreview.getText();
        char team=text.charAt(text.length() - 1);
        int score=Character.getNumericValue(text.charAt(0));


        if(team == 'A') {
            scoreTeamA=scoreTeamA+score;
            TextView scoreviewA=(TextView) findViewById(R.id.team_a_score);
            scoreviewA.setText(String.valueOf(scoreTeamA));
            scoreview.setText("0");
        }else {
            scoreTeamB=scoreTeamB+score;
            TextView scoreviewB=(TextView) findViewById(R.id.team_b_score);
            scoreviewB.setText(String.valueOf(scoreTeamB));
            scoreview.setText("0");
        }

    }


    public void oneRun(View v){
//        scoreTeamA=scoreTeamA+1;
        DisplayForTeamA(1);
    }

    public void twoRun(View v){
//        scoreTeamA=scoreTeamA+2;
        DisplayForTeamA(2);
    }
    public void threeRun(View v){
//        scoreTeamA=scoreTeamA+3;
        DisplayForTeamA(3);    }
    public void fourRun(View v){
//        scoreTeamA=scoreTeamA+4;
        DisplayForTeamA(4);    }
    public void fiveRun(View v){
//        scoreTeamA=scoreTeamA+5;
        DisplayForTeamA(5);    }
    public void sixRun(View v){
//        scoreTeamA=scoreTeamA+6;
        DisplayForTeamA(6);    }

    public void oneRunb(View v){
//        scoreTeamB=scoreTeamB+1;
        DisplayForTeamB(1);
    }
    public void twoRunb(View v){
//        scoreTeamB=scoreTeamB+2;
        DisplayForTeamB(3);
    }
    public void threeRunb(View v){
//        scoreTeamB=scoreTeamB+3;
        DisplayForTeamB(3);
    }

    public void fourRunb(View v){
//        scoreTeamB=scoreTeamB+4;
        DisplayForTeamB(4);
    }

    public void fiveRunb(View v){
//        scoreTeamB=scoreTeamB+5;
        DisplayForTeamB(5);
    }

    public void sixRunb(View v){
//        scoreTeamB=scoreTeamB+6;
        DisplayForTeamB(6);
    }
}
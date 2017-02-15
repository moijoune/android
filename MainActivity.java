package com.android.example.snooker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score1 = 0, score2 = 0;
    int score1p = 0, score2p = 0;
    int score1n = 0, score2n = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view){
        TextView winner = (TextView) findViewById(R.id.winner);
        switch(view.getId()){
            case R.id.red1:
                winner.setText("");
                score1p = score1;
                score1++;
                score1n = score1;
                break;
            case R.id.red2:
                winner.setText("");
                score2p = score2;
                score2++;
                score2n = score2;
                break;
            case R.id.yellow1:
                winner.setText("");
                score1p = score1;
                score1 += 2;
                score1n = score1;
                break;
            case R.id.yellow2:
                winner.setText("");
                score2p = score2;
                score2 += 2;
                score2n = score2;
                break;
            case R.id.green1:
                winner.setText("");
                score1p = score1;
                score1 += 3;
                score1n = score1;
                break;
            case R.id.green2:
                winner.setText("");
                score2p = score2;
                score2 += 3;
                score2n = score2;
                break;
            case R.id.brown1:
                winner.setText("");
                score1p = score1;
                score1 += 4;
                score1n = score1;
                break;
            case R.id.brown2:
                winner.setText("");
                score2p = score2;
                score2 += 4;
                score2n = score2;
                break;
            case R.id.blue1:
                winner.setText("");
                score1p = score1;
                score1 += 5;
                score1n = score1;
                break;
            case R.id.blue2:
                winner.setText("");
                score2p = score2;
                score2 += 5;
                score2n = score2;
                break;
            case R.id.pink1:
                winner.setText("");
                score1p = score1;
                score1 += 6;
                score1n = score1;
                break;
            case R.id.pink2:
                winner.setText("");
                score2p = score2;
                score2 += 6;
                score2n = score2;
                break;
            case R.id.black1:
                winner.setText("");
                score1p = score1;
                score1 += 7;
                score1n = score1;
                break;
            case R.id.black2:
                winner.setText("");
                score2p = score2;
                score2 += 7;
                score2n = score2;
                break;
            case R.id.undo1:
                winner.setText("");
                score1n = score1;
                score1 = score1p;
                break;
            case R.id.redo1:
                winner.setText("");
                score1p = score1;
                score1 = score1n;
                break;
            case R.id.undo2:
                winner.setText("");
                score2n = score2;
                score2 = score2p;
                break;
            case R.id.redo2:
                winner.setText("");
                score2p = score2;
                score2 = score2n;
                break;
            case R.id.fourPoints1:
                winner.setText("");
                score1p = score1;
                score1 += 4;
                score1n = score1;
                break;
            case R.id.fourPoints2:
                winner.setText("");
                score2p = score2;
                score2 += 4;
                score2n = score2;
                break;
            case R.id.restart:
                displayWinner();
                score1p = 0;
                score2p = 0;
                score1n = 0;
                score2n = 0;
                score1 = 0;
                score2 = 0;
                break;
        }
        displayScore(score1,score2);
    }

    private void displayScore(int s1, int s2){
        TextView p1 = (TextView) findViewById(R.id.displayScore1);
        TextView p2 = (TextView) findViewById(R.id.displayScore2);
        p1.setText(String.valueOf(s1));
        p2.setText(String.valueOf(s2));
    }

    private void displayWinner(){
        TextView winner = (TextView) findViewById(R.id.winner);
        String p1 = getString(R.string.player1);
        String p2 = getString(R.string.player2);
        if(score1 != 0 || score2 != 0) {
            if (score1 > score2)
                winner.setText("THE WINNER IS:\n" + p1);
            else if (score2 > score1)
                winner.setText("THE WINNER IS:\n" + p2);
            else
                winner.setText("THE GAME WAS A DRAW");
        }
        else
            winner.setText("");

    }
}

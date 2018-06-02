package com.ngoc_vx.footballscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // track information team A
    int goalTeamA = 0;
    int redCardTeamA = 0;
    int yellowCardTeamA = 0;
    int cornerTeamA = 0;
    int foulTeamA = 0;

    // track information team B
    int goalTeamB = 0;
    int redCardTeamB = 0;
    int yellowCardTeamB = 0;
    int cornerTeamB = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addGoalForTeamA(View view) {
        goalTeamA = goalTeamA + 1;
        displayGoalForTeamA(goalTeamA);
    }

    private void displayGoalForTeamA(int goal) {
        TextView goalView = findViewById(R.id.team_a_goal);
        goalView.setText(String.valueOf(goal));
    }

    public void addGoalForTeamB(View view) {
        goalTeamB = goalTeamB + 1;
        displayGoalForTeamB(goalTeamB);
    }

    private void displayGoalForTeamB(int goal) {
        TextView goalView = findViewById(R.id.team_b_goal);
        goalView.setText(String.valueOf(goalTeamB));
    }

    public void addRedCardForTeamA(View view) {
        redCardTeamA += 1;
        displayRedCardForTeamA(redCardTeamA);
    }

    private void displayRedCardForTeamA(int card) {
        TextView redCardView = findViewById(R.id.team_a_red_card);
        redCardView.setText(String.valueOf(card));
    }

    public void addRedCardForTeamB(View view) {
        redCardTeamB += 1;
        displayRedCardForTeamB(redCardTeamB);
    }

    private void displayRedCardForTeamB(int card) {
        TextView redCardView = findViewById(R.id.team_b_red_card);
        redCardView.setText(String.valueOf(card));
    }

    public void addYellowCardForTeamA(View view) {
        yellowCardTeamA += 1;
        displayYellowCardForTeamA(yellowCardTeamA);
    }

    private void displayYellowCardForTeamA(int card) {
        TextView yellowCardView = findViewById(R.id.team_a_yellow_card);
        yellowCardView.setText(String.valueOf(card));
    }

    public void addYellowCardForTeamB(View view) {
        yellowCardTeamB += 1;
        displayYellowCardForTeamB(yellowCardTeamB);
    }

    private void displayYellowCardForTeamB(int card) {
        TextView yellowCardView = findViewById(R.id.team_b_yellow_card);
        yellowCardView.setText(String.valueOf(card));
    }

    public void addCornerForTeamA(View view) {
        cornerTeamA += 1;
        displayCornerForTeamA(cornerTeamA);
    }

    private void displayCornerForTeamA(int corner) {
        TextView cornerView = findViewById(R.id.team_a_corner);
        cornerView.setText(String.valueOf(corner));
    }

    public void addCornerForTeamB(View view) {
        cornerTeamB += 1;
        displayCornerForTeamB(cornerTeamB);
    }

    private void displayCornerForTeamB(int corner) {
        TextView cornerView = findViewById(R.id.team_b_corner);
        cornerView.setText(String.valueOf(corner));
    }

    public void addFoulForTeamA(View view) {
        foulTeamA += 1;
        displayFoulForTeamA(foulTeamA);
    }

    private void displayFoulForTeamA(int foul) {
        TextView foulView = findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    public void addFoulForTeamB(View view) {
        foulTeamB += 1;
        displayFoulForTeamB(foulTeamB);
    }

    private void displayFoulForTeamB(int foul) {
        TextView foulView = findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }

    public void resetAllInformation(View view) {
        // information team A
        goalTeamA = 0;
        redCardTeamA = 0;
        yellowCardTeamA = 0;
        cornerTeamA = 0;
        foulTeamA = 0;

        displayGoalForTeamA(goalTeamA);
        displayRedCardForTeamA(redCardTeamA);
        displayYellowCardForTeamA(yellowCardTeamA);
        displayCornerForTeamA(cornerTeamA);
        displayFoulForTeamA(foulTeamA);

        // information team B
        goalTeamB = 0;
        redCardTeamB = 0;
        yellowCardTeamB = 0;
        cornerTeamB = 0;
        foulTeamB = 0;

        displayGoalForTeamB(goalTeamB);
        displayRedCardForTeamB(redCardTeamB);
        displayYellowCardForTeamB(yellowCardTeamB);
        displayCornerForTeamB(cornerTeamB);
        displayFoulForTeamB(foulTeamB);
    }
}

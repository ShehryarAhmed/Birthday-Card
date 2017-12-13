package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int num;
    public void PlusThreePoints(View view) {
        num+=3;
        display(num);
    }
    public void PlusTwoPoints(View view) {
        num+=2;
        display(num);
    }
    public void FreeThrow(View view) {
        num++;
        display(num);
    }
    private void display(int num){
        TextView textView = (TextView) findViewById(R.id.teamA);
        textView.setText(""+num);
    }
    int numB;
    public void PlusThreePointsB(View view) {
        numB+=3;
        displayB(numB);
    }
    public void PlusTwoPointsB(View view) {
        numB+=2;
        displayB(numB);
    }
    public void FreeThrowB(View view) {
        numB++;
        displayB(numB);
    }
    private void displayB(int numB){
        TextView textView = (TextView) findViewById(R.id.teamB);
        textView.setText(""+numB);
    }
    public void reset(View view){
        TextView textViewB = (TextView) findViewById(R.id.teamB);
        TextView textViewA = (TextView) findViewById(R.id.teamA);
        num=0;
        numB=0;
        textViewA.setText("00");
        textViewB.setText("00");


    }
}

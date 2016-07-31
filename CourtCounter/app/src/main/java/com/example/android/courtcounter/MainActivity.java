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
        textView.setText(num);
    }
}

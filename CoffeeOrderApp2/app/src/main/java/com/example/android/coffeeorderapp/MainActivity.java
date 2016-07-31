package com.example.android.coffeeorderapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.text.StringCharacterIterator;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    int num ;
    public void Increment(View view){
        num++;
        display(num);
    }
    public void Decrement(View view){
        num--;
        if(num<0){
            num = 0;
        }
        display(num);
    }
    public void submitOrder(View view) {
        int price = num * 5;
        String order = "Total: $"+price + "\nThank You!";
       displayMessage(order);
    }
    private void displayMessage(String str){
        TextView PriceMessage = (TextView) findViewById(R.id.FourTextView);
        Toast toast =Toast.makeText(getApplicationContext(),"Please wait",Toast.LENGTH_LONG);
        toast.show();
        toast.setMargin(50,50);
        PriceMessage.setText(str);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.FourTextView);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView SecondTextView = (TextView) findViewById(R.id.SecondTextView);
        SecondTextView.setText("" + number);
    }
}

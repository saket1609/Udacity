package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    public int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitorder(View view) {
        int price = quantity*5;
        String priceMessage ="Total Rs " + price;
        priceMessage =priceMessage+" \nThank you";
        displayMessage(priceMessage);
    }

    private void display(int number) {
        Button button = (Button) findViewById(R.id.button);
        Button button1 = (Button) findViewById(R.id.button_1);
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }

    private void pricedisplay(int number) {
        TextView Price = (TextView) findViewById(R.id.price_text_view);
        Price.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
    public void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
    public void increment(View view) {
            quantity++;
            display(quantity);


        }


    public void decrement(View view) {
             quantity--;
                display(quantity);


    }
}


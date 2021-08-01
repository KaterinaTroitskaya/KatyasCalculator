package com.example.katyascalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onClick(View v) {

    }

    private void initButtonsClickListener() {
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2;
        Button button3 = findViewById(R.id.button_3);
        Button button4 = findViewById(R.id.button_4);
        Button button5 = findViewById(R.id.button_5);
        Button button6 = findViewById(R.id.button_6);
        Button button7 = findViewById(R.id.button_7);
        Button button8 = findViewById(R.id.button_8);
        Button button9 = findViewById(R.id.button_9);
        Button button0 = findViewById(R.id.button_0);
        Button button_plus = findViewById(R.id.button_plus);
        Button button_min = findViewById(R.id.button_minus);
        Button button_multi = findViewById(R.id.button_multi);
        Button button_div = findViewById(R.id.button_div);
        Button button_clear = findViewById(R.id.button_clear);
        Button button_equal = findViewById(R.id.button_equals);
        Button button_dot = findViewById(R.id.button_dot);

        button1.setOnClickListener(numberButtonsClickListener);
        button2.setOnClickListener(numberButtonsClickListener);
        button3.setOnClickListener(numberButtonsClickListener);
        button4.setOnClickListener(numberButtonsClickListener);
        button5.setOnClickListener(numberButtonsClickListener);
        button6.setOnClickListener(numberButtonsClickListener);
        button7.setOnClickListener(numberButtonsClickListener);
        button8.setOnClickListener(numberButtonsClickListener);
        button9.setOnClickListener(numberButtonsClickListener);
        button0.setOnClickListener(numberButtonsClickListener);
        button_clear.setOnClickListener(buttonClearClickListener);
        button_dot.setOnClickListener(buttonDotClickListener);
        button_plus.setOnClickListener(operationPlusButtonsClickListener);
        button_min.setOnClickListener(operationMinusButtonsClickListener);
        button_div.setOnClickListener(operationDivButtonsClickListener);
        button_multi.setOnClickListener(operationMultiButtonsClickListener);
        button_equal.setOnClickListener(equalButtonsClickListener);
    }
    public View.OnClickListener numberButtonsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    public View.OnClickListener buttonClearClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    public View.OnClickListener buttonDotClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    public View.OnClickListener operationPlusButtonsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    public View.OnClickListener operationMinusButtonsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    public View.OnClickListener operationDivButtonsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    public View.OnClickListener operationMultiButtonsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    public View.OnClickListener equalButtonsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };




}
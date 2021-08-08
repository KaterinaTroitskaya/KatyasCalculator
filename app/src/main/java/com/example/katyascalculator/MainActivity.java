package com.example.katyascalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Calculator calculator;
    static String sign = "0";
    private TextView textField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = new Calculator();
        initView();
    }

    private void initView(){
        textField = findViewById(R.id.textField);
        initButtonsClickListener();
    }

    private void initButtonsClickListener() {
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
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
        button_dot.setOnClickListener(numberButtonsClickListener);
        button_plus.setOnClickListener(operationPlusButtonsClickListener);
        button_min.setOnClickListener(operationMinusButtonsClickListener);
        button_div.setOnClickListener(operationDivButtonsClickListener);
        button_multi.setOnClickListener(operationMultiButtonsClickListener);
        button_equal.setOnClickListener(equalButtonsClickListener);
    }
    public View.OnClickListener numberButtonsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button b = (Button)v;
            String buttonText = b.getText().toString();

            textField.append(buttonText);

        }
    };
    public View.OnClickListener buttonClearClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            textField.setText("0.0");
            calculator.first_number = "";
            calculator.second_number = "";
            calculator.result = 0;

        }
    };

    public View.OnClickListener operationPlusButtonsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (calculator.first_number.equals("")) {
                calculator.first_number = textField.getText().toString().trim();
            } else {
                calculator.second_number = textField.getText().toString().trim();
                calculator.first_number = String.valueOf(calculator.result);
            }
            sign = "+";
            textField.setText("");

        }
    };
    public View.OnClickListener operationMinusButtonsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (calculator.first_number.equals("")) {
                calculator.first_number = textField.getText().toString().trim();
            } else {
                calculator.second_number = textField.getText().toString().trim();
                calculator.first_number = String.valueOf(calculator.result);
            }
            sign = "-";
            textField.setText("");

        }
    };
    public View.OnClickListener operationDivButtonsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (calculator.first_number.equals("")) {
                calculator.first_number = textField.getText().toString().trim();
            } else {
                calculator.second_number = textField.getText().toString().trim();
                calculator.first_number = String.valueOf(calculator.result);
            }
            sign = "/";
            textField.setText("");

        }
    };
    public View.OnClickListener operationMultiButtonsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (calculator.first_number.equals("")) {
                calculator.first_number = textField.getText().toString().trim();
            } else {
                calculator.second_number = textField.getText().toString().trim();
                calculator.first_number = String.valueOf(calculator.result);
            }
            sign = "*";
            textField.setText("");

        }
    };
    public View.OnClickListener equalButtonsClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String string = textField.getText().toString().trim();
            if (string.length() == 0) return;
            calculator.first_number = textField.getText().toString().trim();
            if (calculator.first_number.equals("")) return;

            switch (sign) {
                case "+":
                    calculator.Sum();
                    break;

                case "-":
                    calculator.Min();
                    break;

                case "/":
                    calculator.Div();

                    break;

                case "*":
                    calculator.Mult();
                    break;

                default:
                    calculator.result = 0;
            }

            textField.setText((int) calculator.result);

        }
    };

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        calculator.result = Double.parseDouble(textField.getText().toString());
        outState.putParcelable("calculator", calculator);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        calculator = savedInstanceState.getParcelable("calculator");
        textField = findViewById(R.id.textField);
        textField.setText(String.valueOf(calculator.result));
    }


}
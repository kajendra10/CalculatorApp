package com.hfad.calculatorapp;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends Activity {
    public static final String send_answer ="com.hfad.calculator";

    EditText number1;
    EditText number2;
    Button button;
    TextView answer;
    int ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void onClick(View view) {
        number1 = (EditText)findViewById(R.id.num1);
        number2 = (EditText)findViewById(R.id.num2);
        button = (Button)findViewById(R.id.calculate_button);
        answer = (TextView) findViewById(R.id.fin);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());

        int sum =n1 + n2;
        String message = Integer.toString(sum);
        Intent myIntent = new Intent (CalculatorActivity.this, CountActivity.class);
        myIntent.putExtra(send_answer, message);
        startActivity(myIntent);


    }
}
package com.hfad.calculatorapp;
import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;
import android.content.Intent;

public class CountActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        Intent intent = getIntent();
        String message = intent.getStringExtra(CalculatorActivity.send_answer);
        TextView textview = findViewById(R.id.fin);
        textview.setText(message);
    }
}
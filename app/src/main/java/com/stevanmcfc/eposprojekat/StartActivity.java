package com.stevanmcfc.eposprojekat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    Button sum,minus,multi,divide;
    TextView result;
    EditText no1,no2;
    float res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        sum = findViewById(R.id.sum);
        minus = findViewById(R.id.minus);
        multi = findViewById(R.id.multi);
        divide = findViewById(R.id.divide);

        result = findViewById(R.id.result);
        no1 = findViewById(R.id.no1);
        no2 = findViewById(R.id.no2);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = Integer.parseInt(no1.getText().toString()) + Integer.parseInt(no2.getText().toString());
                result.setText(res + "");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = Float.parseFloat(no1.getText().toString()) / Integer.parseInt(no2.getText().toString());
                result.setText(res + "");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = Integer.parseInt(no1.getText().toString()) - Integer.parseInt(no2.getText().toString());
                result.setText(res + "");
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = Integer.parseInt(no1.getText().toString()) * Integer.parseInt(no2.getText().toString());
                result.setText(res + "");
            }
        });



    }



}

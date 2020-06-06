package com.stevanmcfc.eposprojekat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ExpActivity extends AppCompatActivity {

    Button button;
    EditText no;
    EditText ex;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp);

        button = findViewById(R.id.calcuate);
        no = findViewById(R.id.numberExp);
        ex = findViewById(R.id.exponent);
        res = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(Math.pow(Double.parseDouble(no.getText().toString()),Double.parseDouble(ex.getText().toString()))+"");
            }
        });

    }
}

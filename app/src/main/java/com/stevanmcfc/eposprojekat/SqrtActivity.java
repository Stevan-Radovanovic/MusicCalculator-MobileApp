package com.stevanmcfc.eposprojekat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SqrtActivity extends AppCompatActivity {

    Button sqrt;
    EditText number;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqrt);

        sqrt = findViewById(R.id.root);
        number = findViewById(R.id.numberRoot);
        result = findViewById(R.id.resultRoot);

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no = Integer.parseInt(number.getText().toString());
                result.setText(Math.sqrt(no)+"");
            }
        });

    }
}

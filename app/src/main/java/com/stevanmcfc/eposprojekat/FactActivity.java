package com.stevanmcfc.eposprojekat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FactActivity extends AppCompatActivity {

    Button fact;
    EditText number;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact);

        fact = findViewById(R.id.fact);
        number = findViewById(R.id.numberFact);
        result = findViewById(R.id.resultFact);

        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no = Integer.parseInt(number.getText().toString());
                int res=1;
                for(int i=1;i<=no;i++) {
                    res=res*i;
                }
                if(no<0) result.setText("Try Again!"); else result.setText(res + "");
            }
        });



    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class minAB extends AppCompatActivity implements View.OnClickListener {

    EditText txta, txtb;
    Button btnkq;
    TextView txtkq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_ab);

        txta =(EditText) findViewById(R.id.editTexta);
        txtb =(EditText) findViewById(R.id.editTextb);
        txtkq =(TextView) findViewById(R.id.textViewkq);
        btnkq = (Button) findViewById(R.id.buttonkq);

        btnkq.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
       Double a = Double.parseDouble(txta.getText().toString());
       Double b = Double.parseDouble(txtb.getText().toString());
       Double c=0.0;
       if (a < b){
           c =a;
           txtkq.setText("min:"+c.toString());
       } else if (a > b){
           c= b;
           txtkq.setText("min:"+c.toString());
       }
    }
}
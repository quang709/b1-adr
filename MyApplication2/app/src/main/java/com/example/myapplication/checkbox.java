package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class checkbox extends AppCompatActivity {

    CheckBox cba,cbb,cbc;
    Button btnsub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

    anhxa();

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String monhoc = "bạn đã chọn môn học: \n";
                if (cba.isChecked()){
                    monhoc +=cba.getText()+"\n";
                }
                if(cbb.isChecked()){
                    monhoc += cbb.getText()+"\n";
                }
                if(cbc.isChecked()){
                    monhoc += cbc.getText()+"\n";
                }
                Toast.makeText(checkbox.this,monhoc,Toast.LENGTH_LONG).show();
            }
        });
    }

    private void anhxa() {
        cba = (CheckBox) findViewById(R.id.checkBox3);
        cbb = (CheckBox) findViewById(R.id.checkBox4);
        cbc = (CheckBox) findViewById(R.id.checkBox5);

        btnsub = (Button) findViewById(R.id.button);
    }
}
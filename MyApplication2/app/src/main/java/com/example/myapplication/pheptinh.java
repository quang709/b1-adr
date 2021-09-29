package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pheptinh extends AppCompatActivity {

     EditText txta,txtb;
     Button cong,tru,nhan,chia;
     TextView txtkq;
     Double a, b ,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pheptinh);

        txta = (EditText) findViewById(R.id.a);
        txtb = (EditText) findViewById(R.id.b);
        txtkq = (TextView) findViewById(R.id.kq);
        cong = (Button) findViewById(R.id.cong);
        tru = (Button) findViewById(R.id.tru);
        nhan = (Button) findViewById(R.id.nhan);
        chia = (Button) findViewById(R.id.chia);

        Tong();
        Hieu();
        Tich();
        Thuong();

//        cong.setOnClickListener(that);
//        tru.setOnClickListener(that);
//        nhan.setOnClickListener(that);
//        chia.setOnClickListener(that);
    }
//    public View.OnClickListener that = new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Double so1, so2, kq;
//            kq = 0.0;
//            so1 = Double.parseDouble(txta.getText().toString());
//            so2 = Double.parseDouble(txtb.getText().toString());
//            if (view == cong) {
//                kq = so1 + so2;
//            } else if (view == tru) {
//                kq = so1 - so2;
//            } else if (view == nhan) {
//                kq = so1 * so2;
//
//            } else if (view == chia) {
//                kq = so1 / so2;
//            }
//
//        kq=(double)Math.round(kq*100)/100;
//        txtkq.setText(kq.toString());
//    }
//    };

    public void Tong () {
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(txta.getText().toString());
                b = Double.parseDouble(txtb.getText().toString());
                res = a + b;
                txtkq.setText(res.toString());
            }
        });
    }
    public void Hieu () {
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(txta.getText().toString());
                b = Double.parseDouble(txtb.getText().toString());
                res = a - b;
                txtkq.setText(res.toString());
            }
        });
    }
    public void Tich () {
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(txta.getText().toString());
                b = Double.parseDouble(txtb.getText().toString());
                res = a * b;
                txtkq.setText(res.toString());
            }
        });
    }
    public void Thuong () {
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(txta.getText().toString());
                b = Double.parseDouble(txtb.getText().toString());
                res = a / b;
                txtkq.setText(res.toString());
            }
        });
    }

}
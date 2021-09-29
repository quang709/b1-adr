package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ptb2 extends AppCompatActivity {
    EditText txta,txtb,txtc;
    Button btnkq ,btnxoa,btnthoat;
    TextView txtkq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptb2);

        txta = (EditText) findViewById(R.id.a);
        txtb = (EditText) findViewById(R.id.b);
        txtc = (EditText) findViewById(R.id.c);
        btnxoa = (Button) findViewById(R.id.btnxoa);
        btnkq = (Button) findViewById(R.id.btnkq);
        txtkq = (TextView) findViewById(R.id.kq);
        btnthoat =(Button) findViewById(R.id.btnthoat);
         tinh();
         xoa();
         thoat();


    }

    private void thoat() {
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Khoi tao lai Activity main
                Intent intent = new Intent(getApplicationContext(), ptb2.class);
                startActivity(intent);

                // Tao su kien ket thuc app
                Intent startMain = new Intent(Intent.ACTION_MAIN);
                startMain.addCategory(Intent.CATEGORY_HOME);
                startActivity(startMain);
                finish();
            }
        });
    }


    public void tinh() {
        btnkq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a  = Double.parseDouble(txta.getText().toString());
                Double b  = Double.parseDouble(txtb.getText().toString());
                Double c  = Double.parseDouble(txtc.getText().toString());
                Double  x1, x2;
                Double delta = b * b -4 *a*c;
                if (delta < 0){
                    txtkq.setText("pt vô nghiệp");
                }
                else if(delta == 0 ){
                    x1 = x2  = (-b)/(2*a);
                    txtb.setText("pt co nghiem kep:"+ x1);
                }
                else{
                    x1=(-b +Math.sqrt(delta))/(2*a);
                    x2=(-b -Math.sqrt(delta))/(2*a);
                    txtkq.setText("pt co 2 nghiem :\n x1="+x1+"\n x2="+x2);
                }
            }
        });

    }
    public void xoa() {
        btnxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txta.getText().clear();
                txtb.getText().clear();
                txtc.getText().clear();

            }
        });
    }


}

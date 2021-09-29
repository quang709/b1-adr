package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class giaithua extends AppCompatActivity implements View.OnClickListener {

    EditText txtSoN;
    Button btnTinh;
    TextView txtKetqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giaithua);

        txtSoN = (EditText) findViewById(R.id.editNhapn);
        btnTinh = (Button) findViewById(R.id.buttonTinh);
        txtKetqua = (TextView) findViewById(R.id.textViewKetqua);

        btnTinh.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonTinh:
                int n = Integer.parseInt(txtSoN.getText().toString());
                int kq = 1;
                for (int i= 1;i<=n;i++)
                    kq = kq *i;
                    txtKetqua.setText(n+"!="+kq);
                break;
        }
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Btlogin extends AppCompatActivity {
//khai bao
    EditText txtUsername, txtPassword;
    Button btnLogin,btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btlogin);
        //buoc 2  ánh xạ xml sang java
        txtUsername = (EditText) findViewById(R.id.editTextUserName);
        txtPassword = (EditText) findViewById(R.id.editTextPassword);
        btnLogin = (Button) findViewById(R.id.buttonSubmit);
        btnCancel = (Button) findViewById(R.id.buttonCancel);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();
                if(username.equals("admin") && password.equals("admin1234"))
                    Toast.makeText(Btlogin.this,"Dang nhap thanh cong",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(Btlogin.this,"Dang nhap khong thanh cong",Toast.LENGTH_LONG).show();

            }
        });
    }






}

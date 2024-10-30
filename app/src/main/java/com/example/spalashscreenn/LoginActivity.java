package com.example.spalashscreenn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText e1_username,e2_password;
    Button b1_login;

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        e1_username=findViewById(R.id.username);
        e2_password=findViewById(R.id.password);
        b1_login=findViewById(R.id.button);
        txt=findViewById(R.id.sign);

        b1_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1_username.getText().toString().isEmpty()){
                    e1_username.setError("User Name Cannot Be Empty");
                }
                else if (e1_username.getText().toString().length()<5) {
                    e1_username.setError("User Name Must Be Greater Than 5 Letters");
                } else if (e2_password.getText().toString().isEmpty()) {
                    e2_password.setError("Password cannot be Empty");
                } else if (e2_password.getText().toString().length()<5) {
                    e2_password.setError("Password Must be Greater Than 5 Letters");
                }
                else{
                    Intent i=new Intent(LoginActivity.this,HomeActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        });

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
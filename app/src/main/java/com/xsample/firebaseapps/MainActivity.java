package com.xsample.firebaseapps;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    TextInputEditText email,password;
    String emailSt,passwordSt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.EmailAddress);
        password = findViewById(R.id.Password);

        emailSt = Objects.requireNonNull(email.getText()).toString().trim();
        passwordSt = Objects.requireNonNull(password.getText()).toString().trim();


    }

    public void signUp(View view) {
        if(emailSt.isEmpty()){
            email.setError("Please enter a email address");
            email.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(emailSt).matches()){
            email.setError("Please enter a valid email address");
            email.requestFocus();
            return;
        }
        if(passwordSt.isEmpty()){
            password.setError("Please enter a password");
            password.requestFocus();
            return;
        }

    }
}

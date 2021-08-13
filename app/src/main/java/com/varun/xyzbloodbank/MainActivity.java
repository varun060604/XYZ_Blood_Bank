package com.varun.xyzbloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button AdminLogin, UserLogin;
        TextView UserRegistrationTextView;

        AdminLogin = findViewById(R.id.AdminLogin);
        UserLogin = findViewById(R.id.UserLogin);

        UserRegistrationTextView = findViewById(R.id.UserRegistrationTextView);

        AdminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this,AdminLoginPage.class);
                startActivity(intent1);
            }
        });

        UserLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this,UserLoginPage.class);
                startActivity(intent2);
            }
        });

        UserRegistrationTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this,UserRegistrationPage.class);
                startActivity(intent3);
            }
        });
    }
}
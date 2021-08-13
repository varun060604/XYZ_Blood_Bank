package com.varun.xyzbloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserRegistrationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration_page);

        Button UserRegistrationLogin;
        EditText UserRegistrationLoginEmail,UserRegistrationLoginPhoneNumber,UserRegistrationLoginPersonName,UserRegistrationLoginPassword;

        UserRegistrationLogin = findViewById(R.id.UserRegistrationLogin);
        UserRegistrationLoginEmail = findViewById(R.id.UserResistrationLoginEmail);
        UserRegistrationLoginPhoneNumber = findViewById(R.id.UserResistrationLoginPhoneNumber);
        UserRegistrationLoginPersonName = findViewById(R.id.UserResistrationLoginPersonName);
        UserRegistrationLoginPassword = findViewById(R.id.UserResistrationLoginPassword);


        UserRegistrationLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(UserRegistrationLoginEmail.equals("")&&UserRegistrationLoginPhoneNumber.equals("")&&UserRegistrationLoginPersonName.equals("")&&UserRegistrationLoginPassword.equals("")){
                }
                else{
                    Toast.makeText(getApplicationContext(),"Please Fill All The Required Field",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
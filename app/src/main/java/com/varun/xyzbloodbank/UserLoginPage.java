package com.varun.xyzbloodbank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserLoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login_page);

        Button UserLogin;
        EditText UserName1,UserName2,UserName3,UserName4,UserName5,UserPassword1,UserPassword2,UserPassword3,UserPassword4,UserPassword5;

        UserLogin = findViewById(R.id.UserLogin);
        UserName1 = findViewById(R.id.UserLoginPersonName);
        UserName2 = findViewById(R.id.UserLoginPersonName);
        UserName3 = findViewById(R.id.UserLoginPersonName);
        UserName4 = findViewById(R.id.UserLoginPersonName);
        UserName5 = findViewById(R.id.UserLoginPersonName);

        UserPassword1 = findViewById(R.id.UserLoginPassword);
        UserPassword2 = findViewById(R.id.UserLoginPassword);
        UserPassword3 = findViewById(R.id.UserLoginPassword);
        UserPassword4 = findViewById(R.id.UserLoginPassword);
        UserPassword5 = findViewById(R.id.UserLoginPassword);

//        Varun = 1111
//        Deepak = 2222
//        Shubam = 3333
//        Raj = 4444
//        Jay = 5555

        UserLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(UserName1.getText().toString().equals("Varun")||UserName2.getText().toString().equals("Deepak")||UserName3.getText().toString().equals("Shubam")||UserName4.getText().toString().equals("Raj")||UserName5.getText().toString().equals("Jay")&&UserPassword1.getText().toString().equals("1111")||UserPassword2.getText().toString().equals("2222")||UserPassword3.getText().toString().equals("3333")||UserPassword4.getText().toString().equals("4444")||UserPassword5.getText().toString().equals("5555")){
                    Intent intent1 = new Intent(UserLoginPage.this, RecyclerViewPage.class);
                    startActivity(intent1);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
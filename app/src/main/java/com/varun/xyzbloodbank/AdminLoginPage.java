package com.varun.xyzbloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login_page);

        Button AdminLogin;
        EditText AdminLoginPersonName,AdminLoginPassword;

        AdminLogin = findViewById(R.id.AdminLogin);
        AdminLoginPersonName = findViewById(R.id.AdminLoginPersonName);
        AdminLoginPassword = findViewById(R.id.AdminLoginPassword);


        AdminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(AdminLoginPersonName.getText().toString().equals("Admin") && AdminLoginPassword.getText().toString().equals("0000")){

                    String str = AdminLoginPersonName.getText().toString();

                    Intent intent1 = new Intent(AdminLoginPage.this,listview.class);

                    intent1.putExtra("message_Key",str);

                    startActivity(intent1);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
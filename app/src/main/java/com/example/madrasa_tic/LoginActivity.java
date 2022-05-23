package com.example.madrasa_tic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Build;
import android.os.Bundle;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username=(EditText) findViewById(R.id.editUserName);
        password=(EditText) findViewById(R.id.editPassword);
    }
    public void onLoginClick(View view){
        startActivity(new Intent(this,RegisterActivity.class));//animation
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
    }

    public void loginBtn(View view){
        String user=username.getText().toString();
        String pass=password.getText().toString();

        Background bg = new Background(this);
        bg.execute(user,pass);



    }
}
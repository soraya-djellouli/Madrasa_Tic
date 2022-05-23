package com.example.madrasa_tic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;


public class RegisterActivity extends AppCompatActivity {
    Button register;
    EditText username,nom,prenom,email,password,password2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        changeStatusBarColor();
         username = (EditText) findViewById(R.id.editTextUserName);
         nom = (EditText) findViewById(R.id.editTextName);
         prenom = (EditText) findViewById(R.id.editTextName2);
         email = (EditText) findViewById(R.id.editTextEmail);
         password = (EditText) findViewById(R.id.editPassword);
         password2 = (EditText) findViewById(R.id.editConfirmPassword);
         register = findViewById(R.id.cirRegisterButton);
         register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    public void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.register_bk_color));


        }
    }
    public void onLoginClick(View view){
        startActivity(new Intent(this,LoginActivity.class));
        overridePendingTransition(R.anim.slide_in_left, android.R.anim.slide_out_right);

    }


    private void registerNewAccount(String username,String nom,String prenom,String email,String password,String cpassword){
        ProgressDialog progressDialog = new ProgressDialog(RegisterActivity.this);
        progressDialog.setCancelable(false);
        progressDialog.setIndeterminate(false);








    }
}


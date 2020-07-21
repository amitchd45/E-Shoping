package com.solutions.e_shoping.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.solutions.e_shoping.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_email,et_password;
    private TextView tv_forgotPass,tv_noAccount;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
        onClicks();
    }

    private void onClicks() {
        tv_noAccount.setOnClickListener(this);
        tv_forgotPass.setOnClickListener(this);
    }

    private void init() {
        et_email=findViewById(R.id.et_email);
        et_password=findViewById(R.id.et_password);
        tv_forgotPass=findViewById(R.id.tv_forgotPass);
        tv_noAccount=findViewById(R.id.tv_noAccount);
        loginBtn=findViewById(R.id.loginBtn);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_forgotPass:
                startActivity(new Intent(LoginActivity.this,ForgotPasswordActivity.class));
                break;

            case R.id.tv_noAccount:
                startActivity(new Intent(LoginActivity.this,RegisterUserActivity.class));
                break;
        }
    }
}
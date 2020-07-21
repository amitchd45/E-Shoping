package com.solutions.e_shoping.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.solutions.e_shoping.R;

public class ForgotPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imageBtn;
    private EditText et_email;
    private Button recoverBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        init();
        onClicks();

    }

    private void onClicks() {
        imageBtn.setOnClickListener(this);
        recoverBtn.setOnClickListener(this);
    }

    private void init() {
        imageBtn=findViewById(R.id.imageBtn);
        et_email=findViewById(R.id.et_email);
        recoverBtn=findViewById(R.id.recoverBtn);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageBtn:
                onBackPressed();
                break;

            case R.id.recoverBtn:

                break;
        }
    }
}
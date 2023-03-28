package com.example.hw_2_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private EditText loginMail;
    private EditText password;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginMail = findViewById(R.id.login_mail);
        password = findViewById(R.id.password);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().equals("admin") && loginMail.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();
                    password.setText(null);
                    loginMail.setText(null);
                }


            }

        });

        loginMail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(loginMail.getText().toString().length() >= 1 && password.getText().toString().length() >=1) {
                    btn.setBackgroundColor(btn.getContext().getResources().getColor(R.color.orange));
                }else {
                    btn.setBackgroundColor(btn.getContext().getResources().getColor(R.color.grey));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {


            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(loginMail.getText().toString().length() >= 1 && password.getText().toString().length() >=1) {
                    btn.setBackgroundColor(btn.getContext().getResources().getColor(R.color.orange));
                }else {
                    btn.setBackgroundColor(btn.getContext().getResources().getColor(R.color.grey));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {


            }
        });
//        if (password.getText().toString().equals(null) && loginMail.getText().toString().equals(null)) {
//            btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
//        } else {
//            btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
//        }
    }
}
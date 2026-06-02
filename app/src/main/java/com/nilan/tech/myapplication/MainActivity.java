package com.nilan.tech.myapplication;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        EditText email = findViewById(R.id.editTextTextEmailAddress);
        EditText password = findViewById(R.id.editTextNumberPassword);
        TextView title = findViewById(R.id.titleText);
        Button submit = findViewById(R.id.button);
        TextView forgotPassword = findViewById(R.id.forgetPasswordTxtView);


        Editable emailStr = email.getText();
        String emailHintStr = email.getHint().toString();
        String passwordStr = password.getText().toString();
        String titleStr = title.getText().toString();

        System.out.println("emailHintStr: "+ emailHintStr);
        System.out.println("emailStr: "+ emailStr);
        System.out.println("passwordStr: "+ passwordStr);
        System.out.println("titleStr: "+ titleStr);

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                System.out.println("MainActivity.afterTextChanged");
                System.out.println("editable = " + editable);
                if (editable.length() < 6) {
                    email.setError("must be greater 5 letters");
                }
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                System.out.println("MainActivity.beforeTextChanged");
                System.out.println("charSequence = " + charSequence + ", i = " + i + ", i1 = " + i1 + ", i2 = " + i2);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                System.out.println("MainActivity.onTextChanged");
                System.out.println("charSequence = " + charSequence + ", i = " + i + ", i1 = " + i1 + ", i2 = " + i2);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("MainActivity.onClick");
                String emailStr = email.getText().toString();
                String passwordStr = password.getText().toString();

                System.out.println(emailStr);
                System.out.println(passwordStr);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("submit.onClick");
                String emailStr = email.getText().toString();
                String passwordStr = password.getText().toString();

                System.out.println(emailStr);
                System.out.println(passwordStr);
            }
        });

        forgotPassword.setOnClickListener(view -> {
            System.out.println("forgotPassword.onClick");
        });


    }
}
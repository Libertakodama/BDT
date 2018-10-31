package com.bdt.bdt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButtonLogIn();
        getInfoSignUp();
    }

    public void getInfoSignUp() {
        final Button bSignUp = findViewById(R.id.b_sign_up);
        final String redColor = "#ffcc0000";
        bSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etFirstName = findViewById(R.id.et_first_name);
                EditText etLastName = findViewById(R.id.et_Last_name);
                EditText etEmail = findViewById(R.id.et_email);
                EditText etPass = findViewById(R.id.et_password);
                TextView tvPlsFirstName = findViewById(R.id.tv_pls_firstname);
                TextView tvPlsLastName = findViewById(R.id.tv_pls_lastname);
                TextView tvPlsEmail = findViewById(R.id.tv_pls_email);
                TextView tvPlsPassword = findViewById(R.id.tv_pls_password);

                String fName = etFirstName.getText().toString();
                String lName = etLastName.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPass.getText().toString();
                if (fName.isEmpty()) {
                    tvPlsFirstName.setVisibility(View.VISIBLE);
                } else {
                    tvPlsFirstName.setVisibility(View.GONE);
                }
                if(lName.isEmpty()) {
                    tvPlsLastName.setVisibility(View.VISIBLE);
                } else {
                    tvPlsLastName.setVisibility(View.GONE);
                }
                if(email.isEmpty()) {
                    tvPlsEmail.setVisibility(View.VISIBLE);
                } else {
                    tvPlsEmail.setVisibility(View.GONE);
                }
                if(password.isEmpty()) {
                    //TODO: Setcolor rouge
                    tvPlsPassword.setText("Please enter a password");
                    //tvPlsPassword.setTextColor(redColor);
                } else {
                    tvPlsPassword.setVisibility(View.GONE);
                }
            }
        });
    }

    public void setButtonLogIn() {

        final TextView tvSignUp = findViewById(R.id.tv_log_in);
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LogInActivity.class));
            }
        });
    }
}

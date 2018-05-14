package com.example.shahryarahmed.onlinebloodbank.Main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import com.example.shahryarahmed.onlinebloodbank.R;
import com.example.shahryarahmed.onlinebloodbank.Staff.Staff;
import com.example.shahryarahmed.onlinebloodbank.User.User;

import javax.security.auth.login.LoginException;

public class Main extends AppCompatActivity implements Contract.Main {

    Button userButton;
    Button staffButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);
        views();
        initialize();
    }


    @Override
    public void views() {

        userButton = findViewById(R.id.contUser);
        staffButton= findViewById(R.id.contStaff);

    }

    @Override
    public void initialize() {

        userButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("button","working");
                Intent user=new Intent(getBaseContext(),User.class);
                startActivity(user);
            }
        });


        staffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent user=new Intent(getBaseContext(),Staff.class);
                startActivity(user);
            }
        });


    }
}

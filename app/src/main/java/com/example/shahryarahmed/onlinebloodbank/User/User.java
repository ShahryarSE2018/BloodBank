package com.example.shahryarahmed.onlinebloodbank.User;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.shahryarahmed.onlinebloodbank.R;
import com.example.shahryarahmed.onlinebloodbank.Registration.UserRegistration;

import org.w3c.dom.Text;

public class User extends AppCompatActivity implements Contract.UserView {

    TextView createAccountText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user2);
        views();
        initialization();
    }

    @Override
    public void views() {

        createAccountText = findViewById(R.id.createAccountText);

    }

    @Override
    public void initialization() {

        createAccountText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getBaseContext(), UserRegistration.class);
                startActivity(i);
            }
        });
    }
}

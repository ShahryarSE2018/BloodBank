package com.example.shahryarahmed.onlinebloodbank.Staff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shahryarahmed.onlinebloodbank.BloodBankData.Data;
import com.example.shahryarahmed.onlinebloodbank.R;
import com.example.shahryarahmed.onlinebloodbank.Registration.StaffRegistration;

public class Staff extends AppCompatActivity implements Contract.StaffView {


    private EditText hospitalNameTextField;
    private EditText passwordTextField;
    private TextView createAccountbtn;
    private Button loginButton;

    private Contract.StaffPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
        views();
        initialize();
    }

    @Override
    public void views() {
        createAccountbtn = findViewById(R.id.createAccountText);
        loginButton=findViewById(R.id.loginBtn);
        hospitalNameTextField = findViewById(R.id.hospitalEditText);
        passwordTextField = findViewById(R.id.passwordEditText);
    }

    @Override
    public void initialize() {
        presenter = new StaffPresenter(this,getApplicationContext());

        createAccountbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getBaseContext(), StaffRegistration.class);
                startActivity(i);
            }
        });


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(presenter.checkIfExist(hospitalNameTextField.getText().toString(),passwordTextField.getText().toString())){

                    Intent i=new Intent(getBaseContext(),Data.class);
                    startActivity(i);
                    finish();
                }else {
                    Toast.makeText(getBaseContext(),"UserName or password is wrong",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}

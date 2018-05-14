package com.example.shahryarahmed.onlinebloodbank.Registration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shahryarahmed.onlinebloodbank.Entities.Staff;
import com.example.shahryarahmed.onlinebloodbank.R;

public class StaffRegistration extends AppCompatActivity implements Contract.RegistrationView{


    private EditText staffNameTextField;
    private EditText bloodBankTextField;
    private EditText locationTextField;
    private EditText emailTextField;
    private EditText passwordTextField;
    private Button createAccountBtn;

    private Contract.RegistrationPresenter presenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_registration);

        bindViews();
        intialization();
    }

    @Override
    public void bindViews() {

        staffNameTextField = findViewById(R.id.staffNameTextField);
        bloodBankTextField = findViewById(R.id.bloodBankNameTextField);
        locationTextField = findViewById(R.id.locationAutoCompleteTextView);
        emailTextField = findViewById(R.id.emailTextField);
        passwordTextField = findViewById(R.id.passwordTextField);
        createAccountBtn = findViewById(R.id.createAccountBtn);

    }

    @Override
    public void intialization() {

        presenter = new RegistrationPresenter(this,getApplicationContext());

        createAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                staffNameTextField.getText();
                bloodBankTextField.getText();
                locationTextField.getText();
                emailTextField.getText();
                passwordTextField.getText();


                Staff staff=new Staff(staffNameTextField.getText().toString(),
                bloodBankTextField.getText().toString(),
                locationTextField.getText().toString(),
                emailTextField.getText().toString(),passwordTextField.getText().toString());

                presenter.setStaffUser(staff);
                Toast.makeText(getBaseContext(),"Successfull",Toast.LENGTH_LONG).show();
                finish();

            }
        });

    }
}

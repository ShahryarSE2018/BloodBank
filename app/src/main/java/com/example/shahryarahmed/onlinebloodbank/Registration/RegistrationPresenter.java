package com.example.shahryarahmed.onlinebloodbank.Registration;

import android.content.Context;

import com.example.shahryarahmed.onlinebloodbank.BloodBankData.*;
import com.example.shahryarahmed.onlinebloodbank.Entities.Staff;

/**
 * Created by Shahryar Ahmed on 4/13/2018.
 */

public class RegistrationPresenter implements Contract.RegistrationPresenter {

    private Contract.RegistrationView registrationView;
    private Contract.RegistrationInteractor interactor;
    private Context context;

    public RegistrationPresenter(Contract.RegistrationView registrationView,Context context) {
        this.registrationView = registrationView;
        this.context = context;

        interactor=new RegistrationInteractor(context);
    }

    @Override
    public void setStaffUser(Staff staffUser) {
        interactor.addStaffToFirebase(staffUser);
    }
}

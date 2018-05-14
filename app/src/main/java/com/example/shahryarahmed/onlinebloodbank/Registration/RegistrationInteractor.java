package com.example.shahryarahmed.onlinebloodbank.Registration;

import android.content.Context;

import com.example.shahryarahmed.onlinebloodbank.Entities.Staff;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Shahryar Ahmed on 4/13/2018.
 */

public class RegistrationInteractor implements Contract.RegistrationInteractor {

    private Context context;

    public RegistrationInteractor(Context context) {
        this.context = context;
    }

    @Override
    public void addUserToFirebase() {

    }

    @Override
    public void addStaffToFirebase(Staff staff) {

        FirebaseDatabase.getInstance().getReference("HospitalStaff").child(staff.getBloodBankName()+"_"+staff.getPassword()).setValue(staff);
    }
}

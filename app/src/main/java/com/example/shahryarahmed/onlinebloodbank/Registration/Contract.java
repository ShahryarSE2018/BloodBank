package com.example.shahryarahmed.onlinebloodbank.Registration;

import com.example.shahryarahmed.onlinebloodbank.Entities.Staff;

/**
 * Created by Shahryar Ahmed on 4/13/2018.
 */

public class Contract {

    interface RegistrationView{

        void bindViews();
        void intialization();

    }

    interface RegistrationPresenter{

        void setStaffUser(Staff staffUser);



    }
    interface RegistrationInteractor{

        void addUserToFirebase();
        void addStaffToFirebase(Staff staff);

    }
}

package com.example.shahryarahmed.onlinebloodbank.Staff;

/**
 * Created by Shahryar Ahmed on 4/13/2018.
 */

public interface Contract {


    interface StaffView{

        void views();
        void initialize();

    }

    interface StaffPresenter{

       void firebaseData(Staff staff);
       boolean checkIfExist(String hospitalName,String hospital);

    }

    interface StaffInteractor{

        boolean checkDataInFirebase(String hospitalName,String password);

    }

}

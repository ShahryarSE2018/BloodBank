package com.example.shahryarahmed.onlinebloodbank.Staff;

import android.content.Context;

/**
 * Created by Shahryar Ahmed on 4/13/2018.
 */

public class StaffPresenter implements Contract.StaffPresenter {

    private Contract.StaffView staffView;
    private Contract.StaffInteractor interactor;

    public StaffPresenter(Contract.StaffView staffView, Context context) {
        this.staffView = staffView;

        interactor =new StaffInteractor(context);


}

    @Override
    public void firebaseData(Staff staff) {

    }

    @Override
    public boolean checkIfExist(String hospitalName,String password) {

       // interactor.checkDataInFirebase(hospitalName,password);
        return interactor.checkDataInFirebase(hospitalName,password);

    }

}

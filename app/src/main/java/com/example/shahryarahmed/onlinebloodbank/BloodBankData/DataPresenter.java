package com.example.shahryarahmed.onlinebloodbank.BloodBankData;

import android.content.Context;

import com.example.shahryarahmed.onlinebloodbank.Entities.BloodData;

/**
 * Created by Shahryar Ahmed on 4/18/2018.
 */

public class DataPresenter implements Contract.DataPresenter{


    Contract.DataView dataView;
    Contract.DataInteractor interactor;

    public DataPresenter(Contract.DataView dataView, Context context) {
        this.dataView = dataView;

        interactor = new DataInteractor(context);
    }

    @Override
    public void setData(BloodData bloodData){
        interactor.setDataToFirebase(bloodData);
    }
}
